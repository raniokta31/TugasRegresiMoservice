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

WebUI.navigateToUrl('https://dev.moservice.id/')

WebUI.verifyElementClickable(findTestObject('Login/button_masukDaftar'))

WebUI.click(findTestObject('Login/button_masukDaftar'))

WebUI.verifyElementVisible(findTestObject('Login/textbox_telepon'))

WebUI.click(findTestObject('Registrasi/button_daftar'))

WebUI.verifyElementVisible(findTestObject('Registrasi/textbox_nama'))

WebUI.setText(findTestObject('Registrasi/textbox_nama'), 'Si manis')

WebUI.verifyElementVisible(findTestObject('Login/textbox_password'))

WebUI.setText(findTestObject('Login/textbox_password'), 'Simanis01')

WebUI.verifyElementVisible(findTestObject('Registrasi/textbox_reinputPassword'))

WebUI.setText(findTestObject('Registrasi/textbox_reinputPassword'), 'Simanis01')

WebUI.verifyElementClickable(findTestObject('Registrasi/label_setuju'))

WebUI.click(findTestObject('Registrasi/label_setuju'))

WebUI.verifyElementVisible(findTestObject('Registrasi/popup_snkDaftar'))

WebUI.verifyElementVisible(findTestObject('Registrasi/button_setujuDaftar'))

WebUI.click(findTestObject('Registrasi/button_setujuDaftar'))

WebUI.verifyElementVisible(findTestObject('Registrasi/button_daftarRegist'))

WebUI.click(findTestObject('Registrasi/button_daftarRegist'))

WebUI.comment('Button Daftar disable')

