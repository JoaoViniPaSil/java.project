package fiap.tokio.logica.exercicios;

import java.util.Scanner;

public class Aula05Manipulacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario = 1212.50;
		String salarioStr = Double.toString(salario);
		System.out.println(salarioStr);
		
		
		String precoStr = "2.99";
		double preco = Double.parseDouble(precoStr);
		System.out.println(preco);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		String numeroTexto = entrada.nextLine();
		
		float numero = Float.parseFloat(numeroTexto);
		System.out.println(numero);
		
		
	

	}
}
