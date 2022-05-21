package Validation;

import java.util.Scanner;
//  should be 8 characters,1 Capital alphabet,1 small alphabet,
//  1 special character(@,$,%,#),1 number
public class password_Validation {

	public static void main(String[] args) {
		System.out.println("Enter Password to check whether it is in correct format or not?");
        Scanner scan =new Scanner(System.in);
        String pwd=scan.next();
        int small_Switch=0,caps_Switch=0,number_Switch=0,spChar_Switch=0,switchh=0;
        
        if(pwd.length()>=8)
        {
        	for(int i=0;i<pwd.length();i++)
        	{
        		if(spChar_Switch==0 && pwd.charAt(i)=='@' || pwd.charAt(i)=='$' || pwd.charAt(i)=='%' ||
        				pwd.charAt(i)=='#') {
        			spChar_Switch=1;
        			switchh++;
        		}
        		else if(small_Switch==0 && pwd.charAt(i)>=97 && pwd.charAt(i)<=122){
        			small_Switch=1;
        			switchh++;
        		}
        		else if(caps_Switch==0 && pwd.charAt(i)>=65 && pwd.charAt(i)<=90) {
        			caps_Switch=1;
        			switchh++;
        		}
        		else if(number_Switch==0 && pwd.charAt(i)>=48 && pwd.charAt(i)<=57) {
        			number_Switch=1;
        			switchh++;
        		}
        	}
        }
        if(switchh==4) 
        	System.out.println("Valid Password");
        else
        	System.out.println("Invalid format");
        
	}
}
