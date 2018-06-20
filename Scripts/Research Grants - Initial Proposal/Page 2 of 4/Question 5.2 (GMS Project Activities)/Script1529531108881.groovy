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

WebUI.comment('Activity 2')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/a_Add new activity'))

'Activity type'
WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/a_select_3'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/li_Travel'))

'Activity name'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_20'), 
    'Flying')

'Activity description'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00_1'), 
    'Hop on a plane')

'Owner'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_21'), 
    'Flybe')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/a_select'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/li_Other'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/a_select (1)'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/li_santa puts you on the nice'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/a_select (2)'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/li_Transport'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00_2'), 
    'Fame and fortune')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00_3'), 
    'Money')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/a_Open the calendar popup._2'))

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_'))

WebUI.click(findTestObject('TC3_Verify Completion of Standard Application/Page_Application form - Gordon Test/a_7'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_23'), 
    '07/12/2018')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_26'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_25'), 
    '1000')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5.2 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_27'))

