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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlayu)

WebUI.maximizeWindow()

WebUI.verifyElementClickable(findTestObject('Login/button_masukDaftar'))

WebUI.click(findTestObject('Login/button_masukDaftar'))

WebUI.verifyElementVisible(findTestObject('Login/textbox_telepon'))

WebUI.setText(findTestObject('Login/textbox_telepon'), GlobalVariable.noTelFaldo)

WebUI.verifyElementVisible(findTestObject('Login/textbox_password'))

WebUI.setText(findTestObject('Login/textbox_password'), GlobalVariable.passwordayuFaldo)

WebUI.click(findTestObject('Login/button_eye'))

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Login/button_login'))

WebUI.click(findTestObject('Login/button_login'))

WebUI.verifyElementPresent(findTestObject('Login/logo_moservice'), 0)

