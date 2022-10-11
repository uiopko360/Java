import java.util.Scanner;

public class Pod3uloha9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj cislo: ");
		int cislo = sc.nextInt();
		if(cislo>0||cislo<0) {
			double prevratena = 1.0/cislo;
			System.out.println("Prevratena hodnota cisla "+ cislo + " je: " + prevratena);
		}
		else System.out.println("Nulou nemono deli");
	}

}
