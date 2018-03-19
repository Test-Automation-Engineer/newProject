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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://epdonline.herokuapp.com/')

WebUI.click(findTestObject('Page_EPD online/a_Open EPD'))

WebUI.click(findTestObject('Page_EPD online/a_Overzicht patienten'))

WebUI.click(findTestObject('Page_EPD online/a_Patient toevoegen'))

WebUI.setText(findTestObject('Page_EPD online/input_patientfirst_name'), 'john')

WebUI.setText(findTestObject('Page_EPD online/input_patientlast_name'), 'hallo')

WebUI.setText(findTestObject('Page_EPD online/input_patientbsn'), '123456789')

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_12345678910111213141516'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_19501951195219531954195'), '2001', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_JanuaryFebruaryMarchApr'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_ManVrouw'), 'Man', true)

WebUI.setText(findTestObject('Page_EPD online/input_patientstreet'), 'RIngweg')

WebUI.setText(findTestObject('Page_EPD online/input_patientzipcode'), '3011ab')

WebUI.setText(findTestObject('Page_EPD online/input_patientcity'), 'Rotterdam')

WebUI.setText(findTestObject('Page_EPD online/input_patientphone'), '0101234567')

WebUI.setText(findTestObject('Page_EPD online/input_patientemail'), 'test@test.com')

WebUI.setText(findTestObject('Page_EPD online/input_patientinsurance_company'), 'Delta Lloyd')

WebUI.setText(findTestObject('Page_EPD online/input_patientinsurance_number'), '123456789')

WebUI.click(findTestObject('Page_EPD online/input_commit'))

WebUI.click(findTestObject('Page_EPD online/div_Patient is succesvol aange'))

WebUI.click(findTestObject('Page_EPD online/a_Behandeling toevoegen'))

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_12345678910111213141516_1'), '10', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_JanuaryFebruaryMarchApr_1'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_20162017201820192020202'), '2019', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_PoliklinischOpname'), 'Opname', true)

WebUI.setText(findTestObject('Page_EPD online/input_treatmenttreated_by'), 'Dokter anders')

WebUI.setText(findTestObject('Page_EPD online/input_treatmentname'), 'Knie operatie')

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_RadiologieChirurgieCard'), 'Chirurgie', true)

WebUI.selectOptionByValue(findTestObject('Page_EPD online/select_LaagNormaalSpoed'), 'Normaal', true)

WebUI.click(findTestObject('Page_EPD online/input_commit'))

WebUI.click(findTestObject('Page_EPD online/div_Behandeling is successvol'))

WebUI.click(findTestObject('Page_EPD online/a_Verwijderen'))

WebUI.click(findTestObject('Page_EPD online/div_Patient is succesvol verwi'))

WebUI.closeBrowser()

