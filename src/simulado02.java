import java.util.Locale;
import java.util.Scanner;

public class simulado02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura do nome e salario

		String nome;
		double salario, porcEntrada, totalFinanciado, valorPrestacao, prestPermitida, entrada, valorFinanc;
		int prestacoes, opcao;

		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");

		nome = sc.nextLine();

		System.out.printf("Salario: ");

		salario = sc.nextDouble();

		while (salario <= 0) {
			System.out.print("Valor inválido. Digite novamente");
			salario = sc.nextDouble();
		}
		// Leitura do financiamento

		do {
			System.out.print("Numero de prestaçoes: ");
			prestacoes = sc.nextInt();
			System.out.print("Porcentagem de entrada: ");
			porcEntrada = sc.nextDouble();
			System.out.println("Valor total financiado: ");
			totalFinanciado = sc.nextDouble();

			valorPrestacao = (totalFinanciado - (totalFinanciado * porcEntrada / 100)) / prestacoes;
			prestPermitida = salario * 30 / 100;
			if (valorPrestacao > prestPermitida) {
				System.out.println(
						"O valor da prestação está acima do permitido. Altere prestações, entrada ou valor total ");
			}
		} while (valorPrestacao > prestPermitida);
		
		entrada = totalFinanciado * porcEntrada / 100;
			do {
				System.out.println("MENU:");
				System.out.println("1 - Mostrar o valor da entrada");
				System.out.println("2 - Mostrar o valor financiado");
				System.out.println("3 - Mostrar valor de cada prestação");
				System.out.println("4 - Sair");
				System.out.println();
				System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
				System.out.println();
			
			if ( opcao == 1) {
				System.out.printf("ENTRADA = R$ %.2f%n", entrada);			
			}
			else if ( opcao == 2 ) {
				valorFinanc = totalFinanciado - entrada;
				System.out.printf("VALOR FINANCIADO = R$ %.2f%n" , valorFinanc);
			}
			else if( opcao == 3) {
				System.out.printf("VALOR DE CADA PRESTAÇÃO = R$ %.2f%n" , valorPrestacao);
			}
			else if ( opcao == 4) {
				System.out.print("FIM DO PROGRAMA!");
							}
			System.out.println();
			}
			while ( opcao != 4);
		
			
		sc.close();
	}

}
