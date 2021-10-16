package com.incubyte.assessment;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public static int add(String string){
		if(string.isEmpty())
		{
			return 0;
		}
		else if(string.contains(","))
		{
			String[] input=string.split(",");
			return Integer.parseInt(input[0])+Integer.parseInt(input[1]);
		}
		else
		{
			return Integer.parseInt(string);
		}
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
