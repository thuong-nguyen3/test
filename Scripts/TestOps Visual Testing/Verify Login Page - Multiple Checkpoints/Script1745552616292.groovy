import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Rectangle as Rectangle
import org.openqa.selenium.Rectangle as Rectangle
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://platform.qa.katalon.com')

WebUI.waitForElementVisible(findTestObject('TestOpsPage/email'), 0)

// Define area to capture (x=100, y=200, width=300, height=150)
Rectangle captureArea = new Rectangle(100, 200, 300, 150)

WebUI.takeAreaScreenshotAsCheckpoint('areaCheckpoint', captureArea)

WebUI.takeElementScreenshotAsCheckpoint('elementCheckpoint', findTestObject('TestOpsPage/lblLogIn'))

WebUI.takeFullPageScreenshotAsCheckpoint('fullCheckpoint')

WebUI.click(findTestObject('TestOpsPage/ContinueWithEmail'))

WebUI.takeAreaScreenshotAsCheckpoint('areaCheckpoint1', captureArea)

WebUI.takeElementScreenshotAsCheckpoint('elementCheckpoint1', findTestObject('TestOpsPage/email'))

WebUI.takeFullPageScreenshotAsCheckpoint('fullCheckpoint1')

WebUI.setEncryptedText(findTestObject('TestOpsPage/email'), '')

WebUI.takeAreaScreenshotAsCheckpoint('areaCheckpoint2', captureArea)

WebUI.takeElementScreenshotAsCheckpoint('elementCheckpoint2', findTestObject('TestOpsPage/email'))

WebUI.takeFullPageScreenshotAsCheckpoint('fullCheckpoint2')

WebUI.setEncryptedText(findTestObject('TestOpsPage/pwd'), '')

WebUI.takeAreaScreenshotAsCheckpoint('areaCheckpoint3', captureArea)

WebUI.takeElementScreenshotAsCheckpoint('elementCheckpoint3', findTestObject('TestOpsPage/email'))

WebUI.takeFullPageScreenshotAsCheckpoint('fullCheckpoint3')

