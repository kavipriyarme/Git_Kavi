package com.adactin.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import com.utility.Demo_1.Utility_Class;


public class Adactin_Runner extends Utility_Class {
	public static WebDriver driver;

	
	public void login() {

	get_url("https://adactinhotelapp.com/");
	
	WebElement username = driver.findElement(By.xpath("//span[@id='username_span']//preceding-sibling :: input"));
	sendkey(username,"kavipriyarme");
	
	WebElement pwd = driver.findElement(By.xpath("//span[@id='password_span']//preceding-sibling :: input"));
	sendkey(pwd,"12345678");

	WebElement logn = driver.findElement(By.xpath("//form[@name='login_form']//descendant::input[@type='Submit']"));
	clk(logn);
	}
	private void hotelbooking1() {
		WebElement located = driver.findElement(By.xpath("//select[@name='location']"));
		slcttext(located,"Brisbane");

		WebElement hotel = driver.findElement(By.xpath("//span[@id='hotel_span']//preceding::select[@name='hotels']"));
		slcttext(hotel,"Hotel Creek");
		

		WebElement rooms = driver.findElement(By.xpath("//span[@id='room_type_span']//preceding ::select[@name='room_type']"));
		slcttext(rooms,"Standard");

		WebElement numbers = driver.findElement(By.xpath("//option[@value='1']//parent::select[@name='room_nos']"));
		slctvalue(numbers,"1");
		
		WebElement date = driver.findElement(By.xpath("//span[@id='checkin_span']//preceding-sibling::input"));
		clear(date);
		sendkey(date,"11/10/2022");

	WebElement pickdate = driver.findElement(By.xpath("//span[@id='checkout_span']//preceding-sibling::input"));
	clear(pickdate);
	sendkey(pickdate,"11/11/2022");

	WebElement adults = driver.findElement(By.xpath("//span[@id='adults_room_span']//preceding::select[@name='adult_room']"));
	slctvalue(adults,"2");


	WebElement child = driver.findElement(By.xpath("//span[@id='child_room_span']//preceding::select[@name='child_room']"));
	slctindex(child,2);


	WebElement search = driver.findElement(By.xpath("//input[@type='reset']//preceding-sibling::input"));
	clk(search);

	WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	clk(radio);

		WebElement cntu = driver.findElement(By.xpath("//input[@name='continue']"));
		clk(cntu);
		
		
		WebElement fname = driver.findElement(By.id("first_name"));
		sendkey(fname,"Kavi priya");
		
		
		WebElement lname = driver.findElement(By.xpath("(//input[@class='reg_input'])[2]"));
		sendkey(lname,"R");

		
		WebElement address = driver.findElement(By.id("address"));
		sendkey(address,"tams colony,dharmapuri");
		
		
		WebElement cardno = driver.findElement(By.id("cc_num"));
		sendkey(cardno,"2345678920987582");

		
		WebElement type = driver.findElement(By.id("cc_type"));
		slcttext(type,"VISA");
		
		WebElement expmont = driver.findElement(By.id("cc_exp_month"));
		slcttext(expmont,"January");
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
	slctvalue(expyear,"2022");

	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	sendkey(cvv,"123");

			
	WebElement booknow = driver.findElement(By.name("book_now"));
	clk(booknow);
			
	WebElement myitineary = driver.findElement(By.xpath("//a[.='Booked Itinerary']"));
	clk(myitineary);
   

	WebElement searchhotel = driver.findElement(By.xpath("//input[@name='search_hotel']"));
	clk(searchhotel);

	}
	
public static void main(String[] args)  {
	driver=get_Browser("chrome");
	Adactin_Runner hotel = new Adactin_Runner();
	hotel.login();
	hotel.hotelbooking1();
  
	
}
}
