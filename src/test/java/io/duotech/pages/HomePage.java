package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class HomePage {
	
	
	public HomePage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (className = "login")
	public WebElement signInLink;
	
	
	@FindBy (xpath = "(//a[@title='Blouse'])[2]")
	public WebElement blouse;


	@FindBy (xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
	public WebElement dressesLink;

	

}
