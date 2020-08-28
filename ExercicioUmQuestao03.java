package listaUmAlcemir;

import java.util.Scanner;

public class ExercicioUmQuestao03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double peso;
		
		System.out.println("Digite o peso: ");
		peso = Double.parseDouble(ler.nextLine());
    
		System.out.println(peso);

		double multa = 0, excesso;

		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;

		} 
		else{
			multa = 0;
			excesso = 0;
		}	
    System.out.println("O valor da multa foi de: "+ multa);
	}
}
