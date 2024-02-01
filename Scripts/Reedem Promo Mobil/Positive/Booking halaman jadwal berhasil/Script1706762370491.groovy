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

'Screenshoot halaman booking jadwal'
WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/textbox_calender'))

WebUI.click(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/textbox_calender'))

WebUI.click(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/button_tanggal'))

WebUI.scrollToElement(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/button_jam'), 0)

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/button_jam'))

WebUI.click(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/button_jam'))

'Screenshoot halaman booking jadwal dengan jam'
WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/button_lanjut'))

WebUI.click(findTestObject('Reedem Promo Mobil/Booking halaman jadwal/button_lanjut'))

