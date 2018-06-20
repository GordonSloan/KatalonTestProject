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

WebUI.click(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF'))

WebUI.verifyElementPresent(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/label_Application form onlyApp'), 
    0)

WebUI.verifyElementPresent(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/label_Application form with su'), 
    0)

'Verify that checkbox is checked (Need statement to uncheck if checked, this will result in different messaging)'
WebUI.verifyElementPresent(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/input_chkSendEmailPostGenerati'), 
    0)

WebUI.click(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/button_Generate PDF'))

'Success messaging appears (This message is different depending on email checkbox selection)'
not_run: WebUI.verifyElementPresent(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/div_Please wait while your PDF'), 
    0)

WebUI.verifyElementPresent(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/div_Your PDF is ready'), 0)

WebUI.click(findTestObject('Generic Tests/Generate PDF/Page_Application form - Gordon Test/div_notification-close'))

