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

'verifikasi bahwa button promo sudah ada'
WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_promo'))

'click button promo'
WebUI.click(findTestObject('Reedem Promo Mobil/button_promo'))

'menunggu 5 detik'
WebUI.delay(5)

'verifikasi bahwa button untuk tab motor sudah ada'
WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_tabMotor'))

'click button tab motor'
WebUI.click(findTestObject('Reedem Promo Mobil/button_tabMotor'))

'menunggu 5 detik'
WebUI.delay(5)

'screenshot ketika sudah berada di tab motor'
WebUI.takeScreenshot()

WebUI.comment('sekarang user akan berada di halaman promo tab motor')

