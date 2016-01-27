
public class House{
 private int yearBuilt;
 private int size;
 private final int minSize = 10;
 public House(int yearBuilt,int size){
	 this.yearBuilt = yearBuilt;
	 this.size = size;
 }
 public int getYearBuilt(){
		 return this.yearBuilt;
 }
 public int getSize(){
		 return this.size;
}
}
