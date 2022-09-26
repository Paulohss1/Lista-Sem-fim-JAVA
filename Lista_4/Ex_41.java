package Lista_4;

import java.util.Scanner;

public class Ex_41 {

	public static void main(String[] args) {
		
				Scanner ler = new Scanner(System.in);
				int soma = 0, ln = 2, n = 0, seq = 0;
				do {
					System.out.println("\nDigite a quantidade de vezes que a sequencia vai se desenrolar até a soma (0 > N < 100): ");
					n = ler.nextInt();
					
				}
				while(n >= 100 || n < 1);
				for(int x = 0; x < n; x++) {
						seq += ln;
						soma+= seq;
						ln = 3 + 2 * x;
				}
				System.out.printf("\nA soma dos %d primeiros numeros da sequencia é: %d", n, soma);
	}

}
