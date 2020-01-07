public class Cheese extends Pizza {
	
	private String type;
	
	public Cheese() {
		this.type = "Cheese";
		this.setCrust();
	}
	
	public void setCrust() {
		this.setCrust("Thin");
	}
	
	public String toString() {
		return this.type + " pizza\n" + this.getCrust() + " crust\n" + "Total cost is " + this.getCost();  
	}
}
