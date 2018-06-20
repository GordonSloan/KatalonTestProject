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
import org.openqa.selenium.Keys as Keys

WebUI.comment('This test has a few issues that need sorted out relating to the Activites question and File Upload')

WebUI.comment('Open browser and navigate to test tenant')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://gordontesting.flexigrant.com/')

WebUI.comment('Login')

WebUI.callTestCase(findTestCase('Generic Tests/Login'), [('var_username') : 'test.user@sharklasers.com', ('var_password') : 'password123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Start application')

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Start Application (TC3)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('End tour')

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Guided Tour (TC3)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Verify percentage complete')

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_0 complete'), 
    0)

WebUI.comment('Generate PDF')

'Requires fix (Bug with multiple toasts)'
not_run: WebUI.callTestCase(findTestCase('Generic Tests/Generate PDF'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Confirm default status of pages')

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/span_Not Started'), 
    0)

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/span_Not Started_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/span_Not Started_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/span_Not Started_3'), 
    0)

WebUI.comment('Start first page')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Start'))

WebUI.comment('Page 1 of 4')

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 1 of 4/Save and Verify Page Errors (TC3)'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 1 of 4/Question 1 (Radio List)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Navigate to next page')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Next page'))

WebUI.comment('Page 2 of 4')

'Requires fix'
not_run: WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 2 of 4/Question 1 (GMS Contact)'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 2 of 4/Question 2 (GMS Organisation)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Save page so that file upload control reloads (temp)')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Save progress_1'))

'Requires fix / investigation (Bug with style loss)'
WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 2 of 4/Question 3 (File Upload)'), [:], FailureHandling.STOP_ON_FAILURE)

'Temp Disable'
not_run: WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 2 of 4/Question 4 (GMS Project)'), [:], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Navigate to next page')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Next page'))

WebUI.comment('Page 3 of 4')

WebUI.comment('Verify percentage complete')

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_50 complete'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_25 complete'), 
    0)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 3 of 4/Question 1 (Textbox)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 3 of 4/Question 2 (Multiline Textbox)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 3 of 4/Question 3 (Multiline Textbox)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 3 of 4/Question 4 (Date Field)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 3 of 4/Question 5 (Date Field)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Research Grants - Initial Proposal/Page 3 of 4/Question 6 (Radio List)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Navigate to next page')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Next page'))

WebUI.comment('Page 4 of 4')

WebUI.comment('Verify percentage complete')

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_75 complete'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_50 complete'), 
    0)

'Form item ID gets passed in for this object'
not_run: WebUI.setText(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_33'), 
    '3000')

'Form item ID gets passed in for this object'
not_run: WebUI.setText(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_32'), 
    'Food')

WebUI.comment('Save page')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Save progress_1'))

WebUI.comment('Verify percent complete')

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_100 complete'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_75 complete'), 
    0)

WebUI.comment('Return to summary')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Return to Summary'))

'This will be removed after fixing project activities'
not_run: WebUI.comment('Edit Page 2 of 4')

not_run: WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Edit_1'))

WebUI.comment('Save progress')

not_run: WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_Save progress_1'))

WebUI.comment('Verify percent complete')

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/div_100 complete'), 
    0)

WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/span_4 of 4 Pages'), 
    0)

'Submit button is present and enabled'
WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_34'), 
    0)

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_34'))

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/button_OK'))

'Check \'Submitted\' text is present'
WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/span_Submitted 08062018'), 
    0)

'Application has successfully been submitted'
WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/h2_Your application has been s'), 
    0)

WebUI.comment('Return to applications list')

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_My applications'))

'Needs to be made generic'
not_run: WebUI.verifyElementPresent(findTestObject('TC3_Verify Completion of Standard Application/Page_My applications - Gordon Testi/i_Submitted 08062018Current St'), 
    0)

WebUI.comment('Close browser')

WebUI.closeBrowser()

