import java.util.Scanner;

public class harjutus05_MattiasRannamae {

	public static void main(String[] args) {
		jagamine();

	}
	static void jagamine() {
		Scanner arv = new Scanner (System.in);
		System.out.print("Sisesta esimene number: ");
		float a = arv.nextInt();
		System.out.print("Sisesta teine number: ");
		float b = arv.nextInt();
		
		if(a>0 && b>0) {
			float d = (a/b);
			System.out.println();
			System.out.println("Jagamise Tulemus: " +d);
			
		}
		else {
			System.out.println("Sisestatud arvud ei sobi.");
		}
	}
}
