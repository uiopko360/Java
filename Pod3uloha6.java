import java.util.Scanner;

public class Pod3uloha6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj strany trojuholnika: ");
		double cisloA = sc.nextDouble();
		double cisloB = sc.nextDouble();
		double cisloC = sc.nextDouble();
		if (cisloA + cisloB > cisloC && cisloB + cisloC > cisloA && cisloA + cisloC > cisloB) {
			System.out.println("Trojuholnik so stranami: " + cisloA + " " + cisloB + " " + cisloC + " existuje");
				if(cisloA*cisloA + cisloB*cisloB == cisloC*cisloC || cisloA*cisloA + cisloC*cisloC == cisloB*cisloB || cisloB*cisloB + cisloC*cisloC == cisloA*cisloA) {
					System.out.println("A je pravouhly");
			} 
			else System.out.println("Nie je pravouhly");
		}
		else System.out.println("Neexistuje");

	}
}
