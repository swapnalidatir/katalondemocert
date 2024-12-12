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

WebUI.callTestCase(findTestCase('ManualMode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_Admin'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_ESS'))

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input'), 'a')

WebUI.click(findTestObject('Admin/Page_OrangeHRM/span_Davei Jonathan james'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'Swapppp09123')

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'Test1234')

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 'Test23232323')

WebUI.click(findTestObject('Admin/Page_OrangeHRM/button_Save'))

WebUI.verifyTextPresent('Passwords do not match', false)

WebUI.closeBrowser()

