package com.incubyte.assessment;

public class Delimiters {
	
	

	public static int add(String string){
		int result=0;
		String delimiter=",|\n|//|;";
		String[] scanString=string.split(delimiter);
		String numbers[];
		int index=0;
		
		for(int i=0;i<scanString.length;i++) {
			if(scanString[0].equals("//")) {
				index=index+2;
				
			}
			
		}
		for(int i=0;i<scanString.length;i++) {
			result=result+Integer.parseInt(scanString[i]);
	}		
//		int result=0;
//		String[] addNumber=string.split(",|\n");
//		for(int i=0;i<addNumber.length;i++) {
//			result=result+Integer.parseInt(addNumber[i]);
//		}
		
		
		return result;
		
	}

}

