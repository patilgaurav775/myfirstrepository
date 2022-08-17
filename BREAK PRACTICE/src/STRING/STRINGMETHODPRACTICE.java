package STRING;

public class STRINGMETHODPRACTICE {		//string is immutable
	 public static String var="GAURAV";
	 public static String var1="gaurav";
	
	public static void main(String[] args) {
		System.out.println(var.length());            //1 to ..........
		System.out.println(var.charAt(4));			//0 to ............
		System.out.println(var.isEmpty());			//empty aahe ki nahi
		System.out.println(var.equals(var1));			//same aahe ki nahi  yamdhe small capital pn baghital jaat
		System.out.println(var.equalsIgnoreCase(var1));  //same aahe ki nahi no matter which is capital and which is small
		System.out.println(var.startsWith("Gau"));			//start hote ki nahi te check karte
		System.out.println("ends with"+var1.endsWith("Av"));					//end hote ki nahi te check karte
		System.out.println(var.toLowerCase());				//lowercase madhe convert karat
		System.out.println(var1.toUpperCase()); 			//uppercase madhe convert karte
		System.out.println(var.toLowerCase().toUpperCase().startsWith("gau"));   //2 method sobat use kelya==>STRING METHOD CHAINING
		System.out.println(var.indexOf("R"));					//postion of R check kel jaat
		System.out.println(var.concat(" "+var1));  /*OR*/    //yamdhe navin obj create zala no pointing jas khali " a "mahun kela aahe point
		String a=var.concat(" SANJAY PATIL");     //aapn string chi value change nahi karu shakat try kela tr new bject banavun takto java tyacha
		System.out.println(a);
		System.out.println(var.contains("u"));
		System.out.println(var.toLowerCase().contains("u"));   //method chaining
		System.out.println(var.replace("AU", "au"));		//AU la replace kela au ne
		String gaurav="    i am a good boy     ";
		System.out.println(gaurav.split("g")[1]);     		//all willl return array of string.if you want to represent homogenous datatype in one variable 
		System.out.println(gaurav.trim());     					//trim remove front and back space but not in middle
		System.out.println(gaurav.indexOf("am"));				//index of a is shown pn jar a same aadhi asta tr tyla ignore kel jail am chi jodi shodhel java jar string nahi milala tar tr -1 yeto
		System.out.println(gaurav.indexOf("a", 2));    //second a ha 6no la aahe
		System.out.println(var.lastIndexOf("A"));    //last pasn baghel aani index pudhunach mojel
		System.out.println(var.substring(2));
		System.out.println("substring"+var.substring(2, 4));    //yamdhe 4 chya aat ghetle jail means2=U and 3=R
		char[] gp=var.toCharArray();						// yamdhe aapn sring la char cha array banavla means {g,a,u,r,a,v}
		System.out.println(gp[1]);
		
	}

}
