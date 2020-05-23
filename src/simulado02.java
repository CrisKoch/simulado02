import java.util.Locale;
import java.util.Scanner;

public class simulado02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Leitura do nome e salario
		
		String nome;
		double salario;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		
		nome = sc.nextLine();
		
		
		System.out.printf("Salario: ");
		
		salario = sc.nextDouble();
		
		while (salario <= 0) {
			System.out.print("Valor inválido. Digite novamente");
			salario = sc.nextDouble();
		}
		
		
		
		
		
		sc.close();
	}

}
