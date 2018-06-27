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

'Disabled as hard to identify'
not_run: WebUI.verifyElementPresent(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/div_This is a test description'), 
    0)

WebUI.comment('Activity 1')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/a_Add new activity'))

'Activity type'
WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/a_select'))

WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/div_Please Select...FoodHand g'))

not_run: WebUI.selectOptionByValue(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/div_Please Select...FoodHand g'), 
    'Food', false)

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/li_Food'))

'Activity name'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_20'), 
    'Eating')

'Acitivity description'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00_1'), 
    'Consume food to resolve hunger')

'Owner'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_21'), 
    'Professional eaters')

'Owner type'
WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/a_select (1)'))

WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/div_Please Select...SchoolComm'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/li_Charity Trusts'))

'Output type'
WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/a_select (2)'))

WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/div_Please Select...Santa puts'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/li_Santa puts you on naughty l'))

'Priority'
WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/a_select (3)'))

WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/div_Please Select...Building c'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/li_Crime reduction and communi'))

'Goal'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00_2'), 
    'Enlightenment')

'Measurement'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00_3'), 
    'An air horn will sound')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/a_Open the calendar popup._2'))

'Start date'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_22'), 
    '15/06/2018')

'End date'
WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_23'), 
    '25/06/2018')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_24'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/a_select_2'))

WebUI.delay(1)

not_run: WebUI.focus(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/li_Project Social Media'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/li_Project Social Media'))

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/textarea_ctl00MainContentctl00_4'), 
    'Milestone description')

WebUI.setText(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_25'), 
    '3000')

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_26'))

WebUI.click(findTestObject('Research Grants - Initial Proposal/Page 2 of 4/Question 5 (GMS Project Activities)/Page_Application form - Gordon Test/input_ctl00MainContentctl00ucF_27'))

WebUI.comment('Activity 2')

