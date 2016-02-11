
public class Snake extends Animal{
	protected boolean poison;
	public Snake(String latinName, boolean poison) {
		super(latinName);
	}

	public String getInfo() {
		String info = "latin name: " + latinName + " and poison is: " + poison;
		return info;
	}
	public boolean isPoison(){
		return poison;
	}

}
