import java.util.Scanner;

public class Pod3uloha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj rozmery stvorca");
		double stranaStvorec = sc.nextDouble();
		System.out.println("Zadaj rozmery obdlznika");
		double ObdlznikA = sc.nextDouble();
		double ObdlznikB = sc.nextDouble();
		double obsahS = stranaStvorec*stranaStvorec;
		double obsahO = ObdlznikA*ObdlznikB;
		if(obsahS>obsahO) {
			System.out.println("Obsah stvorca: " + obsahS + " je vacsi ako obsah oblznika: " + obsahO);
		}
		else if(obsahO>obsahS) {
			System.out.println("Obsah oblznika: " + obsahO + " je vacsi ako stvorca obsah : " + obsahS);
		}
		else if(obsahO==obsahS) {
			System.out.println("Obsahy sa rovnaju");
		}
	}

}
