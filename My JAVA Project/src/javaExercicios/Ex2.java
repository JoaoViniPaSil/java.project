package javaExercicios;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		num1 = 84;
		
		int  num2;
		num2 = 29;
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("--------------------");
		System.out.println("Float");
		
	
		float soma = num1 + num2;
		
		System.out.println("O número que você está pensando é: "+ soma);
		System.out.printf("O número que você está pensando é: %.0f", soma);
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Double");
		
		double soma2 = 113;
		System.out.println(soma);
		
		System.out.println("----------------------------------------");
		System.out.println(" ");
		
		String str1 = Integer.toString(num1);
		String str2 = Float.toString(soma);
		String str3 = Double.toString(soma2);
		
		System.out.println(str1);
		System.out.println(soma);
		System.out.println(soma2);
		
	}

}
