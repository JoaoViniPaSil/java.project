package javalogica;

import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
	 
			 
			 Scanner entrada = new Scanner (System.in);
			 
			 System.out.print("Digite seu nome: ");
			 String nome = entrada.nextLine();
			 System.out.println(nome);
			 
			 int idade = 17;
			 System.out.println(idade);
			 
			 System.out.print("Digite sua idade: ");
			 idade = entrada.nextInt();
			 System.out.println(idade);
			 
			 System.out.println("");
			 
			 System.out.println("Olá, " + nome + "! Seja bem vindo gatão, você tem " + idade + " anos.");
			 
	}

}
