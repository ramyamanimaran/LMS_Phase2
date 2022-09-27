package pageObjects;

import org.openqa.selenium.By;
//port org.openqa.selenium.By;
//port org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

		public WebDriver sdriver;
		public UserPage(WebDriver rdriver) 
		{
			sdriver= rdriver;
			PageFactory.initElements( rdriver,this);
		}
	
		
		
		@FindBy(id="username")
		@CacheLookup
		WebElement user;
		
		@FindBy(id="password")
		@CacheLookup
		WebElement psw;
		
		@FindBy(xpath="//span[contains(text(), 'Login')]")
		@CacheLookup
		WebElement LoginBtn;
		
		@FindBy(xpath="//span[contains(text(), 'User')]")
		@CacheLookup
		WebElement userClick;
		
		@FindBy(xpath="//div[contains(text(),'Manage User')]")
		@CacheLookup
		WebElement str1;
		
		@FindBy(xpath="//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[3]")
		@CacheLookup
		WebElement nextone;
		
		@FindBy(xpath="//span[contains(text(),'Add New User')]")
		@CacheLookup
		WebElement AddUser;
		
		@FindBy(xpath="//table[@role='grid']/thead/tr/th[2]/p-sorticon")
		@CacheLookup
		WebElement sorticon;
	
		@FindBy(xpath="//p-tableheadercheckbox/div/div[2]")
		@CacheLookup
		WebElement empty;
		
		@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']")
		@CacheLookup 
		WebElement deleteicon;
		
		@FindBy(xpath="//button[@ng-reflect-ng-class='p-confirm-dialog-accept']")
		@CacheLookup
		WebElement delYes;
		
		@FindBy(xpath="//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-15 p-dialog p-confirm-dialog p-component ng-star-inserted']")
		@CacheLookup
		WebElement deletemsg;
		
		@FindBy(xpath="//button[@ng-reflect-ng-class='p-confirm-dialog-reject']")
		@CacheLookup
		WebElement delNo;
		
		@FindBy(xpath="//button[@class='ng-tns-c133-8 p-dialog-header-icon p-dialog-header-close p-link ng-star-inserted']")
		@CacheLookup
		WebElement closeBtn;
		
		@FindBy(xpath="//table/tbody/tr[1]/td[8]//button[@icon='pi pi-trash']//span[@class='p-button-icon pi pi-trash']")
		@CacheLookup
		WebElement delRow;
		
		@FindBy(xpath="(//button[@class='p-button-rounded p-button-success p-button p-component p-button-icon-only' and contains(@icon,'pi pi-pencil')])[1]")
		@CacheLookup
		WebElement editRow; 
		
		@FindBy(xpath="//input[@placeholder='Search...']")
		@CacheLookup
		WebElement search;
		
		@FindBy(xpath="//span[contains(text(),'U001')]/..")
		@CacheLookup
		WebElement id;
		
		@FindBy(xpath="//button[@id='new']")
		@CacheLookup
		WebElement Addnew;

		@FindBy(xpath="//button[@color='warn']")
		@CacheLookup
		WebElement cancel;
		
		
		@FindBy(xpath="//div[@class='p-dialog-header ng-tns-c132-6 ng-star-inserted']")
		@CacheLookup
		WebElement header;
		
		@FindBy(xpath= "//button[@tabindex='-1']")
		@CacheLookup
		WebElement cancelicon;
		
		@FindBy(xpath="//button[@color='primary']")
		@CacheLookup
		WebElement submit;
		
		@FindBy(xpath="//div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
		@CacheLookup
		WebElement statedrop;
		
		@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c148-26']")
		@CacheLookup
		WebElement userrole;
		
		@FindBy(xpath="//span[contains(text(),'+ Add C/O, Apt, Suite, Unit ')]")
		@CacheLookup
		WebElement add2;
		
		@FindBy(xpath= "//input[@data-placeholder='Postal Code']")
		@CacheLookup
		WebElement pc;
		public void setUserName( String uname)
		{
		user.click();
		user.clear();
		user.sendKeys(uname);
		}
		
		public void setPassword( String psword)
		{
			psw.clear();
			psw.sendKeys(psword);
		}
		public void clickLogin()
		{
			LoginBtn.click();
		}

		public void clickonuser() {
			
			userClick.click();
		}

		public void clicknext() {
			
			nextone.click();
			
		}

	

		public void clickonAddUser() {
			
			AddUser.click();
		}

		public void clickonsorticon()
		{
			sorticon.click();
		}

		public void clickcheckbox() {
			
			empty.click();
			
		}

		public void clickDeleteicon() {
			
			deleteicon.click();
			
		}

		public void deleteconfirm()
		{
			deletemsg.click();
		}
		public void delYes()
		{
			delYes.click();
		}

		public void delNo() {
			
			delNo.click();
			
		}
		public void closeBtn() {
			closeBtn.click();
		}
		public void clickDeleteinrow()
		{
			delRow.click();
		}
		
		public void clickEditinrow()
		{
			editRow.click();
		}
		
		public void clicksearch()
		{
			search.click();
			search.sendKeys("John");
		}
		
		public void wrongsearch()
		{
			search.click();
			search.clear();
			search.sendKeys("Ayesha");
			
		}
		public void clickid()
		{
			id.click();
		}

		public void clickAddnew() {
		
			Addnew.click();
			
		}
		public void clickcancel()
		{
			cancel.click();
		}
		
		public void clickcancelicon()
		{
			cancelicon.click();
		}
		
		public void clicksubmit()
		{
			submit.click();
		}
		public void clickdropd()
		{
			statedrop.click();
		}

		public void clickuserrole() {
			
			userrole.click();
		}
		
		public void clickAdd2()
		{
			add2.click();
		}
		public void clickpc()
		{
			pc.click();
		}
		}
