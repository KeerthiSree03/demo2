package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public final class Clownfish {
	public static void main(String [] args) {
		
	
	 int result = 8;
	 loop: while (result > 7) {
	 result++;
	 do {
	 result--;
	 } while (result > 5);
	 break loop;
	 }
	 System.out.println(result);
	}
}
