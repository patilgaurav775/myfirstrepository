package MOCKPRACTICE;

import java.util.Arrays;
import java.util.Scanner;

public class morningnew {
	public static void m1(int num) { ///////////////////////////////////////////
		if (num%4==0&&(num%400==0||num%100!=0)) {
			System.out.println(num+" is a leap year");
		} else {
			System.out.println(num+" is not a leap year");
		}
	}
	public static void prime(int num) {/////////////////////////////////////////
		boolean pass=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				pass=true;
				break;
			}	
		}
		if(pass) {
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}	
	}
	public static void prime100() {/////////////////////////////////////////////
		int count=0;
		int sum=0;
		for(int i=0;i<=100;i++) {
			boolean pass=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					pass=true;
					break;
				}
			}
			if (!pass) {
				System.out.println(i+"is aprime number");
				count++;
				sum=sum+i;
			} else {
			}
		}
		System.out.println("total count of numbers up to 100 is "+count);
		System.out.println("total sum of numbers up to 100 is "+sum);
	}
	public static void febonacci() {///////////////////////////////////////////////
		int a=0;
		int b=1;
		int c;
		for(;a>=0;) {
			System.out.println(a);	
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void swap() {
		int a=22;
		int b=44;
		int c;
		System.out.println("value of a is "+a+"before swap");
		System.out.println("value of b is "+b+"before swap");
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		c=a;
		a=b;
		b=c;
		
		System.out.println("value of a is "+a+"after swap");
		System.out.println("value of b is "+b+"after swap");
	}
	
	public static void reverseprime100() {
		int count=0; 
		int sum=0;
		for(int i=100;i>=2;i--) {
				boolean pass=false;
				for(int j=2;i>j;j++) {
					if(i%j==0) {
						pass=true;
						break;
					}
				}
				if (!pass) {
					count=count+1;
					sum=sum+i;
					System.out.println("prime number "+i);
				} 	
			}
		System.out.println("total number of prime number in 1to 100 is "+count);
		System.out.println("sum of all primr number from 1 to 100 is "+sum);
	
	}
	 
	 public static void sequenceprime() {
		 for(int i=2;i<=100;i++) {
				boolean pass=false;
				for(int j=2;i>j;j++) {
					if(i%j==0) {
						pass=true;
						break;
					}
				}
				if (!pass) {
					System.out.println("prime number "+i);
				} else {

				}
			}
	}
	 public static void reversestring(String name) {	
		String reverse="";
		for(int a=name.length()-1;a>=0;a--) {      
			reverse=reverse+name.charAt(a);
		}
		System.out.println(reverse);
	}
	
	 public static void whilereversestring(String name) {
		int a=name.length()-1;
		 
		while(a>=0) {
			System.out.print(name.charAt(a));
			a--;
		}
		 
	 }
	 public static void reversenumber(int num) {
			
		 int reverse=0;
		 
		 while(num>0) {
			 
			 int remainder=num%10;
			 reverse=reverse*10+remainder;
			 num=num/10;
			 
		 }
		 System.out.println("reverse of number is "+reverse);
	}
	
	 
	public static void arrayaccending() {
		
			int[] gaurav= {0,0,1,0,1,1,0,1};
			int patil;
			for(int i=0;i<gaurav.length;i++) {
				for(int j=i;j<gaurav.length;j++) {  
											
					if(gaurav[i]>=gaurav[j]) {
					patil=gaurav[i];			
					gaurav[i]=gaurav[j];		
					gaurav[j]=patil;				
				}
				}
				System.out.print(gaurav[i]+"  ");
			}	
	}
	 public static void scannerleap() {
		 Scanner obj=new Scanner(System.in);
			System.out.println();
			System.out.println("please enter year");
			int year=obj.nextInt();
			if(year%4==0 && (year%400==0 || year%100!=0)) {
				System.out.println(year+" is a leap year");
			}
			else {
				System.out.println(year+" is not a leap year");
			}
		
	}
	 public static void sortarray() {
		

	 int[] gaurav= {1,0,3,0,1,0,4,5};
			Arrays.sort(gaurav);
			
			for(int i=gaurav.length-1;i>=0;i--) {
				System.out.print(gaurav[i]+" ");
			}
	 }
		
	 public static void palindromstring(String gaurav) {
		 
			String revers="";
			for(int i=gaurav.length()-1;i>=0;i--) {
				
				revers=revers+gaurav.charAt(i);
						
			 }
				if(revers.equals(gaurav)) {
					System.out.println("string is palindrom>> "+revers);
				}
				else {
					System.out.println("string is not palindrom>> "+revers);
				}
	}
	
public void palindromnumber() {
	int num=1232;
	int c=num;
	int remainder;
	int reverse=0;
	for(;num>0;) {
		remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
	}
	if (c==reverse) {
		System.out.println("palindrome number");
	} else {
		System.out.println("not palindrome number");
	}
}

public static void secondhighestnumber() {
	int[] gaurav= {1,2,3,4,5,65,89,77,898};
	int patil;
	System.out.println("DECENDING ORDER IS");
	for(int i=0;i<gaurav.length;i++) {
		for(int j=i;j<gaurav.length;j++) {
			
			if(gaurav[i]<gaurav[j]) {
				patil=gaurav[i];
				gaurav[i]=gaurav[j];
				gaurav[j]=patil;
						
			}
		}
		System.out.print(gaurav[i]+" ");
	}
	System.out.println();
	System.out.print("second highest number is"+gaurav[1]);
	
}


public static void removespace(String sentence) {
	
	System.out.println(sentence.replace(" ", ""));
}

public static void uniquechar(String str) {  
	 
	 char String []= str.toCharArray();
     for (int i = 0; i < String.length; i++) {
         boolean flag = false;
         for (int j =0; j < String.length; j++) {
             // checking if two characters are equal
             if (String[i]== String[j] && i!=j )  
             {  
            	
                 flag = true;       //j=0 &    !flag ===>unique number    GURV
                 String[j]='0';          //j=i+1 & flag====>duplicate number once  A 
             }                           //j=0 &    flag ====>repeate duplicate number AA
         }								 //j=i+1 & !flag====>unique+duplicate once  GURAV
         if (flag && String[i]!='0') {
             System.out.print(str.charAt(i));
         }
     }
}

public static void duplicatechar(String pushpa) {		
	
			  int count;
			  
			  char String []= pushpa.toCharArray();// this is use for string convert to char
			                                                           // like m y n a m e 
			
			  System.out.print(" Duplicate character in a string:");
			  
			  for( int i =0; i<String.length; i++) {
			   count=1;
			   for(int j=i+1; j<String.length; j++) {
			    if(String[i]==String[j] && String [i]!=' '){
			      count++;
			      String[j]='0';// 0 replace cuplicate character like my na0e
			    }                //boz netx time this m is not count
			   }
			   if (count>1 && String[i]!='0') {
			    System.out.print(String[i]);
			   }
			  }
			 }



public static void duplicatearraynum() {
					int[] gaurav= {10,20,30,30,20,10,40,50,10,10,10,101,10,987};
	
						for(int i=0;i<gaurav.length;i++) {
							boolean flag=false;
						for(int j=0;j<gaurav.length;j++) {
							if(gaurav[i]==gaurav[j] && i!=j) {
								gaurav[j]=0;
								flag=true;
								
							}										
		 }												 		     
				    if (flag && gaurav[i]!=0) {			//j=0 & flag====>duplicate number once  10 20 30 
				System.out.print(gaurav[i]+" ");	    //j=0 & !flag====>unique  40 50 101
		}
	}
}

			public static void fartocelcius(double farhrenheit) {
		
				double Celsius=(farhrenheit-32)*5/9;                //  ((f-32)*5)/9;    
				System.out.println(Celsius);
			}
			
			
			public static void simpleinterest(double amount,double interest,double time) {
				double result=amount*(1+interest*time);
				System.out.println("amount with the simple interest is "+result);
			}
			
			public static void sumoftwoarray() {
				
				int[] array={5,6,7,8,9,10};
				int[] array1={5,6,7,8,9,10};
				int sum=0;
				
				for(int i=0;i<array.length;i++) {
					sum=sum+array[i];
				}
				for(int i=0;i<array1.length;i++) {
					sum=sum+array[i];
				}
				
				System.out.println("SUM OF TWO ARRAYS IS"+sum);
				
			}

		public static void avrageoftwoarray() {
			
			int[] array={5,6,7,8,9,10};
			int[] array1={5,6,7,8,9,10};
			int sum=0;
			
			
			
			for(int i=0;i<array.length;i++) {
				sum=sum+array[i];
			}
			for(int i=0;i<array1.length;i++) {
				sum=sum+array[i];
			}
			System.out.println("sum is"+sum);
			double average=sum/(array.length+array1.length);
				System.out.println("average of array is"+average);
			
		}
		
		
		public static void mergetwoarrays() {
			int[] a= {1,65,98,78,78,98,666};
			int[] b= {1,66,97,76,79,98};
			
			int[] c=new int[a.length+b.length];
			
			for(int i=0;i<a.length;i++) {
				c[i]=a[i];       //c[7]=={1 to 666}
			}
			for(int i=0;i<b.length;i++) {
				c[i+a.length]=b[i];  //c[13]={1.....666 to............ 98}
			}
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i] +" ");
			}
			
			System.out.println();
		}
		
		
		public static void merged_three_array() {
			int[] gaurav= {10,20,30,40,50,60,70,80,90,100};
			int[] mahesh= {11,12,13,14,15,16,17,18,19,20};
			int[] suresh= {21,22,23,24,25,26,27,28,29,30};
			
			int[] patil =new int[gaurav.length+mahesh.length+suresh.length];
			
			for(int i=0;i<gaurav.length;i++) {
				patil[i]=gaurav[i];
				
			}
			
			for(int i=0;i<mahesh.length;i++) {
				patil[gaurav.length+i]=mahesh[i];
				
			}
			
			for(int i=0;i<suresh.length;i++) {
				patil[gaurav.length+mahesh.length+i]=suresh[i];
				
			}
			
			Arrays.sort(patil);
			for(int i=0;i<patil.length;i++) {
				System.out.print(patil[i]+" ");
				
			}
		}
		
		
		public static void copyarray() {
			int[] a= {1,65,98,78,78};
				int[]b=Arrays.copyOf(a, 5);
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
			
		}
		
		public static void comparearray() {
			int[]gaurav= {10,9,8,7,6,5,4,3,2,1};
			int[]patil= {10,9,8,7,6,5,4,3,2,1};
			int[] c= {1,65,9,8,7};
			
			for(int i=0;i<gaurav.length;i++) {
				for(int j=0;j<c.length;j++) {
					if (gaurav[i]==c[j]) {
						System.out.println("arrays are same  "+gaurav[i]);
					}
					
					}
				}
			}
		public static void insertnumberinaray() {
			
			int []a= {10,45,80,90,100,120,0};
			int index=3;
			
			for(int i=a.length-1;i>index;i--) {
				a[i]=a[i-1];
				
			}
			a[index]=5000;
			System.out.println(Arrays.toString(a));
		}
		
		public static void reversentence(String str) {
			
			String b[]=str.split(" ");
			
			for(int i=b.length-1;i>=0;i--) {
				System.out.print(b[i]+" ");
			}	
		}
public static void armstrong(int num) {
			  
			  int d=num;
			  int len=0;
			  while(d>0) {
			   len=len+1;
			   d=d/10;
			  }
			  
			  int d1=num;
			  int rem;
			  int arm=0;
			  while(d1>0) {
			   rem=d1%10;
			   int mul=1;
			   for(int i=1;i<=len;i++) {
			    mul=mul*rem;
			   }
			   arm=arm+mul;
			   d1=d1/10;
			  }
			  if(arm==num) {
			   System.out.println("no.is arm: "+num);
			  }else {
			   System.out.println("no.is nOT arm: "+num);
			  }
		
	}

public static void armstrong() {
	System.out.println("enter number");
	Scanner obj=new Scanner(System.in);
	int num=obj.nextInt();
	double remainder=0;
	double result=0;
	int orinum=num;
	while(orinum!=0) {
		remainder=orinum%10;
		result=result+Math.pow(remainder, 3);
		orinum=orinum/10;
	}
	
	if (result==num) {
		System.out.println(num+" is armstrong number");
	} else {
		System.out.println(num+" is not a armstrong number");
	}
}

public static void findchar_num(String gaurav) {
	
	StringBuffer chr=new StringBuffer();
	StringBuffer num=new StringBuffer();
	
	for(int i=0;i<gaurav.length();i++) {
		if(Character.isDigit(gaurav.charAt(i))) {
			num.append(gaurav.charAt(i));
		}
		else if(Character.isAlphabetic(gaurav.charAt(i))) {
			chr.append(gaurav.charAt(i));
		}

		
	}
	System.out.print(num+" ");
	System.out.println();
	System.out.print(chr+" ");

}
public static void accending1_12_123() {
	for(int i=0;i<=3;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(j+1);
		}
		System.out.println();
	}
}
public static void num_present_or_not_in_array(int b) {
	int[] a= {1,32,65,78,99,87,12};
	
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) {
			flag=true;
		}
	}
	if (flag) {
		System.out.println(b+" is present");
	} else {
		System.out.println(b+" is not present");
	}
}

	public static void remove_num_array(int num) {
		int[] a= {12,65,98,22,55,105,452,78,99};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
			}
		}
		
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void factorial() {
		int num=4;
		
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
	System.out.println(fact);
		}
	
	public static void asciivalue() {
		
		int var1='a';
		int var2='b';
		
		System.out.println("The ASCII value of a is: "+var1);  
		System.out.println("The ASCII value of a is: "+var2); 
	}
	
	


	public static void main(String[] args) {
		morningnew name = new morningnew();
			
		
			//m1(2100);
			//prime(65);
			//name.prime100();
			//reverseprime100();
			//name.febonacci();
			//swap();
			//reversestring("i am a don");
			//whilereversestring("i am vijaya patil");
			//reversenumber(654321);
			//arrayaccending();
			//scannerleap();
			//sortarray();
			//	palindromstring("bob");
			//name.palindromnumber(); 
		    //secondhighestnumber(); 
			//removespace("HELLO BOY"); 
			//uniquechar("PUSHPA PUSHPARAJ ");
			//duplicatechar("pushpa pushparaj");
			//duplicatearraynum();
			//fartocelcius(60);
			//simpleinterest(15000, 0.15, 6);
			//avrageoftwoarray();
			//sumoftwoarray();
			//mergetwoarrays();
	    	//merged_three_array();
			//copyarray();
			//comparearray();
			//insertnumberinaray();
			//reversentence("i am gaurav patil");
			//armstrong(123); 
			//armstrong();
			//findchar_num("patilgaurav775@gmail.com");
			//accending1_12_123();
			//remove_num_array(55);
			//factorial();
			//asciivalue();
		
		
	}

}
