package Lista_5;

import java.util.Scanner;

public class Ex_51 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaPessoas = new Cliente[5];
		
		for (int i=0; i<=2; i++) {
		// Instancia (cria) o objeto
		Cliente p = new Cliente();		
		// Popula o objeto (preenche os atributos do objetos)
		System.out.printf("Digite o id da pessoa: ");
		p.id = ler.nextInt();
		System.out.printf("Digite o nome da pessoa: ");
		p.nome = ler.next();
		System.out.printf("Digite a idade da pessoa: ");
		p.idade = ler.nextInt();
		System.out.printf("Digite o e-mail da pessoa: ");
		p.email = ler.next();				
		
		// Adiciona o objeto no array "listaPessoas"
		listaPessoas[i] = p;
		}	
		
		for (int i=0; i<=2; i++) {
			if(listaPessoas[i].idade>18) {
		    System.out.printf("id %d: Nome:%s  Idade:%d \n\n", listaPessoas[i].id, listaPessoas[i].nome, listaPessoas[i].idade);
			
			}}

	}

}
