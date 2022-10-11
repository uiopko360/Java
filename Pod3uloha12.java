import java.util.Scanner;

public class Pod3uloha12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj 4-ciferne cislo:");
		int cislo = sc.nextInt();
		if((cislo/1000 == cislo%10)&&(cislo/100%10 == cislo%100/10)) {
			System.out.println("Cislo: " + cislo + " je v tvare ABBA.");
		}
		else System.out.println("Cislo: " + cislo + " nie je v tvare ABBA.");
	}

}
