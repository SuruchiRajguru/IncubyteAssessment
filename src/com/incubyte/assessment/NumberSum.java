package com.incubyte.assessment;

public class NumberSum {

	public static int add(String numbers) {
		int result=0;
		String[] numbersAdd=numbers.split(",");
//		for(int i=0;i<numbersAdd.length;i++) {
//			result=result+Integer.parseInt(numbersAdd[i]);
//		}
		for(String num:numbersAdd)
		{
			result=result+Integer.parseInt(num);
		}
		return result;
	}

}
