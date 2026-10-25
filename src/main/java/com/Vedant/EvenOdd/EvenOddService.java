package com.Vedant.EvenOdd;

import org.springframework.stereotype.*;

@Service
public class EvenOddService {

	public String check(int num){
		String msg ="";
		if(num % 2 == 0){
			msg = num + " is Even";
		}
		else{
			msg = num + "  is Odd";
		}
		return msg;
	}

}
