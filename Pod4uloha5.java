import java.util.Scanner;

public class Pod4uloha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 3-ciferne cislo: ");
		int x = sc.nextInt();
		int stoX = x / 100;
		int desX = x % 100 / 10;
		int jedX = x % 10;
		int cs = stoX + desX + jedX;
		if(x%cs == 0) System.out.println("Cislo " + x + " je delitelne svojim cifernym suctom");
		else System.out.println("Cislo " + x + " nie je delitelne svojim cifernym suctom");
	}
}
