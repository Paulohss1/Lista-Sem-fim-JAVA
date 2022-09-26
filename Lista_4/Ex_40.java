package Lista_4;

public class Ex_40 {

	public static void main(String[] args) {
		int soma, a = 1, b = 1, c = 1;
		for(int x = 0; x < 20; x++) {
			if(x < 3) {
				System.out.printf("\n1");
			}
			else {
				soma = a + b + c;
				System.out.printf("\n%d",(soma));
				c = b;
				b = a;
				a = soma;
			}
	}

}
}