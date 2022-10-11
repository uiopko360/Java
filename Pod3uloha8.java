import java.util.Scanner;

public class Pod3uloha8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj suradnice bodu [x,y]: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>0 && y>0) {
			System.out.println("Bod je v prvom kvadrante");
		}
		else if(x<0 && y>0) {
			System.out.println("Bod je v druhom kvadrante");
		}
		else if(x<0 && y<0) {
			System.out.println("Bod je v tretom kvadrante");
		}
		else if(x>0 && y<0) {
			System.out.println("Bod je v stvrtom kvadrante");
		}
		else if(x == 0) {
			System.out.println("Bod je na osi x");
		}
		else if(y == 0) {
			System.out.println("Bod je na osi y");
		}
	}

}
