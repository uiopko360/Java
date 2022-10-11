import java.util.Scanner;

public class Pod4uloha9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 3-ciferne cislo: ");
			int x = sc.nextInt();
		System.out.println("Zadaj zaciatok intervalu: ");
			int a = sc.nextInt();
		System.out.println("Zadaj koniec intervalu: ");
			int b = sc.nextInt();
		int sto = x / 100;
		int des = x % 100 / 10;
		int jed = x % 10;
		int cs = sto+des+jed;
		if(cs>a && cs<b) System.out.println("Ciferny sucet: " + cs + " je v intervale: " + "("+a+";"+b+")");
		else System.out.println("Ciferny sucet: " + cs + " nie je v intervale: " + "("+a+";"+b+")");
	}

}
