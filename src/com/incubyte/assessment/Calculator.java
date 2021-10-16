package com.incubyte.assessment;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	//for empty string
	public static int add(String string) {
		return 0;
	}

	public static int add(String number,String delimeter)
	{
		int result=0;
		String[] inputString=number.split(delimeter);	
		List nonNegativeNumbers=new ArrayList();
		
		for(String input:inputString)
		{
			int negativeNumbers=Integer.parseInt(input.trim());
			if(negativeNumbers<0)
			{
				nonNegativeNumbers.add(negativeNumbers);
			}
			result=result+negativeNumbers;
		}
		return result;
	}
	

	
}
