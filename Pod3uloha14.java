import java.util.Scanner;

public class Pod3uloha14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj 3-ciferne cislo: ");
		int cislo = sc.nextInt();
		int stoX = cislo / 100; //125/100 = 1
		int desX = cislo / 10 % 10; //125/10 = 12%10 = 2
		int jedX = cislo % 10; // 125%10 = 5
		int stoY = jedX * 100;
		int desY = desX * 10;
		int cisloY = stoY+desY+stoX;
		System.out.println("Cislo je: " + cisloY);
			 

	}

}
