package Constructor;

import java.util.Scanner;

public class Customer {
      public static void main(String[] args) {
    	  Hotel hotel=new Hotel();
    	  String todaySpecial=hotel.todaySpecial;
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("press 1 to confirm");
    	  int choise=scan.nextInt();
    	  if(choise==1) {
    		  Hotel food=new Hotel(todaySpecial);
    	  }
    	  else {
    		  System.err.println("Invalid Input");
    	  }
	}
      
}
