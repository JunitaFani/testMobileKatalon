import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil

import internal.GlobalVariable


def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AppPath, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)
Mobile.takeAreaScreenshot(appPath, null)

Mobile.tap(findTestObject('Object Repository/Login/btn_masuk'), 2)
Mobile.takeAreaScreenshot(appPath, null)

Mobile.setText(findTestObject('Object Repository/Login/txt_email_phone'), appPath, "085804661477")
Mobile.setText(findTestObject('Object Repository/Login/txt_password'), appPath, "Eraspace01@")
Mobile.takeAreaScreenshot(appPath, null)

Mobile.tap(findTestObject('Object Repository/Login/btn_login'), 4)
Mobile.takeAreaScreenshot(appPath, null)

Mobile.closeApplication()


