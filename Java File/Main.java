package oops;


	class Main extends ModifierExample{
		public static void main(String[] args) {
			ModifierExample m =new ModifierExample();
			m.m1();
			System.out.println("******");
			Main b = new Main();
			b.m1();
			System.out.println("******");
			ModifierExample a = new Main();
			a.m1();
			System.out.println("******");
			
		}
	}


