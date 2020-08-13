import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sulis.ul.ie/')

WebUI.setText(findTestObject('Object Repository/Page_Sulis  Gateway  Overview/input_user id_eid'), '19151675')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sulis  Gateway  Overview/input_password_pw'), 'CqRs6Hq6iIthqHsvRWMmfg==')

WebUI.click(findTestObject('Object Repository/Page_Sulis  Gateway  Overview/input_password_submit'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Overview/span_Membership'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/a_Joinable Sites'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/a_Join Now'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/span_Delegated Access'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/span_Membership'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/a_My Current Sites'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/input_Select to unjoin 12 Apps of Christmas_b0d0a4'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/input_Search_unjoin active'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/input_Confirm Change_eventSubmit_doGoto_unjoinyes'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/span_CHANDAN KUMAR'))

WebUI.click(findTestObject('Object Repository/Page_Sulis  Home  Membership/span_Log Out'))

WebUI.closeBrowser()

