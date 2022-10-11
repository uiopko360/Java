import java.util.Scanner;

public class Pod3uloha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj cislo: ");
		int cislo = sc.nextInt();
		System.out.println("Nacitaj cislo Z: (Z,K)");
		int cisloZ = sc.nextInt();
		System.out.println("Nacitaj cislo K: (Z,K)");
		int cisloK = sc.nextInt();
		if(cislo>cisloZ && cislo<cisloK) {
			System.out.println("Cislo " + cislo + " je v intervale " + "("+cisloZ+";"+cisloK+")");
		}
	}
}
