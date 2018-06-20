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
not_run: WebUI.verifyElementPresent(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/div_You must add at least 1 or'), 
    0)

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/a_Add organisation'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_7'), 
    'Test Org')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/a_select'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/li_General'))

WebUI.verifyElementPresent(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_12'), 
    0)

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_12'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_8'), 
    '0987654321')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_9'), 
    'test.org@sharklasers.com')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_10'), 
    '1 Test Org')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_11'), 
    'Org Town')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_13'))

