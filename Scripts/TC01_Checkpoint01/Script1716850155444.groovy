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

WebUI.openBrowser(GlobalVariable.mainUrl)

WebUI.click(findTestObject('a_make_appointment_btn'))

WebUI.setText(findTestObject('input_username'), 'John Doe')

WebUI.setText(findTestObject('input_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('button_login'))

WebUI.click(findTestObject('div_visitDate'))

WebUI.click(findTestObject('td_day_31'))

WebUI.click(findTestObject('button_book_appointment'))

WebUI.click(findTestObject('h2_appointment_confirmation'))

WebUI.takeScreenshotAsCheckpoint('Visual Testing')

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint01'), false)

