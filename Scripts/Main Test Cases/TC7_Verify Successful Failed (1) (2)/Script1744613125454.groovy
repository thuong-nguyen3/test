import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)

WebUI.verifyTextPresent("abc 123", false)

WebUI.setText(findTestObject('Page_Login/txt_Password'), Password)

WebUI.closeBrowser()

