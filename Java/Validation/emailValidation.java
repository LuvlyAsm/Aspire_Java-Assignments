package Validation;

import java.util.Scanner;

public class emailValidation {
	public static void main(String[] args) {
		System.out.println("Enter email to check whether it is email or not?");
        Scanner scan =new Scanner(System.in);
        String email=scan.next();
        int switchh=0;
        for(int i=0;i<email.length();i++)
        {
        	if(email.charAt(i)=='@') {
        		for(int j=i+1;j<email.length();j++)
        		{
        			if(email.charAt(j)=='.')
        			{
        			switchh=1;
        			System.out.println("Valid Email ID");
        			break;
        			}
        		}
        	}
        }
        if(switchh==0)
        	System.out.println("Invalid email ID");
        	
	}

}
