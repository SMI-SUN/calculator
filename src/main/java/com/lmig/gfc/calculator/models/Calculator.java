package com.lmig.gfc.calculator.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calculator {
	
	private ArrayList<String> history = new ArrayList<String>();
	

	public double calculate(double firstNumber, String operator, double secondNumber) {
		
		double result = 0;
		
		if(operator.equals("+")) {
			//do math
			result = firstNumber + secondNumber; 
			history.add(0,firstNumber + " + " + secondNumber + " = " + result);
		}
		
		if(operator.equals("-")) {
			//do math
			result = firstNumber - secondNumber;
			history.add(0,firstNumber + " - " + secondNumber + " = " + result);
		}
		
		if(operator.equals("*")) {
			//do math
			result = firstNumber * secondNumber;
			history.add(0,firstNumber + " * " + secondNumber + " = " + result);
		}
		
		if(operator.equals("/")) {
			//do math
			result = firstNumber / secondNumber;
			history.add(0,firstNumber + " / " + secondNumber + " = " + result);
		}
		
		if(operator.equals("^")) {
			//do math
			
			result = Math.pow(firstNumber, secondNumber );
			history.add(0,firstNumber + " ^ " + secondNumber + " = " + result);
				
			
		}
		
		if(operator.equals("√")) {
				//do math square root
			
			result = Math.pow((double)secondNumber, (double)firstNumber);    
			     
			history.add(0,firstNumber + " √ " + secondNumber + " = " + result);
						
			}		
		return result;
	}
		
 
	public ArrayList<String> getHistory() {
		return history;
	}
	
}





