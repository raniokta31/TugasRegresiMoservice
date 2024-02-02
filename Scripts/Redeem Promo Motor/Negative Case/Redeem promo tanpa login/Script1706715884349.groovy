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

WebUI.openBrowser('https://dev.moservice.id/')

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Tab_promo'))

WebUI.click(findTestObject('Katalog_promo_motor/Tab_promo'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Tab_motor'))

WebUI.click(findTestObject('Katalog_promo_motor/Tab_motor'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Button_ViewPromo'))

WebUI.click(findTestObject('Katalog_promo_motor/Button_ViewPromo'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Button_AmbilPromo3'))

WebUI.click(findTestObject('Katalog_promo_motor/Button_AmbilPromo3'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Button_LoginPromo'))

WebUI.click(findTestObject('Katalog_promo_motor/Button_LoginPromo'))

WebUI.delay(0)

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/TextBox_UsernamePromo'))

WebUI.setText(findTestObject('Katalog_promo_motor/TextBox_UsernamePromo'), '081219751795')

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/TextBox_PasswordPromo'))

WebUI.setText(findTestObject('Katalog_promo_motor/TextBox_PasswordPromo'), 'Jakarta3')

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Button_Loginprom'))

WebUI.click(findTestObject('Katalog_promo_motor/Button_Loginprom'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Button_AmbilPromo'))

WebUI.click(findTestObject('Katalog_promo_motor/Button_AmbilPromo'))

WebUI.verifyElementVisible(findTestObject('Katalog_promo_motor/Button_RedeemPromo'))

WebUI.click(findTestObject('Katalog_promo_motor/Button_RedeemPromo'))

WebUI.takeScreenshot()

WebUI.delay(3)

