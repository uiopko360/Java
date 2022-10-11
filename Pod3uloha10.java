import java.util.Scanner;

public class Pod3uloha10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj koeficienty kvadratickej rovnice: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double dis = b*b - 4*a*c;
		if(dis>0) {
			double x1 = (-b + Math.sqrt(dis))/(2*a);
			double x2 = (-b - Math.sqrt(dis))/(2*a);
			System.out.println("Korene su: " + x1 +" a " + x2);
		}
		else if(dis==0) {
			double x1 = (-b)/(2*a);
			System.out.println("Koren je: " + x1);
		}
		else if(dis<0) {
			System.out.println("Rovnica nema riesenie");
		}
	}
}
