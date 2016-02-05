
public class Bike {
	
private String bikeColor;
private int price;
private int size;

/**Konstruktor*/
public Bike(String bikeColor, int size){
	this.bikeColor = bikeColor;
	this.size = size;
}

/**Konstruktor*/
public Bike(String bikeColor, int size, int price){
	this.bikeColor = bikeColor;
	this.price = price;
	this.size = size;
}

//returnerar färgen
public String getColor(){
	return this.bikeColor;
}
//returnerar storleken
public int getSize(){
	return this.size;
}
//returnerar priset
public int getPrice(){
	return this.price;
}
public void setPrice(int newPrice){
	this.price = newPrice;
}
}