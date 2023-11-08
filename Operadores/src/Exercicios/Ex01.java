package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        float salario, abono, novoSalario;
        Scanner input = new Scanner(System.in);
        Locale customLocale = new Locale("pt", "BR");
        input.useLocale(customLocale);
        
        // Input das variáveis salario e abono
        System.out.println("\nDigite o valor do salário: ");
        salario = input.nextFloat();
        System.out.println("Digite o valor do abono: ");
        abono = input.nextFloat();
        
        // Novo salário = soma dos valores
        novoSalario = salario + abono;
        System.out.println("\nO valor do novo salário é: " + novoSalario + " R$");
    }
}
