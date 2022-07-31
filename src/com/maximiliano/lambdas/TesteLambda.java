package com.maximiliano.lambdas;

public class TesteLambda {

	public static void main(String[] args) {

		System.out.println("====inicio do teste=====");
		
		//Implementação da classe anonima Runnable
		Runnable r1 =new Runnable() {
			
			@Override
			public void run() {
					System.out.println("Estudando a expressão lambda 1. ");
				
			}
		};
		
		Runnable r2; 
		         r2 = () //Lista de argumentos
					 -> // Seta
		 				System.out.println("Estudando a expressão da lambda 2.");//corpo
		
		r1.run();
		r2.run();
	}

}
