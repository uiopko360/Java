import java.util.Scanner;

public class Pod4uloha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj 3 cisla");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if (x == y && y < z)
			System.out.println("Cisla: " + x + " a " + y + " su najmensie");
		else if (x == z && z < y)
			System.out.println("Cisla: " + x + " a " + z + " su najmensie");
		else if (y == z && y < x)
			System.out.println("Cisla: " + y + " a " + z + " su najmensie");
		
		if (x == y && y > z)
			System.out.println("Cisla: " + x + " a " + y + " su najvacsie");
		else if (x == z && z > y)
			System.out.println("Cisla: " + x + " a " + z + " su najvacsie");
		else if (y == z && y > x)
			System.out.println("Cisla: " + y + " a " + z + " su najvacsie");

		if (x == y && y == z)
			System.out.println("Cisla: " + x + " , " + y + " , " + z + " su rovnake");

		if (x < y && x < z)
			System.out.println("Cislo: " + x + " je najmensie");
		else if (y < x && y < z)
			System.out.println("Cislo: " + y + " je najmensie");
		else if (z < x && z < y)
			System.out.println("Cislo: " + z + " je najmensie");

		if (x > y && x > z)
			System.out.println("Cislo: " + x + " je najvacsie");
		else if (y > x && y > z)
			System.out.println("Cislo: " + y + " je najvacsie");
		else if (y > x && y > z)
			System.out.println("Cislo: " + z + " je najvacsie");
	}

}
