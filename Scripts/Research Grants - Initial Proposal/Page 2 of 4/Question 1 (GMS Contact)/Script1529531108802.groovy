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

'Just need to verify label'
not_run: WebUI.verifyElementPresent(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/div_Add person from our contac'), 
    0)

'Check if address complete (statement)'
not_run: WebUI.verifyElementPresent(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/td_No'), 
    0)

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/a_Edit'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_3'), 
    '1234567890')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_4'), 
    '123 Test House')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_5'), 
    'Contact City')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_6'))

'Prompt to update address details in CRM'
not_run: WebUI.verifyElementPresent(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/div_Address Address line 1 cha'), 
    0)

'Agree to update details'
not_run: WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Page_Application form - Gordon Test/a_Yes'), 
    FailureHandling.STOP_ON_FAILURE)

