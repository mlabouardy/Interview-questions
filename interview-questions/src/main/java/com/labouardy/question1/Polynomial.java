package com.labouardy.question1;

import java.util.Scanner;

public class Polynomial {
	
	private Double coefficients[];
	private int degree;
	
    public Polynomial(int degree){
    	this.degree=degree;
    	this.coefficients=new Double[degree+1];
    }
    
    public void init(){
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<=degree;i++){
    		System.out.print("Enter a["+i+"]:");
    		coefficients[i]=sc.nextDouble();
    	}
    }
    
    public Polynomial derivative(){
    	Polynomial pd=new Polynomial(degree-1);
    	for(int i=1;i<=degree;i++){
    		pd.coefficients[i-1]=coefficients[i]*i;
    	}
    	return pd;
    }
    
    public void print(){
    	int i=0;
    	for(Double a:coefficients){
    		if(a!=0){
    			if(i==0)
    				System.out.print(a+"");
    			else if(i==1)
    				System.out.print(a+"*x");
    			else
    				System.out.print(a+"*x^"+i);
    			if(i!=coefficients.length-1)
    				System.out.print("+");
    		}
    		i++;
    	}
    }

    
}
