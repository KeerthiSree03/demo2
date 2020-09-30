package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;



class Test {

public static void main(String args[])
{
	LocalDate d=null;
	String ds = "December 15, 2004";
	d = LocalDate.parse(ds, DateTimeFormatter.ofPattern("MMMM d, yyyy"));
	d = LocalDate.parse(ds, DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
	System.out.println(d);
}
}
