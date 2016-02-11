
public abstract class Mammals extends Animal{
	protected int gestationTime;
	public Mammals(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
		// TODO Auto-generated constructor stub
	}
	public int getGestationTime(){
		return this.gestationTime;
	}
}
