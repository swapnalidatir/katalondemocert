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

WebUI.callTestCase(findTestCase('Tc34_ManualMode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_Admin'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_ESS'))

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input'), 'a')

WebUI.click(findTestObject('Admin/Page_OrangeHRM/span_A8DCo 4Ys 010Z'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'Swapppp09123')

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'Test1234')

WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 'Test1234')

WebUI.click(findTestObject('Admin/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()


// Import necessary libraries
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Call a test case named 'Tc34_ManualMode'
WebUI.callTestCase(findTestCase('Tc34_ManualMode'), [:], FailureHandling.STOP_ON_FAILURE)

// Click on the 'Admin' element
WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_Admin'))

// Click on the 'Add' button
WebUI.click(findTestObject('Admin/Page_OrangeHRM/button_Add'))

// Click on the dropdown to select an option
WebUI.click(findTestObject('Admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

// Click on the 'ESS' option
WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_ESS'))

// Set text 'a' in the input field
WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input'), 'a')

// Click on a specific element
WebUI.click(findTestObject('Admin/Page_OrangeHRM/span_A8DCo 4Ys 010Z'))

// Click on the dropdown to select an option
WebUI.click(findTestObject('Admin/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))

// Click on the 'Enabled' option
WebUI.click(findTestObject('Admin/Page_OrangeHRM/div_Enabled'))

// Set text 'Swapppp09123' in the 'Username' input field
WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'Swapppp09123')

// Set text 'Test1234' in the 'Password' input field
WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'Test1234')

// Set text 'Test1234' in the 'Confirm Password' input field
WebUI.setText(findTestObject('Admin/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 'Test1234')

// Click on the 'Save' button
WebUI.click(findTestObject('Admin/Page_OrangeHRM/button_Save'))

// Close the browser
WebUI.closeBrowser()