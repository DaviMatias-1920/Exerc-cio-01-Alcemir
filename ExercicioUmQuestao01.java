package listaUmAlcemir;

import java.util.Scanner;


public class ExercicioUmQuestao01 {
	public static void main (String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite o valor que foi pago: ");
		String valorPago = valor.nextLine();
		double valorPagoConvertido = Double.valueOf(valorPago);
		System.out.print("Digite o custo do produto: ");
		String valorPreco = valor.nextLine();
		double valorPrecoConvertido = Double.valueOf(valorPreco);
		double troco = valorPagoConvertido - valorPrecoConvertido;
		
		if (valorPagoConvertido > valorPrecoConvertido) {
			System.out.print("O troco será de: "+troco);
		}
		else {
			System.out.print("Não há troco.");
		}
	}

}
