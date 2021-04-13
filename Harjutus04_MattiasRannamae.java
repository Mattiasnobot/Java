import java.util.Scanner;
public class Harjutus04_MattiasRannamae {

	public static void main(String[] args) {
		// kasutaja sisestab
		Scanner scanner = new Scanner (System.in);
		System.out.print("Sisesta oma nimi: ");
		String nimi = scanner.nextLine(); //lisab sisestuse sõne muutujasse
		System.out.println(nimi.toUpperCase());
		System.out.println("Märkide arv: "+nimi.length());
		
		String[] tykeldus = nimi.split(" ");
		System.out.printf("%10s", tykeldus[0]);
		
		int wordcount = 1;
		for (int i = 0; i < nimi.length(); i++)
		{
			if (nimi.charAt(i)== ' ')
			{
				wordcount++;
			}
		}
		
		System.out.println("\n"+"Sõnade arv: "+ wordcount);
		scanner.close();
	}

}
