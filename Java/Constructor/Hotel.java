package Constructor;

import java.util.Scanner;

public class Hotel {
	String todaySpecial="Biryani";
	int price=150;
	Scanner scan=new Scanner(System.in);
	
	Hotel(){
    	System.out.println("Welcome to Hotel");
    	System.out.println("Today's special is "+todaySpecial);
    }
	Hotel(String food){
		System.out.println("You Ordered "+todaySpecial);
		System.out.println("Pay "+price+"rs");
	
		System.out.println("Enter amount");
		int money1=scan.nextInt();
		Hotel food2=new Hotel(todaySpecial,money1);
		
		}
		
	Hotel(String food,int money){
		System.out.println("You Ordered "+todaySpecial);
		if(money>150) {
			System.out.println("Thanks for paying...take your balance "+(money-price));
		}
		else if(money==150) {
			System.out.println("Thanks for Paying");
		}
		else {
			System.out.println("Give "+(price-money)+" more...Insufficient balance");
	         }
	
    }
	
}
