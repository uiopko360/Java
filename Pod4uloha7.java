import java.util.Scanner;

public class Pod4uloha7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nacitaj 4 cisla");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = sc.nextInt();

		if (x == y && x < z && x < a)
			System.out.println("Cisla: " + x + " a " + y + " su najmensie");
		else if (x == z && x < y && x < a)
			System.out.println("Cisla: " + x + " a " + z + " su najmensie");
		else if (x == a && x < y && x < z)
			System.out.println("Cisla: " + x + " a " + a + " su najmensie");
		else if (y == z && y < x && y < a)
			System.out.println("Cisla: " + y + " a " + z + " su najmensie");
		else if (y == a && y < x && x < z)
			System.out.println("Cisla: " + y + " a " + a + " su najmensie");
		else if (z == a && z < x && z < y)
			System.out.println("Cisla: " + z + " a " + a + " su najmensie");

		if (x == y && x > z && x > a)
			System.out.println("Cisla: " + x + " a " + y + " su najvacsie");
		else if (x == z && x > y && x > a)
			System.out.println("Cisla: " + x + " a " + z + " su najvacsie");
		else if (x == a && x > y && x > z)
			System.out.println("Cisla: " + x + " a " + a + " su najvacsie");
		else if (y == z && y > x && y > a)
			System.out.println("Cisla: " + y + " a " + z + " su najvacsie");
		else if (y == a && y > x && x > z)
			System.out.println("Cisla: " + y + " a " + a + " su najvacsie");
		else if (z == a && z > x && z > y)
			System.out.println("Cisla: " + z + " a " + a + " su najvacsie");

		
		if(x == y && y == z && x < a)
			System.out.println("Cisla: " + x + " , " + y + " a " + z + " su najmensie");
		else if(x == y && y == a && x < z)
			System.out.println("Cisla: " + x + " , " + y + " a " + a + " su najmensie");
		else if(x == y && y == a && x < z)
			System.out.println("Cisla: " + y + " , " + z + " a " + a + " su najmensie");
		else if(x == z && z == a && x < y)
			System.out.println("Cisla: " + x + " , " + z + " a " + a + " su najmensie");
		
		if(x == y && y == z && x > a)
			System.out.println("Cisla: " + x + " , " + y + " a " + z + " su najvacsie");
		else if(x == y && y == a && x > z)
			System.out.println("Cisla: " + x + " , " + y + " a " + a + " su najvacsie");
		else if(x == y && y == a && x > z)
			System.out.println("Cisla: " + y + " , " + z + " a " + a + " su najvacsie");
		else if(x == z && z == a && x > y)
			System.out.println("Cisla: " + x + " , " + z + " a " + a + " su najvacsie");
		
		if(x==y && y==z && z==a)
			System.out.println("Cisla: " + x + " , " + y + " , " + z + " a " + a + " su rovnake");
		
		
		if (x < y && x < z && x < a)
			System.out.println("Cislo: " + x + " je najmensie");
		else if (y < x && y < z && y < a)
			System.out.println("Cislo: " + y + " je najmensie");
		else if (z < x && z < y && z < a)
			System.out.println("Cislo: " + z + " je najmensie");
		else if (a < x && a < y && a < z)
			System.out.println("Cislo: " + a + " je najmensie");

		if (x > y && x > z && x > a)
			System.out.println("Cislo: " + x + " je najvacsie");
		else if (y > x && y > z && y > a)
			System.out.println("Cislo: " + y + " je najvacsie");
		else if (z > x && z > y && z > a)
			System.out.println("Cislo: " + z + " je najvacsie");
		else if (a > x && a > y && a > z)
			System.out.println("Cislo: " + a + " je najvacsie");
	}

}
