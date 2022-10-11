import java.util.Scanner;

public class Pod3uloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj cislo A: ");
		int cisloA = sc.nextInt();
		System.out.println("Zadaj cislo B: ");
		int cisloB = sc.nextInt();
		int sucet = cisloA+cisloB;
		if(sucet % 2 == 0) {
			System.out.println("Sucet cisel "+ cisloA + " a "+cisloB + " je: " + sucet+ " a je parny");
		}
		else if(sucet%2>0) {
			System.out.println("Sucet cisel "+ cisloA + " a "+cisloB + " je: " + sucet+ " a je neparny");
		}
	}
	

}
