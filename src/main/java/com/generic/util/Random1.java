package com.generic.util;

import java.util.Random;

public class Random1 {
public int getdata() {
	Random r=new Random();
	int ran = r.nextInt(1000);
	return ran;
}
}
