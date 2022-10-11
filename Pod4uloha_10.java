import java.util.Scanner;

public class Pod4uloha_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 4-ciferne cislo: ");
		int x = sc.nextInt();
		int tisX = x / 1000; // 
		int stoX = x % 1000 / 100;
		int desX = x % 100 / 10;
		int jedX = x % 10;
		int cs = tisX + stoX + desX + jedX;
		if (x % cs == 0)
			System.out.println("Cislo " + x + " je delitelne svojim cifernym suctom");
		else
			System.out.println("Cislo " + x + " nie je delitelne svojim cifernym suctom");
	}

}
