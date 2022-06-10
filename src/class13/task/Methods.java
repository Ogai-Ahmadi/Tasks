package class13.task;

public class Methods {
//here Create a method that will take 2 parameters as a numbers and prints which number is larger.
	void max(int num1,int num2) {
		
		if(num1>num2) {
			System.out.println(num1 + " is larger than "+num2);
		}else {
			System.out.println(num2 + " is larger than "+num1);
		}
	}
//Create a method that will print whether given String is palindrome or not.
	void palindrome() {
		String word="madam";
		
		for(int i = 0;i<word.length();i++) {
			
		for(int j= word.length()-1;j>0; j--) {
			if(word.charAt(i)==word.charAt(j)) {
				System.out.println("The word is palindrome");
				break;
			}else {
				System.out.println("The word is not palindrome");
				break;
			}
		}
break;}		
}
//Create a method that will say Hello in different language
//based on the country that will passed when method is executed
	void greetings(String country) {
		String language=" ";
		
		switch(country) {
		case "USA":
		language="Hello";
		break;
		case "Afghanistan":
			language="Salam Alaikum";
			break;
		case "India":
			language="Namaste";
			break;
		case "Maxico":
			language="Hola";
		default:
			System.out.println("No entery for this country");
		}System.out.println(language);
	}
//Create a method createEmail(). Based on values of users name, lastName and email type, 
//your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
String createEmail(String name, String lname, String domain) {
	return name+lname+domain;
	
}
//Write a method to return whether given number is prime or not?
void isPrime(int num) {

boolean flag = false;
for (int i = 2; i <= num / 2; ++i) {
  // condition for nonprime number
  if (num % i == 0) {
    flag = true;
    break;
  }
}

if (!flag)
  System.out.println(num + " is a prime number.");
else
  System.out.println(num + " is not a prime number.");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods n = new Methods();
		n.max(4, 8);
		Methods st = new Methods();
		st.palindrome();
		Methods country = new Methods();
		country.greetings("Afghanistan");
		Methods email =new Methods();
		System.out.println(email.createEmail("Ogai", "Ahmadi","@gmail.com"));
		Methods prime = new Methods();
		prime.isPrime(29);
		
		
	}

}
