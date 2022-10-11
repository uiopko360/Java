import java.util.Scanner;

public class Pod4uloha8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 3-ciferne cislo: ");
		int x = sc.nextInt();
		System.out.println("Zadaj zaciatok intervalu: ");
		int a = sc.nextInt();
		System.out.println("Zadaj koniec intervalu: ");
		int b = sc.nextInt();
		int stoX = x / 100;
		int desX = x % 100 / 10;
		int jedX = x % 10;
		int cs = stoX + desX + jedX;
		if(a < cs && b > cs) System.out.println("Ciferny sucet: " + cs + " je v intervale: " + "("+a+";"+b+")");
		else System.out.println("Ciferny sucet: " + cs + " nie je v intervale: " + "("+a+";"+b+")");
	}

}
