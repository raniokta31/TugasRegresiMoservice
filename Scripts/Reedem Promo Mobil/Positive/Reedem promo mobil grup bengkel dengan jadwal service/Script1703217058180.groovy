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

WebUI.callTestCase(findTestCase('Login/Positive/Verifikasi login username password valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Login/logo_moservice'))

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_promo'))

WebUI.click(findTestObject('Reedem Promo Mobil/button_promo'))

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_tabMobil'))

WebUI.click(findTestObject('Reedem Promo Mobil/button_tabMobil'))

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/menu_semua'))

WebUI.click(findTestObject('Reedem Promo Mobil/menu_semua'))

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_detailGrupBengkel'))

WebUI.click(findTestObject('Reedem Promo Mobil/button_detailGrupBengkel'))

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_pilihBengkel'))

WebUI.click(findTestObject('Reedem Promo Mobil/button_pilihBengkel'))

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/button_pilihanBengkel'))

WebUI.click(findTestObject('Reedem Promo Mobil/button_pilihanBengkel'))

WebUI.verifyElementVisible(findTestObject('Reedem Promo Mobil/dropdown_select'))

WebUI.click(findTestObject('Reedem Promo Mobil/dropdown_select'))

WebUI.click(findTestObject('Reedem Promo Mobil/dropdown_selected'))

WebUI.verifyElementClickable(findTestObject('Reedem Promo Mobil/button_ambilPromo'))

WebUI.click(findTestObject('Reedem Promo Mobil/button_ambilPromo'))

WebUI.verifyElementClickable(findTestObject('Reedem Promo Mobil/button_jadwalService'))

WebUI.click(findTestObject('Reedem Promo Mobil/button_jadwalService'))

