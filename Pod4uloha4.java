import java.util.Scanner;

public class Pod4uloha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 2 3-ciferne cisla: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int stoX = x / 100;
		int desX = x % 100 / 10;
		int jedX = x % 10;
		int stoY = y / 100;
		int desY = y % 100 / 10;
		int jedY = y % 10;
		if (stoX == jedY && desX == desY && jedX == stoY)
			System.out.println("Cisla su navzajom zrkadlovo obratene");
		else
			System.out.println("Cisla nie su navzajom zrkadlovo obratene");
	}

}
