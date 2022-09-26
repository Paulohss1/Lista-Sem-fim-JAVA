package Lista_4;

import java.util.Scanner;

public class Ex_47 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Character resposta;
		do
		{
			int n = 0, total = 1;
			System.out.printf("Qual numero deseja o fatorial?: ");
			n = ler.nextInt();
			while(n < 1) 
			{
				System.out.printf("Valor invalido! insira um numero maior que 1: ");
				n = ler.nextInt();
			}
			for(int x = n; x > 0; x--) 
			{
				total *= x;
			}
			System.out.printf("fatorial foi de %d foi: %d\n", n, total);
			System.out.printf("Deseja executar novamente? (S/N): ");
			resposta = ler.next().charAt(0);
			while(resposta != 's' && resposta != 'S' && resposta != 'n' && resposta != 'N') 
			{
				System.out.printf("Insira apenas as respostas S ou N\n");
				resposta = ler.next().charAt(0);
			}
		}
		while(resposta == 's' || resposta == 'S');
		System.out.printf("PROGRAMA FINALIZADO!");
	}

}
	