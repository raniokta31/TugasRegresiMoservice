import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'membuka browser firefox'
WebUI.openBrowser('')

'maximize window agar full screen'
WebUI.maximizeWindow()

'masuk ke dalam website dev.moservice.id'
WebUI.navigateToUrl(GlobalVariable.url)

'verifikasi bahwa page sudah terload dan ada button untuk masuk'
WebUI.verifyElementClickable(findTestObject('Login/button_masukDaftar'))

'click button masuk / daftar'
WebUI.click(findTestObject('Login/button_masukDaftar'))

'verifikasi popup sudah ada dan textbox untuk input nomor telepon sudah ada'
WebUI.verifyElementVisible(findTestObject('Login/textbox_telepon'))

'cllick field nomor telepon'
WebUI.click(findTestObject('Login/textbox_telepon'))

'isi text nomor telepon dengan salah'
WebUI.setText(findTestObject('Login/textbox_telepon'), 'Testing')

'verifikasi bahwa field password sudah ada'
WebUI.verifyElementVisible(findTestObject('Login/textbox_password'))

'click field password'
WebUI.click(findTestObject('Login/textbox_password'))

'isi password dengan password valid'
WebUI.setText(findTestObject('Login/textbox_password'), GlobalVariable.passwordFaldo)

'verifikasi bahwa button login sudah ada'
WebUI.verifyElementVisible(findTestObject('Login/button_login'))

'click button login'
WebUI.click(findTestObject('Login/button_login'))

'wait time 2 detik untuk loading'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'label error nomor telepon sudah muncul'
WebUI.verifyElementVisible(findTestObject('Login/label_errorTelp'))

'label error login sudah muncul'
WebUI.verifyElementVisible(findTestObject('Login/label_error'))

WebUI.comment('error login dikarenakan field nomor telepon salah format')

