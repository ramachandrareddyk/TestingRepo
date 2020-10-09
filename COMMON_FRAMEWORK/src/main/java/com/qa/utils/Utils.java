package com.qa.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.BasePage;

public class Utils extends BasePage {

	public static int PAGE_LOAD_TIMEOUTS = 15;
	public static int IMPLECITLY_WAIT = 20;
	public static String retryLogicPermission=prop.getProperty("RetryLogicPermission");
	
	// =====================================
	// ----------SCREEN SHOTS------------||
	// =====================================
	public static String getScreenshot() {

		File srcFile=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		String destination = projectPath + "./screenshots/failedScreenshots/" + System.currentTimeMillis() + ".png";
		try {
			FileUtils.copyFile(srcFile, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destination;
	}
	
	// ==================================
	// --------------WAITS------------ ||
	// ==================================
	public static WebElement explecitWaitUntillClickable(int timeOutInSeconds, WebElement element) {
		return new WebDriverWait(Driver.getDriver(), timeOutInSeconds).until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement explecitWaitUntillSelectable(int timeOutInSeconds, WebElement element) {
		new WebDriverWait(Driver.getDriver(), timeOutInSeconds).until(ExpectedConditions.elementToBeSelected(element));
		return element;
	}

	public static WebElement explecitWaitUntillElementPresent(int timeOutInSeconds, By locator) {
		return new WebDriverWait(Driver.getDriver(), timeOutInSeconds).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static String explecitWaitUntillTitlePresent(int timeOutInSeconds, String title) {
		new WebDriverWait(Driver.getDriver(), timeOutInSeconds).until(ExpectedConditions.titleContains(title));
		return Driver.getDriver().getTitle();
	}

	public static WebElement explecitWaitUntillElementVisiblity(int timeOutInSeconds, WebElement element) {
		return new WebDriverWait(Driver.getDriver(), timeOutInSeconds).until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void push(long Time) throws InterruptedException{
		Thread.sleep(Time);
	}

	// =====================================
	// --------------ACTIONS------------- ||
	// =====================================
	public static void MouseOver(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(element).build().perform();
	}

	public static void doubleClick(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.doubleClick(element).build().perform();
	}

	public static void dragAndDrop(WebElement srcElement, WebElement dstElement) {
		Actions action = new Actions(Driver.getDriver());
		action.clickAndHold(srcElement).moveToElement(dstElement).release().build().perform();
	}

	public static void rightClick(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.contextClick(element).build().perform();
	}

	public static void actionSendKeys(WebElement element, String Keys) {
		Actions action = new Actions(Driver.getDriver());
		action.sendKeys(element, Keys).build().perform();
	}

	// ============================================
	// ------------FRAME HANDLES---------------- ||
	// ============================================
	public static void switchFrame(String frameName) {
		Driver.getDriver().switchTo().frame(frameName);
	}

	public static void switchFrame(int frameNumber) {
		Driver.getDriver().switchTo().frame(frameNumber);
	}

	public static void defaultFrame() {
		Driver.getDriver().switchTo().defaultContent();
	}

	// ============================================
	// ------------WINDOW HANDLES--------------- ||
	// ============================================
	public static void windowHandle(int window) {
		Set<String> windows = Driver.getDriver().getWindowHandles();
		String windowName = null;
		Iterator<String> itr = windows.iterator();
		for (int i = 0; i < window; i++) {
			windowName = itr.next();
		}
		Driver.getDriver().switchTo().window(windowName);
	}

	// ===============================================
	// ----------------TAB HANDLES----------------- ||
	// ===============================================
	public static void tabHandle(int tabNumber) {
		List<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
		String tabName = null;
		Iterator<String> itr = tabs.iterator();
		for (int i = 0; i < tabNumber; i++) {
			tabName = itr.next();
		}
		Driver.getDriver().switchTo().window(tabName);
	}

	// ===============================================
	// ---------------Alerts Handle---------------- ||
	// ===============================================
	public static void acceptAlertPopUP() {
		Driver.getDriver().switchTo().alert().accept();
	}

	public static void dismissAlertPopUp() {
		Driver.getDriver().switchTo().alert().dismiss();
	}

	public static String getTextAlertPopUp(String HanleAlertBtn) {
		Alert alert = Driver.getDriver().switchTo().alert();
		String text = alert.getText();
		if (HanleAlertBtn.equalsIgnoreCase("ok") || HanleAlertBtn.equalsIgnoreCase("submit")) {
			alert.accept();
		} else {
			alert.dismiss();
		}
		return text;
	}

	public static void sendTextToAlertPopup(String AlertText) {
		Alert alert = Driver.getDriver().switchTo().alert();
		alert.sendKeys(AlertText);
		alert.accept();
	}

	// ========================================================
	// --------------------SELECT CLASS--------------------- ||
	// ========================================================
	public static void selectValue(WebElement element, String selectText) {
		Select select = new Select(element);
		select.selectByVisibleText(selectText);
	}

	public static void deSelectValue(WebElement element, String deSelectText) {
		Select select = new Select(element);
		select.deselectByVisibleText(deSelectText);
	}

	public static List<WebElement> getSelectedValues(WebElement element) {
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	public static void deSelectAllValues(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// ==================================================
	// -----------JAVASCRIPTEXECUITER------------------||
	// ==================================================
	public static void js_Click(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
		js.executeScript("arguments[0].clcik();", element);
	}

	public static void scrollTOElement(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Highlet The Element
	public static void highletElement(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
		js.executeScript("arguments[0].setAttribute('style','background: palegreen; border: 8px solid red:')", element);
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white')", element);
	}

	// To Select Calendar Date Or Data Picker Using Java Script Executor.
	public static void selectDateByJS(WebElement element, String dateValue) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);
	}

	// refresh browser
	public static void refreshPageByJS() {
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
		js.executeScript("history.go(0)");
	}

	// return title using JS
	public static String getTitleByJS() {
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
		String title = js.executeScript("return.document.title;").toString();
		return title;
	}

	// scroll down the page
	public static void scrollPageDown(){
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static String getCurrentDateAndTime(){
		Date date=new Date();
		SimpleDateFormat dateFarmet=new SimpleDateFormat("ddMMyyyy_mmsshh");
		String dtfmt = dateFarmet.format(date);
		return dtfmt;
	}
	
	// =================================================
	// -----------BOOTSTRAP DROPDOWN Select-----------||
	// =================================================
	public static void selectDropDownValue(By xpath, String value) {
		List<WebElement> elements = Driver.getDriver().findElements(xpath);
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equalsIgnoreCase(value)) {
				elements.get(i).click();
				break;
			}
		}
	}
	
	
	public static void validateAssertEqual(WebElement element, String Expecetd){
		Assert.assertEquals(element.getText(), Expecetd);
		
	}

	

}
