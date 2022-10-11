import java.util.Scanner;

public class Pod3uloha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj cislo: ");
		int cislo = sc.nextInt();
		if(cislo>3 && cislo<30) {
			System.out.println("Cislo "+ cislo + " je v intervale (3;30)");
		}
		else {
			System.out.println("Cislo "+ cislo + " nie je v intervale (3;30)");
		}
	}

}
