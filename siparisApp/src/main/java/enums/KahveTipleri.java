package enums;

import exceptions.KahveSiparisException;

public enum KahveTipleri {

	ESPRESSO(1,"Espresso (7 tl)") {
		@Override
		public
		void execute() {
			System.out.println("Espresso seçtiniz, bu içeceğimiz bir doz espresso içermektedir. Afiyet olsun");
		}
	},
	DOUBLE_ESPRESSO(2,"Double Espresso (12 tl)") {
		@Override
		public
		void execute() {
			System.out.println("Double Espresso seçtiniz, bu içeceğimiz iki doz espresso içermektedir. Afiyet olsun");			
		}
	},
	CAPPUCINO(3,"Cappucino (12 tl)") {
		@Override
		public
		void execute() {
			System.out.println("Cappucino seçtiniz, bu içeceğimiz bir doz espresso, iki doz süt ve iki doz süt köpüğü içermektedir. Afiyet olsun");			
		}
	},
	COFFEE_LATTE(4,"Coffee Latte (12 tl)") {
		@Override
		public
		void execute() {
			System.out.println("Coffee Latte seçtiniz, bu içeceğimiz bir doz espresso, üç doz süt ve bir doz süt köpüğü içermektedir. Afiyet olsun");
		}
	},
	MOCHA(5,"Mocha (13 tl)") {
		@Override
		public
		void execute() {
			System.out.println("Mocha seçtiniz, bu içeceğimiz bir doz espresso, bir doz süt , bir doz süt köpüğü ve iki doz sıcak çikolata içermektedir. Afiyet olsun");			
		}
	},
	AMERICANO(6,"Americano (10 tl)") {
		@Override
		public
		void execute() {
			System.out.println("Americano seçtiniz, bu içeceğimiz bir doz espresso ve dört doz sıcak su içermektedir. Afiyet olsun");			
		}
	},
	HOT_WATER(7,"Hot Water (3 tl)") {
		@Override
		public
		void execute() {
			System.out.println("Hot Water seçtiniz, bu içeceğimiz beş doz sıcak su içermektedir. Afiyet olsun");			
		}
	};
	
	public abstract void execute();
	
	private int index;
	private String desc;
	
	private KahveTipleri(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}
	
	public static KahveTipleri getKahveTipiFromIndex(int index) throws KahveSiparisException {
		for(KahveTipleri kahveTipi: KahveTipleri.values()) {
			if(kahveTipi.getIndex() == index) {
				return kahveTipi;
			}
		}
		throw new KahveSiparisException("İstediğiniz kahve türü menüde yoktur.");
	}

	public int getIndex() {
		return index;
	}
	
	public String getDesc() {
		return desc;
	}
}
