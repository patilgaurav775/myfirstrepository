package MOCKPRACTICE;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.log.model.ViolationSetting.Name;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class inty {

	
	public static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		

int a[]= {10,20,30,40};
int b[]= {90,80,70,60,50};
int c[]=new int[a.length+b.length];
String d="BOB";
String f="";
int e=123456;
int remainder=0;
int reverse=0;

for(int i=0;i<a.length;i+=2) {
	System.out.print(a[i]+",");
}
System.out.println();
for(;e>0;) {
	 
	remainder=e%10;
	reverse=reverse*10+remainder;
	e=e/10;
}
if (reverse==e) {
	System.out.println("palindrom number");
} else {
	System.out.println("not palindrom number");
}

for(int i=d.length()-1;i>=0;i--) {
	f=f+d.charAt(i);
}
System.out.println(f);

if (d.equalsIgnoreCase(f)) {
	System.out.println("palindrom");
} else {
System.out.println("not palindrom");
}




/*
System.arraycopy(a, 0, c, 0, a.length);
System.arraycopy(b, 0, c, 4, b.length);

Arrays.sort(c);

System.out.println(Arrays.toString(c));
*/


/*for(int i=0;i<a.length;i++) {
	c[i]=a[i];
}
for(int i=0;i<b.length;i++) {
	c[i+a.length]=b[i];
}

Arrays.sort(c);

System.out.println(Arrays.toString(c));
*/


/*String z="i am gaurav patil";

String[] aa=z.split("");

for(int i=aa.length-1;i>=0;i--) {
	System.out.print(aa[i]);
}

String aaa="";

int length=z.length();

for(int i=length-1;i>=0;i--) {
	aaa=aaa+z.charAt(i);
}
System.out.println();

if (aaa.equalsIgnoreCase(z)) {
	System.out.println("palindrom");
} else {
System.out.println("non palindrom");
}*/












	
		
		
	}
	
	
	
	
	


}
