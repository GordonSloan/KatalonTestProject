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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gordontesting.flexigrant.com/')

WebUI.callTestCase(findTestCase('Generic Tests/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Generic Tests/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Generic Tests/Guided Tour/Page_Application form - Gordon Test/div_Guided TourLet us show you'), 
    0)

WebUI.callTestCase(findTestCase('Generic Tests/Guided Tour'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/a_Start'))

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/a_Save progress'))

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/div_There were some problems w'))

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/td_No'))

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/a_Edit'))

WebUI.setText(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_1'), 
    '1234567890')

WebUI.setText(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_2'), 
    '123 House')

WebUI.setText(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_3'), 
    'Big City')

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_4'))

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/a_No'))

WebUI.click(findTestObject('TC2_Verify Completion of Application/Page_Application form - Gordon Test/a_Save progress_1'))

WebUI.callTestCase(findTestCase('Generic Tests/Submit Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

