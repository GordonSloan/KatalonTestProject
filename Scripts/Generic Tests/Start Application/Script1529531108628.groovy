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

'Click \'My applications\' button'
WebUI.click(findTestObject('Generic Tests/Start Application/Page_Portal homepage - Gordon Testi/a_Application Portal'))

'Verify grant scheme name (How to check that it is correct?)'
WebUI.verifyElementPresent(findTestObject('Generic Tests/Start Application/Page_My applications - Gordon Testi/div_New Grant Scheme'), 
    0)

'Click \'Start\' button'
WebUI.click(findTestObject('Generic Tests/Start Application/Page_My applications - Gordon Testi/a_Start'))

'Verify submit button present (How to check that it is disabled?)'
WebUI.verifyElementPresent(findTestObject('Generic Tests/Start Application/Page_Start an application - Gordon/div_fx-contactfulladdnotesubmi'), 
    0)

'Select checkbox to agree to terms and conditions'
WebUI.click(findTestObject('Generic Tests/Start Application/Page_Start an application - Gordon/chkAgree'))

'Click start button (Extra step needed to confirm that it has been enabled?)'
WebUI.click(findTestObject('Generic Tests/Start Application/Page_Start an application - Gordon/btnStart'))

