package adapter;

public class PlayWar {
	
	public static void main(String[] args) {
		HouseAdapter army = new HouseStarkAdapter();
		army.fight();
		army.defend();
		
		army = new HouseBaratheonAdapter();
		army.fight();
		army.defend();
	}
	
	
}
