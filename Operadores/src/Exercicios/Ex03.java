package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		float bruto,adicional,extras,descontos,liquido;
		Scanner input = new Scanner(System.in);
		Locale customLocale = new Locale("pt", "BR");
        input.useLocale(customLocale);
        
		//Varivaeis
		System.out.println("\n Insira o valor do salário bruto: ");
		bruto = input.nextFloat();
		System.out.println("\n Insira o valor do adicional noturno: ");
		adicional = input.nextFloat();
		System.out.println("\n Insira as horas extras trabalhadas: ");
		extras = input.nextFloat();
		System.out.println("\n Insira o valor dos descontos: ");
		descontos = input.nextFloat();
		
		//calculo salario liquido
		liquido = (bruto+adicional+extras*5-descontos);
		System.out.println("\n O valor do salario liquido é :"+liquido+" R$");
		
		
		
	}

}
