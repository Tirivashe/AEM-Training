package com.shamhu.StringManipulation;
import java.text.*;
import java.util.*;

public class DateTimeToStr {

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        System.out.println("Converted String: " + strDate);

	}

}
