package worm;

public class WormDriver {

	public static void main(String[] args) {
		
		Worm worm1 = new Worm("Jim", "Earthworm", "brown", 20, 11, 100, 10);
		Worm worm2 = new Worm("Mike", "Sandworm", "tan", 40000, 1200000, 1000, 1200000);
		
		System.out.println(worm1.toString());
		System.out.println(worm2.toString());
		
		for(int i = 0; i<5; i++) {
			worm1.burrow();
			worm2.surface();
		}
		
		worm1.surface();
		
		worm2.burrow();
		
		
		System.out.println(worm1.toString());
		System.out.println(worm2.toString());
	}

}
