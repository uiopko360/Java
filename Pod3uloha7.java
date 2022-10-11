import java.util.Scanner;

public class Pod3uloha7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj cislo: ");
		int cislo = sc.nextInt();
		if(cislo<0) {
			int abs = cislo*(-1);
			System.out.println("Abs. hodnota cisla " + cislo + " je: "+ abs);
		}
		else if(cislo>0 || cislo==0) {
			System.out.println("Abs. hodnota cisla " + cislo + " je: "+ cislo);
		}
	}

}
