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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyTextPresent('Register to Book Store', false)

WebUI.setText(findTestObject('New User_Field_First Name'), 'Joseph')

WebUI.setText(findTestObject('New User_Field_Last Name'), 'Bimanta')

WebUI.scrollToElement(findTestObject('New User_Field_User Name'), 0)

WebUI.setText(findTestObject('New User_Field_User Name'), 'josephbimanta')

WebUI.setText(findTestObject('New User_Field_Password'), 'Validcred1234@')

WebUI.switchToFrame(findTestObject('New User_iframe_reCaptcha'), 10)

WebUI.executeJavaScript("document.getElementById('recaptcha-anchor').style.display = 'none';", null)

//WebUI.click(findTestObject('New User_Checkbox_Captcha'))

WebUI.switchToDefaultContent()



