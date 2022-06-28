package trabalhador;

import java.util.Scanner;

public class mainTrabalhador {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);	
		trabalhador t1 = new trabalhador();
		System.out.print("Digite o nome do trabalhador: ");
		String n = scan.nextLine();
		t1.setNome(n);
		//Space-----------------------------
		System.out.print("Digite total de horas trabalhadas: ");
		double h = scan.nextDouble();
		t1.setHorasTrabalhadas(h);
		//Space-----------------------------
		System.out.print("Digite o valor do Salario/Hora: ");
		double sh = scan.nextDouble();
		t1.setSalarioPorHora(h);
		double st = h*sh;
		t1.setSalarioTotal(st);
		System.out.println("\n--DADOS FUNCIONARIO--\n");
		System.out.println(String.format("Nome trabalhador: %s", t1.getNome() ));
		System.out.println(String.format("Salario Total: %.2f", t1.getSalarioTotal() ));
		scan.close();
		
	}

}
