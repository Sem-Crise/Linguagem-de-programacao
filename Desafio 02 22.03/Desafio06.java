package Aula04;
import java.util.Scanner;


public class Desafio06 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Digite um número de 1 a 7 correspondente aos dias da semana e veja se ele é dia útil ou final de semana: ");
		
		int numero = scanner.nextInt();
		
		String diasemana = " ";
		
		switch (numero) {
		
		case 1:
			diasemana = "Final de semana";
			break;
			
		case 2:
			diasemana = "Dia Útil";
			break;
			
		case 3:
			diasemana = "Dia Útil";
			break;
			
		case 4:
			diasemana = "Dia Útil";
			break;
			
		case 5:
			diasemana = "Dia Útil";
			break;
			
		case 6:
			diasemana = "Dia Útil, sextouu";
			break;
			
		case 7:
			diasemana = "Final de semana";
			break;
		
		default:
		    diasemana = "Número inválido";
		    break;
			
		}
		
		
		System.out.println("O dia " + numero + " da semana é um: " + diasemana);
		
		
	}
	
} 