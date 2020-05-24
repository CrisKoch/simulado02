import java.util.Locale;
import java.util.Scanner;

public class simulado02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Leitura do nome e salario
		
		String nome;
		double salario, porcEntrada, totalFinanciado, valorPrestacao, prestPermitida;
		int prestacoes;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		
		nome = sc.nextLine();
		
		
		System.out.printf("Salario: ");
		
		salario = sc.nextDouble();
		
		while (salario <= 0) {
			System.out.print("Valor inválido. Digite novamente");
			salario = sc.nextDouble();
		}
		//Leitura do financiamento
		
		do {
			System.out.print("Numero de prestaçoes: ");
				prestacoes = sc.nextInt();
			System.out.print("Porcentagem de entrada: ");
				porcEntrada = sc.nextDouble();
			System.out.print("Valor total financiado: ");
				totalFinanciado = sc.nextDouble();
		
		valorPrestacao = (totalFinanciado - (totalFinanciado * porcEntrada / 100)) / prestacoes;
		prestPermitida = salario * 30 / 100;
		if ( valorPrestacao > prestPermitida) {
		System.out.println("O valor da prestação está acima do permitido. Diminua o valor total financiado, aumente a entrada ou o número de prestações");
		}
		}
		while ( valorPrestacao > prestPermitida);
		
		
		
			
			
		sc.close();
	}

}
