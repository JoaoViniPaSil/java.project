
public class Aula05Relacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(5 < 2);
		
		int num1 = 40;
		
		System.out.println(num1 != 67);
		System.out.println(num1 != 40);
		
		int num2 = 32;
		System.out.println(num1 <= num2);
		
		boolean comparacao = num1 >= num2;
		System.out.println(comparacao);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean logicaE = verdadeiro && falso;
		System.out.println("logica E: " + logicaE);
		
		boolean logicaOU = true || true;
		System.out.println(logicaOU);
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		
		System.out.println("-----------------------------");
		
		//COMPRAS STRINGS
		
		String nome1 = "Jãozinho";
		String nome2 = "Jãozinho";
		
		System.out.println(nome1 == nome2);
		String nome3 = new String("Jãozinho");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));

	}

}
