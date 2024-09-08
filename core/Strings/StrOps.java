package Strings;

public class StrOps {

	String str1;
	String str2;
	String str3;
	static int result, idx;
	char ch;

	StrOps(String str1, String str2, String str3) {
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;

	}

	public static void main(String[] args) {
		//  Auto-generated method stub
		String str1 = "When it comes to web programming, java is #1, java is robust";
		String str2 = new String(str1);
		String str3 = "Java Strings are powerful.";
		StrOps so = new StrOps(str1, str2, str3);

		// StrLength(str1);
		// StrLength(str2);
		// StrLength(str3);
		// pass 3 string at once's

		// static method don't wont object of class
		StrLength(str1, str2, str3);

		// public method use class object for method reference
		so.compareStr(str1, str2, str3);

		indexx(str1);

	}

	static void StrLength(String str1, String str2, String str3) {
		System.out.println("Length of your Strings");
		System.out.println("Your string length is : " + str1.length());
		System.out.println("Your string length is : " + str2.length());
		System.out.println("Your string length is : " + str3.length());

	}

	public void compareStr(String str1, String str2, String str3) {
		if (str1.equals(str2)) {
			System.out.println("Str1 & Str2 equals");
		}
		if (str2.equals(str3)) {
			System.out.println("Str2 & Str3 equals");
		} else {
			System.out.println("Str2 & Str3 dose not equals");
		}

	}

	static void indexx(String str1) {
		System.out.println("All the String related functions ");
		System.out.println("\nYour String : " + str1);
		System.out.println("Index of first occurence of java word : " + str1.indexOf("java"));
		System.out.println("Index of last occurence of java word : " + str1.lastIndexOf("java"));

		System.out.println(str1.charAt(0));
		idx = str1.compareTo("When");
		System.out.println(idx);
	}

}
