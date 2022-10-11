import java.util.Scanner;

public class Pod3uloha11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Zadajte cislo: ---");
		System.out.println("1 - euro na slovensku korunu");
		System.out.println("2 - slovenska koruna na euro");
		int cislo = sc.nextInt();
		if(cislo == 1) {
			System.out.println("Suma, ktoru chcete prepocitat: ");
			double eur = sc.nextDouble();
			double sk = eur*30;
			System.out.println("Výsledná suma: " + sk + " SK");
		}
		else if(cislo == 2) {
			System.out.println("Suma, ktoru chcete prepocitat: ");
			double sk = sc.nextDouble();
			double eur = sk/30;
			System.out.println("Výsledná suma: " + eur + " €");
		}
	}

}
