package GFT;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero entre 3 e 999: ");
		int num = scan.nextInt();
		for (int i = 3; i <num; i++) {
			if(i/1 == i && num/1 == num) {
				System.out.println(String.format("O n�mero %d � primo", i));
			}
			else {
				System.out.println("Nenhum primo entre si encontrado.");
			}
		}
		
		scan.close();
	}

}
