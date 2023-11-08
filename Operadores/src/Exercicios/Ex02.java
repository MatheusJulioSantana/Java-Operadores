package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,media;
		Scanner input = new Scanner(System.in);
		Locale customLocale = new Locale("pt", "BR");
        input.useLocale(customLocale);
        
		//input das varivaveis n
		System.out.println("\n Digite o valor da nota 1: ");
		n1 = input.nextFloat();
		System.out.println("\n Digite o valor da nota 2: ");
		n2 = input.nextFloat();
		System.out.println("\n Digite o valor da note 3  ");
		n3 = input.nextFloat();
		System.out.println("\n Digite o valor da note 4  ");
		n4 = input.nextFloat();
		
		//calculo da media = valores somados/quantidade de valores
		media = (n1+n2+n3+n4)/4;
		
		// Exibe a média com uma casa decimal
        System.out.printf("\nA sua média é: %.1f", media);
	}

}