import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('www.google.com')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com')

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 10)

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), user_name)

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), 10)

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), password)

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/welcomeAdmin_ddl'), 10)

WebUI.click(findTestObject('Page_OrangeHRM/welcomeAdmin_ddl'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/LogOut_Link'), 10)

not_run: WebUI.click(findTestObject('Page_OrangeHRM/LogOut_Link'))

not_run: WebUI.closeBrowser()

