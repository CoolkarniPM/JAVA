package containment2;

public class Heart {
	private int weight;
	private int pulse;
	
	Heart(){
		
	}
	Heart(int weight,int pulse){
		this.weight=weight;
		this.pulse=pulse;
	}
	public int getweight() {
		return weight;
		
	}
	public void setweight(int weight) {
		this.weight=weight;
	}
	public int getpulse() {
		return pulse;
		
	}
	public void setpulse() {
		this.pulse=pulse;
	}
	public String toString() {
		return("heart  details" + "+weight="  +weight+ "+pulse=" +pulse+ " ");
	}

}
