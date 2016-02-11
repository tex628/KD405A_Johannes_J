
public class Dogs extends Mammals{
	protected boolean stupid;
	public Dogs(String latinName, int gestationTime, boolean Stupid) {
		super(latinName, gestationTime);
		this.stupid = Stupid;
		// TODO Auto-generated constructor stub
	}
	public Dogs(String latinName, int gestationTime, boolean Stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = Stupid;
		// TODO Auto-generated constructor stub
	}
	public String getInfo() {
		if(friendlyName == null){
		String info = "latin name: " + latinName + ", gestation time is: " + gestationTime + " and stupid = " + stupid;
		return info;
		}else{
		String info = "latin name: " + latinName + " with the friendly name " + friendlyName + ". It has a gestation time of: " + gestationTime + " and stupid = " + stupid;
		return info;
		}
	}

}
