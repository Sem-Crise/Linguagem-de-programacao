package Aula04;
import java.util.Scanner; 

public class Desafio07 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo para realizar o cálculo fatorial: ");
		
		int numero = scanner.nextInt();
		long fatorial = 1;
		int contador = 1;
		
		while (contador <= numero) {
			fatorial *= contador;
			contador ++ ;
		
		}
		
		
	System.out.println("O cálculo fatorial do " + numero + " é: " + fatorial);
		
		
	}
	
 }

