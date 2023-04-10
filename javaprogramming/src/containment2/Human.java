package containment2;

public class Human {
	private int hage;
	private int hweight;
	private Heart heart;
	
	
	Human()
	{
		
	}
	Human(int hage,int hweight){
		this.hage=hage;
		this .hweight=hweight;
		this.heart=heart;
		
	}
	
	public int gethage() {
		return hage;
	}
	public void sethage(int hage) {
		this.hage=hage;
	}
	
	public int gethweight() {
		return hweight;
	}	
	
	public void sethweight(int hweight) {
		this.hweight=hweight;
	}
	public Heart getheart() {
		return heart;
	}
	public void setHeart(Heart heart) {
		this.heart=heart;
	}
	
	

}
