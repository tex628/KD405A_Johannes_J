
public abstract class Animal {
	protected String latinName;
	protected String friendlyName;

	public Animal(String latinName) {
		this.latinName = latinName;
		// TODO Auto-generated constructor stub
	}
	public abstract String getInfo();
	
	public void setFriendlyName(String name){
		friendlyName = name;
	}
	public String getFriendlyName(){
		return friendlyName;
	}
}
