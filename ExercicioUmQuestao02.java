package listaUmAlcemir;

import java.util.Scanner;

public class ExercicioUmQuestao02 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um valor para 'a': ");
		String variavelA = teclado.nextLine();
		double variavelAConvertida = Double.valueOf(variavelA);
		
		System.out.print("Digite um valor para 'b': ");
		String variavelB = teclado.nextLine();
		double variavelBConvertida = Double.valueOf(variavelB);
		
		System.out.print("Digite um valor para 'c': ");
		String variavelC = teclado.nextLine();
		double variavelCConvertida = Double.valueOf(variavelC);
		
		double delta = (variavelBConvertida * variavelBConvertida) - (4* variavelAConvertida * variavelCConvertida);
		double valorXUm = (-variavelBConvertida + Math.sqrt(Math.abs(delta))) / 2*variavelAConvertida;
		double valorXDois = (-variavelBConvertida - Math.sqrt(Math.abs(delta))) / 2*variavelAConvertida;
	
		System.out.print("O valor de x1 é: "+valorXUm);
		System.out.print("O valor de x2 é: "+valorXDois);
	}
}
