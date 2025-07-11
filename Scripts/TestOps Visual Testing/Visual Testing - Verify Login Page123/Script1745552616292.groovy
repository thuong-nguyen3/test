import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Rectangle as Rectangle
import org.openqa.selenium.Rectangle as Rectangle
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://platform.qa.katalon.com')

// Define area to capture (x=100, y=200, width=300, height=150)
Rectangle captureArea = new Rectangle(100, 200, 300, 150)

WebUI.waitForElementVisible(findTestObject('TestOpsPage/lblLogIn'), 0)

WebUI.click(findTestObject('TestOpsPage/ContinueWithEmail'))

WebUI.takeAreaScreenshotAsCheckpoint('areaCheckpoint', captureArea)

WebUI.takeElementScreenshotAsCheckpoint('elementCheckpoint', findTestObject('TestOpsPage/email'))

WebUI.takeFullPageScreenshotAsCheckpoint('fullCheckpoint')

WebUI.setEncryptedText(findTestObject('TestOpsPage/email'), '')

WebUI.setEncryptedText(findTestObject('TestOpsPage/pwd'), '')

