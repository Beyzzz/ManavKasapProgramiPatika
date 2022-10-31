import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double armutKilo = 2.14, elmaKilo = 3.67, domatesKilo = 1.11, muzKilo = 0.95, patlıcanKilo = 5.00,
				armutMiktari, elmaMiktari, domatesMiktari, muzMiktari, patlicanMiktari;

		Scanner input = new Scanner(System.in);
		System.out.println("Kaç kilo armut:");
		armutMiktari = input.nextDouble();

		Scanner inputt = new Scanner(System.in);
		System.out.println(" Kaç kilo elma: ");
		elmaMiktari = input.nextDouble();

		Scanner inputtt = new Scanner(System.in);
		System.out.println("Kaç kilo domates: ");
		domatesMiktari = input.nextDouble();

		Scanner inputttt = new Scanner(System.in);
		System.out.println("Kaç kilo muz: ");
		muzMiktari = input.nextDouble();

		Scanner inputtttt = new Scanner(System.in);
		System.out.println("Kaç kilo patlican: ");
		patlicanMiktari = input.nextDouble();

		double toplamTutar;
		toplamTutar = ((armutMiktari * armutKilo) + (elmaMiktari * elmaKilo) + (domatesMiktari * domatesKilo)
				+ (muzMiktari * muzKilo) + (patlicanMiktari * patlıcanKilo));
		System.out.println("Toplam Tutar:" + toplamTutar);

	}

}
