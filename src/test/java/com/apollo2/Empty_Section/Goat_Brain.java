package com.apollo2.Empty_Section;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Goat_Brain {
	
	   private RemoteWebDriver driver;
	    private WebDriverWait wait;


	@BeforeTest
	   
	    public void setup() throws Exception
	    {
	     DesiredCapabilities dc = DesiredCapabilities.chrome();
	            URL url = new URL("http://172.20.23.7:5555/wd/hub");
	            driver = new RemoteWebDriver(url, dc);
	            wait = new WebDriverWait(driver, 10);
	           
	           
	    }


	    @Test(priority=1)
	    public void login() throws InterruptedException
	    {
	        driver.get("http://apollo2.humanbrain.in/");
	        driver.manage().window().maximize();
	          String currentURL = driver.getCurrentUrl();
	          System.out.println("Current URL: " + currentURL);
	        WebDriverWait wait = new WebDriverWait(driver, 60);
	        driver.switchTo().defaultContent(); // Switch back to default content
	        WebElement viewerElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Viewer']")));
	        if (viewerElement.isEnabled() && viewerElement.isDisplayed()) {
	            viewerElement.click();
	            System.out.println("Viewer icon is clicked");
	        } else {
	            System.out.println("Viewer icon is not clickable");
	        }        
	   

	          String parentWindow = driver.getWindowHandle();
	          WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Log In ']")));
	          if (loginButton != null) {
	              loginButton.click();
	              System.out.println("Login button clicked successfully.");
	          } else {
	              System.out.println("Login button is not clicked.");
	          }

	        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	        Set<String> allWindows = driver.getWindowHandles();
	          for (String window : allWindows) {
	              if (!window.equals(parentWindow)) {
	                  driver.switchTo().window(window);
	                  break;
	              }
	          }
	          WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
	          if (emailInput != null && emailInput.isDisplayed()) {
	              emailInput.sendKeys("teamsoftware457@gmail.com");
	              System.out.println("Email was entered successfully.");
	          } else {
	             System.out.println("Email was not entered.");
	          }


	          WebElement nextButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	          if (nextButton1 != null) {
	              nextButton1.click();
	              System.out.println("Next button 1 is clicked.");
	          } else {
	              System.out.println("Next button 1 is not clicked.");
	          }
	 
	          WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Enter your password']")));
	          passwordInput.sendKeys("Health#123");
	          if (passwordInput.getAttribute("value").equals("Health#123")) {
	              System.out.println("Password was entered successfully.");
	          } else {
	              System.out.println("Password was not entered.");
	          }

	 
	          WebElement nextButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	          if (nextButton2 != null) {
	              nextButton2.click();
	              System.out.println("Next button 2 is clicked.");
	          } else {
	              System.out.println("Next button 2 is not clicked.");
	          }
	 
	          driver.switchTo().window(parentWindow);
	          System.out.println("Login successfully");
	 
	          System.out.println("************************Login validation done***********************");      
	    }
	   
	    @Test(priority=2)
	    public void GoatBrain_4()throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver,60);
	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
	            Thread.sleep(2000);
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
	            Thread.sleep(2000);
	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[6]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Goat_Brain4 is selected*******************");
	           
	           
	            Section_status(wait);
	            driver.close(); 
	            driver.switchTo().window(parentWindow);
	           // BackButton(wait);        
	    }
	   
	    @Test(priority=3)
	    public void Wrong_GB16_CMC_Delete()throws InterruptedException {
	    	
	        WebDriverWait wait = new WebDriverWait(driver,60);
//	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
//	            Thread.sleep(2000);
//	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
//	            Thread.sleep(2000);
//	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[7]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Wrong GB16(CMC)-Delete is selected*******************");
	           
	           
	            Section_status(wait);
	            driver.close();
	            driver.switchTo().window(parentWindow);
	           // BackButton(wait);
	    }
	   
	    @Test(priority=4)
	    public void GoatBrain_9()throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver,60);
//	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
//	            Thread.sleep(2000);
//	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
//	            Thread.sleep(2000);
	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[8]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Goat brain 9 is selected*******************");
	           
	            Section_status(wait);
	            driver.close();
	            driver.switchTo().window(parentWindow);
	           
	           // BackButton(wait);
	    }
	   
	    @Test(priority=4)
	    public void GoatBrain_22()throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver,60);
//	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
//	            Thread.sleep(2000);
//	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
//	            Thread.sleep(2000);
	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[9]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Goat brain 22 is selected*******************");
	           
	            Section_status(wait);
	            driver.close();
	            driver.switchTo().window(parentWindow);
	            //BackButton(wait);
	    }
	   
	    @Test(priority=5)
	    public void GoatBrain_21()throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver,60);
//	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
//	            Thread.sleep(2000);
//	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
//	            Thread.sleep(2000);
	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[10]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Goat Brain 21 is selected*******************");
	           
	            Section_status(wait);
	            driver.close();
	            driver.switchTo().window(parentWindow);
	            //BackButton(wait);
	    }
	   
	    @Test(priority=6)
	    public void GoatBrain_23()throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver,60);
//	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
//	            Thread.sleep(2000);
//	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
//	            Thread.sleep(2000);
	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[11]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Goat Brain 23 is selected*******************");
	           
	            Section_status(wait);
	            driver.close();
	            driver.switchTo().window(parentWindow);
	            //BackButton(wait);
	    }
	   
	    @Test(priority=7)
	    public void GoatBrain_25()throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver,60);
//	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
//	            Thread.sleep(2000);
//	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
//	            Thread.sleep(2000);
	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[12]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Goat Brain 25 is selected*******************");
	           
	            Section_status(wait);
	            driver.close();
	            driver.switchTo().window(parentWindow);
	           // BackButton(wait);
	    }
	   
	    @Test(priority=8)
	    public void GoatBrain_24()throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver,60);
//	          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[4]/td[1]" ))).click();
//	            Thread.sleep(2000);
//	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[5]/td[2]" ))).click();
//	            Thread.sleep(2000);
	           
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody/tr[13]/td[3]" ))).click();
	            Thread.sleep(3000);
	            
	            String parentWindow = driver.getWindowHandle();
		    	 try {
			 		    WebElement viewericon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nb-icon[@nbtooltip='Viewer']")));
			 		   viewericon.click();
			 		    System.out.println("viewer icon is clicked successfully.");
			 		    Thread.sleep(2000);
			 		} catch (Exception e) {
			 		    System.out.println(" viewer icon is not clicked: " + e.getMessage());
			 		}
		    	 
		    	 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				  Set<String> allWindows = driver.getWindowHandles();
			        for (String window : allWindows) {
			            if (!window.equals(parentWindow)) {
			                driver.switchTo().window(window);
			                break;
			            }
			        }
	            System.out.println("*******************Goat Brain 24 is selected*******************");
	           
	            Section_status(wait);
	            driver.close();
	            driver.switchTo().window(parentWindow);
//	            BackButton(wait);
	    }
	   
	    private void BackButton(WebDriverWait wait) {
	        WebElement backElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Back']")));
	         if (backElement.isEnabled() && backElement.isDisplayed()) {
	             backElement.click();
	             System.out.println("Back icon is clicked");
	         } else {
	             System.out.println("Back icon is not clickable");
	         }
	    }    
	   
	    private void Section_status(WebDriverWait wait) {
	        LogEntries browserLogs = driver.manage().logs().get(LogType.BROWSER);
	        LogEntry lastLogEntry = null;

	        // here i am iterating in this for loop till the end of the console log
	        for (LogEntry entry : browserLogs) {
	            lastLogEntry = entry;
	        }

	       
	        if (lastLogEntry != null) {
	            System.out.println(lastLogEntry.getMessage());
	        }
	        else {
	            System.out.println("Brain section loaded successfully");
	        }
	    }
	       
	    @AfterTest
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	}



