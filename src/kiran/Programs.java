package kiran;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programs {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup(options);
		driver.get("http://kareclouds.com/site/login");
	//	
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("superadmin@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Admin@123");
	//	
//		driver.findElement(By.className("btn")).click();
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
//		//verify the Home Title
//				String expectedHomeTitle="Kareclouds Hospital & Research Center";
//			String actualHomeTitle=driver.getTitle();
//			System.out.println("Home title is:"+actualHomeTitle);
//		if(actualHomeTitle.equals(expectedHomeTitle))
//				{
//				System.out.println("Home page is Displayed, PASS");
//				}
//			else	
//			{
//					System.out.println("Home page is not Displayed, FAIL");		
//				}
//				Thread.sleep(3000);
//				//Logout page
	//	
//		driver.findElement(By.xpath("//img[@class='topuser-image']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//i[@class='fa fa-sign-out fa-fw']")).click();
//		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		//Verify the forgot password
//		driver.findElement(By.className("forgot")).click();
//		Thread.sleep(3000);
	//	
////		//Verify the forgot email password
//		driver.findElement(By.id("form-username")).sendKeys("patnamvenkatakiran5@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.className("btn")).click();
	//	
//		driver.findElement(By.className("forgot")).click();
//		Thread.sleep(3000);
	//	
		//login page
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("superadmin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		Thread.sleep(3000);
		driver.findElement(By.className("btn")).click();
		Thread.sleep(3000);
		
		
		/////////driver.findElement(By.xpath("//span[@class='logo-lg']")).click();
		/////////Thread.sleep(3000);
		/////////driver.findElement(By.xpath("//input[@class='form-control search-form search-form3']")).click();
		/////////Thread.sleep(3000);
		
		//
//		driver.findElement(By.className("logo")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.className("sidebar-toggle")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.className("sidebar-toggle")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='form-control search-form search-form3']")).sendKeys("kiran");
		}
	}
	    



	}

}
