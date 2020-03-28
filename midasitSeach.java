package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//ctrl+shift+o 누르면 자동 추가

//1.java selenium library 설치
//2. Project > Properties > Build Path에 library 추가 (.jar 파일만)
//3. chromedriver.exe. 설치

public class midasitSeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		String NaverUrl = "https://www.naver.com";
		driver.get(NaverUrl);
		//chrome에서 네이버 열기
		
		WebElement search = driver.findElement(By.id("query"));
		search.sendKeys("마이다스아이티");
		WebElement button = driver.findElement(By.id("search_btn"));
		button.click();
		//마이다스아이티 검색
		
		String str = driver.findElement(By.cssSelector("#main_pack > div.nsite.section._nsiteBase > ul > li > dl > dt > a > b")).getText();
		//예상 결과 : 마이다스아이티
		
		if (str.equals("마이다스아이티")) {
			driver.close(); 
		//equals()는 '메소드' -> 객체끼리 내용 비교(대상의 내용 자체를 비교)
		//==는 객체 참조 주소 값 비교하는 '연산자'
		}
	}

}
