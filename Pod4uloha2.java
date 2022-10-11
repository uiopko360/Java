import java.util.Scanner;

public class Pod4uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 5-ciferne cislo: ");
		int cislo = sc.nextInt();
		int destis = cislo / 10000; // 12345/10000 = 1
		int tis = cislo % 10000 / 1000; // 12345%10000 = 1, zv 2345/1000=2
		int sto = cislo % 1000 / 100; // 12345%1000= 12, zv 345/100 = 3
		int des = cislo % 100 / 10; // 12345%100= 123, zv 45/10 = 4
		int jed = cislo % 10;
		if (destis == des && des != sto && destis != sto) { // ABCAB
			if (tis == jed && tis != sto && jed != sto)
				System.out.println("Cislo je v tvare ABCAB");
			else
				System.out.println("Cislo nie je v tvare ABCAB");
		} else
			System.out.println("Cislo nie je v tvare ABCAB");
	}

}
