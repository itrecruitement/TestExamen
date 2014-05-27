package edu.esprit.examenjee;

public class Fibo {
	
	public Fibo(){
		
	}
	public int process(int n){
		if (n<2) return 5;
		else return process(n-1)+process(n-2);
	}

}
