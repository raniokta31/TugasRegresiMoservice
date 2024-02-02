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

'masuk ke url https://dev.moservice.id'
WebUI.navigateToUrl(GlobalVariable.url)

'maximize window'
WebUI.maximizeWindow()

'verifikasi bahwa button masuk / daftar sudah clickable'
WebUI.verifyElementClickable(findTestObject('Login/button_masukDaftar'))

'click button masuk / daftar'
WebUI.click(findTestObject('Login/button_masukDaftar'))

'verifikasi bahwa pop up sudah muncul dan field nomor telepon sudah ada'
WebUI.verifyElementVisible(findTestObject('Login/textbox_telepon'))

'isi field nomor telepon dengan akun yang valid'
WebUI.setText(findTestObject('Login/textbox_telepon'), GlobalVariable.noTelFaldo)

'verifikasi bahwa field password sudah muncul'
WebUI.verifyElementVisible(findTestObject('Login/textbox_password'))

'masukkan password sesuai dengan nomor telepon'
WebUI.setText(findTestObject('Login/textbox_password'), GlobalVariable.passwordJakarta)

'click button eye agar bisa melihat password'
WebUI.click(findTestObject('Login/button_eye'))

'tunggu 3 detik'
WebUI.delay(3)

'click button eye untuk masking password lagi'
WebUI.click(findTestObject('Login/button_eye'))

'tunggu 3 detik'
WebUI.delay(3)

'verifikasi bahwa button masuk / daftar bisa di klik'
WebUI.verifyElementClickable(findTestObject('Login/button_login'))

'click button masuk'
WebUI.click(findTestObject('Login/button_login'))

'verifikasi bahwa halman sudah diarahkan ke homepage dengan login'
WebUI.verifyElementPresent(findTestObject('Login/logo_moservice'), 0)

