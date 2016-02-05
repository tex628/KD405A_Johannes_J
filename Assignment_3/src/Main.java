import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		ArrayList<Bike> bikeArmy = new ArrayList<Bike>();
		
		bikeArmy.add(new Bike("blue", 44, 122));
		bikeArmy.add(new Bike("green", 32, 132));
		bikeArmy.add(new Bike("red", 10, 140));
		bikeArmy.add(new Bike("Purple", 80, 150));
		bikeArmy.add(new Bike("Swahili", 70, 165));
		bikeArmy.add(new Bike("Cyan", 60, 121));
		bikeArmy.add(new Bike("brown", 50, 175));
		bikeArmy.add(new Bike("black", 40, 142));
		bikeArmy.add(new Bike("yellow", 30, 214));
		bikeArmy.add(new Bike("orange", 12, 897));
		
		for(int i = 0; i<bikeArmy.size(); i++){
			System.out.println("nmr:" + i + " " + bikeArmy.get(i).getColor() + " " + bikeArmy.get(i).getSize() + " " + bikeArmy.get(i).getPrice());
		}
	}

}
