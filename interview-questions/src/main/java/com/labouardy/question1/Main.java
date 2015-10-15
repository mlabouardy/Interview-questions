package com.labouardy.question1;

import java.util.Scanner;

//given a polynomial function P(x), calculate the derivative of P

public class Main {
	public static void main(String[] args) {
		//3+2x+5x^2+7x3
		Polynomial p=new Polynomial(3);
		p.init();
		p.print();
		Polynomial p2=p.derivative();
		System.out.println();
		p2.print();
		
	}
	
	
}
