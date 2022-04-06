package kahvesiparis;

import java.util.Scanner;

import enums.KahveTipleri;

public class KahveSiparis {

	public static void main(String[] args) {

		for (KahveTipleri kahveTipi : KahveTipleri.values()) {
			System.out.println(kahveTipi.getIndex() + ". " + kahveTipi.getDesc());
		}

		try (Scanner siparisScanner = new Scanner(System.in)) {
			System.out.println("Lütfen seçmek istediğiniz kahvenin numarasını giriniz");

			Integer siparisNo = siparisScanner.nextInt();
			System.out.println("Teşekkürler kahveniz hazırlanıyor");
			
			KahveTipleri tip = KahveTipleri.getKahveTipiFromIndex(siparisNo);
			tip.execute();
		} catch (Exception e) {

		}
	}

}
