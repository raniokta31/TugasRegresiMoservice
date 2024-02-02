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

'membuka browser'
WebUI.openBrowser('')

'masuk ke ur https://dev.moservice.id'
WebUI.navigateToUrl(GlobalVariable.url)

'maximize window'
WebUI.maximizeWindow()

'verifikasi button promo sudah visible'
WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_promo'))

'click button promo'
WebUI.click(findTestObject('Reedem Promo Mobil/button_promo'))

'tunggu 5 detik'
WebUI.delay(5)

'screenshot ketika di halaman promo'
WebUI.takeScreenshot()

'verifikasi bahwa tab motor sudah terlihat'
WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_tabMotor'))

'click tab motor'
WebUI.click(findTestObject('Reedem Promo Mobil/button_tabMotor'))

'tunggu 5 detik'
WebUI.delay(5)

'screenshot ketika sedang berada di tab motor'
WebUI.takeScreenshot()

'verifikasi bahwa menu gratis sudah terlihat'
WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/menu_Gratis'))

'click menu gratis'
WebUI.click(findTestObject('Reedem Promo Mobil/menu_Gratis'))

'tunggu 5 detik'
WebUI.delay(5)

'screenshot ketika sedang berada di menu gratis'
WebUI.takeScreenshot()

'verifikasi bahwa dropdown untuk filter layanan service sudah ada'
WebUI.verifyElementVisible(findTestObject('Katalog Promo/dropdown_layananService'))

'click untuk dropdown layanan service'
WebUI.click(findTestObject('Katalog Promo/dropdown_layananService'))

'input \'cuci motor\' pada filter dropdown layanan service'
WebUI.sendKeys(findTestObject(null), 'cuci motor')

'input enter'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

'tunggu 5 detik'
WebUI.delay(5)

'screenshot ketika sedang berada di tab gratis dengan jenis layanan service cuci motor'
WebUI.takeScreenshot()

'verifikasi bahwa dropdown untuk filter layanan service sudah ada'
WebUI.verifyElementVisible(findTestObject('Katalog Promo/dropdown_lokasi'))

'click untuk dropdown lokasi'
WebUI.click(findTestObject('Katalog Promo/dropdown_lokasi'))

'input \'jakarta pusat\' pada filter lokasi'
WebUI.sendKeys(findTestObject(null), 'jakarta pusat')

'input enter'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

'tunggu 5 detik'
WebUI.delay(5)

'screenshot ketika sudah memfilter lokasi jakarta pusat'
WebUI.takeScreenshot()

WebUI.comment('hasil akhir adalah memfilter jenis promo motor gratis dengan layanan service cuci motor dan berlokasi di jakarta pusat')

