package com.autionpro.test;

import java.util.Scanner;
import com.autionpro.model.WaterBillCalci;

public class WaterBillTest {
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				boolean flag=true;
				while(flag) {
				System.out.println("Enter the Water meter reading :");
				WaterBillCalci  bill=new WaterBillCalci();
				bill.calculate();
				System.out.println("Your water bill is :"+bill.getBill());
				System.out.println("Want  calculate another  water bill y/n:");
				if(!sc.next().toLowerCase().equals("y")) {
					flag=false;
				}
				
				}
			}
	       
	        }
	    
	




	//Enter the Water meter reading :
	//300
	//Your water bill is :6075.0
	//Want  calculate another  water bill y/n:
	//y
	//Enter the Water meter reading :
	//150
	//Your water bill is :1575.0
	//Want  calculate another  water bill y/n:
	//n
}
