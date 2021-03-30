
public class Harjutus02_Mattias_Rannamae {

	public static void main(String[] args) {
		System.out.println("tollid meetiks "+tollidM(10));
		System.out.println("---------------------");
		System.out.println("Ellipsi pindala on " +ellipsS(10, 30));
		System.out.println("---------------------");
		System.out.println(tundmin(120));
		System.out.println("---------------------");
		double sportlane1 = kiirus(10, 1);
		double sportlane2 = kiirus(20, 1);
		System.out.println(kiirustevahe(sportlane1, sportlane2));

	}
	
	//Tollid Meetriteks
	static double tollidM(int t) {
		double m = t * 39.37008;
		return m;
	}
	
	//ellipsi pindala
	static double ellipsS(int a, int b) {
		double s = Math.PI * a * b;
		double n = Math.round(s*100.0)/100.0;
		return n;
	}
	
	//Minutid tundideks ja minutiteks
	static double tundmin(int t) {
		int tteisendamine = t /60;
		int mteisendamine = t % 60;
		System.out.println("tundi" + tteisendamine + " " + "Minutid " + mteisendamine);
		return tteisendamine;
	}
	
	//sportlase kiirus =  dist / aeg
	static double kiirus(int d, int a) {
		double k = d/a;
		return k;
	}
	
	//kiiruste vahe
	static double kiirustevahe(double a1, double a2) {
		double vahe = Math.abs(a1-a2);
		return vahe;
	}
	
}
