import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Disabled as this is hard to identify'
not_run: WebUI.verifyElementPresent(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/div_Please tell us about your'), 
    0)

'Title'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_14'), 
    'Test project')

'Description'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00'), 
    'Project description')

'Project type'
WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/a_select_1'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/li_Type 1'))

'Start date'
WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/a_Open the calendar popup.'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/a_8'))

'End date'
not_run: WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/a_Open the calendar popup._1'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_15'), 
    '10/10/2020')

'Total cost'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_16'), 
    '10000')

'Value sought'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_17'), 
    '5000')

'Address'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_18'), 
    '123 Project')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_19'), 
    'Project Village')

