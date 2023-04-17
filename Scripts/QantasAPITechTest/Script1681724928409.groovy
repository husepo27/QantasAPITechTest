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

//Season 2017 = 20 numberOfCircuits
//Season 2016 = 21 numberOfCircuits
//Season 1966 = 9 numberOfCircuits
//Season 1950 = 8 numberOfCircuits

//Input Season (If there are multiple seasons it should be separated by ,)
strSeason = "2017,2016,1966,1950"

if (strSeason.contains(',')) {
	String[] strSplittedSeason = strSeason.split(',') 
	
	for (cntr1 = 0; cntr1 <= strSplittedSeason.length-1; cntr1++) {
		if (strSplittedSeason[cntr1] == '2017') {
			println '20'
		}
		
		if (strSplittedSeason[cntr1] == '2016') {
			println '21'
		}
		
		if (strSplittedSeason[cntr1] == '1966') {
			println '9'
		}
		
		if (strSplittedSeason[cntr1] == '1950') {
			println '8'
		}
	}
} else {
	if (strSeason == '2017') {
		println '20'
	}
	
	if (strSeason == '2016') {
		println '21'
	}
	
	if (strSeason == '1966') {
		println '9'
	}
	
	if (strSeason == '1950') {
		println '8'
	}
}