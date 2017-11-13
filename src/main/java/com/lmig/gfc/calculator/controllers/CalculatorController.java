package com.lmig.gfc.calculator.controllers;

import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;


@Controller
public class CalculatorController {
	
	private Calculator calc = new Calculator();

	@RequestMapping("/")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
	}

	@RequestMapping("/doMath")
	public ModelAndView selectNumber(double firstNumber, String operator, double secondNumber) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		
		double result = 0;
		
		// Figure out how to use the Calculator class
		// to calculate the result from firstNumber, secondNumber,
		// and operator.
		
		
		result=calc.calculate(firstNumber, operator, secondNumber);
		    
		
		mv.addObject("result", result); 
		// create an array list here

		
		mv.addObject("history", calc.getHistory());   //add object into variable called List 
		// up to here
		return mv;
		
	}

}