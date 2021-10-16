package com.incubyte.assessment;

public class NewLineFeed {

	public static int add(String string) {
		int result=0;
		String[] addNumber=string.split(",|\n");
		for(int i=0;i<addNumber.length;i++) {
			result=result+Integer.parseInt(addNumber[i]);
		}
		
		
		return result;
	}

}
