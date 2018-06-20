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

WebUI.comment('Story: Login to Flexi-Grant')

WebUI.comment('Given that the user has valid login details')

'(This can be added to a setup function)'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://gordontesting.flexigrant.com/')

WebUI.comment('When they login to the system')

'Call \'Login\' test case'
WebUI.callTestCase(findTestCase('Generic Tests/Login'), [('var_username') : var_username, ('var_password') : var_password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('They should be logged in successfully')

'Check expected results'
switch (var_expectedResult.toString()) {
    case 'valid_details':
        'Show user successfully logged in if details are valid'
        WebUI.verifyElementPresent(findTestObject('TC1_Verify Successfull Login/Page_Portal homepage - Gordon Testi/div_Logged in as  test.usersha'), 
            0, FailureHandling.STOP_ON_FAILURE)

        break
    case 'user_not_found':
        'Display \'User not found\' message if no user account exists'
        WebUI.verifyElementPresent(findTestObject('TC1_Verify Successfull Login/Page_Login - Gordon Testing/p_User not found.'), 
            0)

        break
    case 'incorrect_password':
        'Display \'Incorrect password\' message'
        WebUI.verifyElementPresent(findTestObject('TC1_Verify Successfull Login/Page_Login - Gordon Testing/p_Invalid usernameemail or pas'), 
            0, FailureHandling.STOP_ON_FAILURE)

        break
}

'(This can be added to a clear down function)'
WebUI.closeBrowser()

