import java.util.Scanner;

public class Pod4uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj 4-ciferne cislo: ");
		int cislo = sc.nextInt();
		System.out.println("Zadaj zaciatok intervalu: ");
		int a = sc.nextInt();
		System.out.println("Zadaj koniec intervalu: ");
		int b = sc.nextInt();
		int tis = cislo/1000;
		int sto = cislo%1000/100;
		int des = cislo%100/10;
		int jed = cislo&10;
		int cs = tis+sto+des+jed;
		if(cs>a && cs<b) System.out.println("Ciferny sucet: " + cs + " je v intervale: " + "("+a+";"+b+")");
		else System.out.println("Ciferny sucet: " + cs + " nie je v intervale: " + "("+a+";"+b+")");
		
	}

}
