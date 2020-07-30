package com.shamhu.StringManipulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrToDateTime {

	public static void main(String[] args) throws ParseException {
		String sDate1="07/29/2020";  
	    Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);  
	    System.out.println("String conversion to date: " + date1);  

	}

}
