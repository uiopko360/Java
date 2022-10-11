import java.util.Scanner;

public class Pod3uloha13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 3-ciferne cislo: ");
		int cislo = sc.nextInt();
		int sto = cislo/100;
		int des = cislo/10;
		int jed = cislo%10;
		int cs = sto*des*jed;
		if(cs%7==0) System.out.println("Cislo: " + cislo + " je nasobkom cisla 7.");
		else System.out.println("Cislo: " + cislo + " nie je nasobkom cisla 7.");
	}

}
