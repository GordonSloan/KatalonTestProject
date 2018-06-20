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

'Click \'My account\' link'
WebUI.click(findTestObject('Generic Tests/Change Password/Page_Portal homepage - Gordon Testi/a_My account'))

'Click \'Change password\' link'
WebUI.click(findTestObject('Generic Tests/Change Password/Page_My account - Gordon Testing/hlnkChangePassword'))

'Enter old password'
WebUI.setText(findTestObject('Generic Tests/Change Password/Page_My account - Gordon Testing/input_ctl00MainContenttxtOldPa'), 'password123')

'Enter new password'
WebUI.setText(findTestObject('Generic Tests/Change Password/Page_My account - Gordon Testing/input_ctl00MainContenttxtPassw'), 'qwerty789')

'Confirm new password'
WebUI.setText(findTestObject('Generic Tests/Change Password/Page_My account - Gordon Testing/input_ctl00MainContenttxtConfi'), 'qwerty789')

'Click \'Save\' button'
WebUI.click(findTestObject('Generic Tests/Change Password/Page_My account - Gordon Testing/input_ctl00MainContentbtnSave'))

'Success messaging appears'
WebUI.verifyElementPresent(findTestObject('Generic Tests/Change Password/Page_My account - Gordon Testing/div_Saved successfully.'), 0, 
    FailureHandling.OPTIONAL)

