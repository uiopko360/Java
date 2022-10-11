import java.util.Scanner;

public class Pod4uloha6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 5-ciferne cislo: ");
		int cislo = sc.nextInt();
		int destis = cislo / 10000; 
		int tis = cislo % 10000 / 1000; 
		int sto = cislo % 1000 / 100; 
		int des = cislo % 100 / 10; 
		int jed = cislo % 10;
		if (destis == tis && destis != sto && tis != sto) { // AACAA
			if (des == jed && des != sto && jed != sto)
				System.out.println("Cislo je v tvare AACAA");
			else
				System.out.println("Cislo nie je v tvare AACAA");
		} else
			System.out.println("Cislo nie je v tvare AACAA");
	}

}
