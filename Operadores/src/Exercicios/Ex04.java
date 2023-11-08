package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,resultado;
		Scanner input = new Scanner(System.in);
		Locale customLocale = new Locale("pt", "BR");
        input.useLocale(customLocale);
        
		//Variaveis
		System.out.println("\n Insira o primeiro valor : ");
		n1 = input.nextFloat();
		System.out.println("\n Insira o segundo valor : ");
		n2 = input.nextFloat();
		System.out.println("\n Insira o terceiro valor : ");
		n3 = input.nextFloat();
		System.out.println("\n Insira o quarto valor : ");
		n4 = input.nextFloat();
		
		//Calculo do resultado
		resultado = (n1*n2)-(n3*n4);
		System.out.println("\n O resultado do calculo é:"+resultado);
	
	}

}
