import java.text.NumberFormat;

public class Pizza {
	
	private String type;
	private double cost;
	private String crust;
	private String topping;
	
	public Pizza(){
		this.type = "Meat";
		cost = 6;
	}
	
	public void setCrust(String DesiredCrust) {
		this.crust = DesiredCrust;
	}

	public String getCrust() {
		return this.crust.substring(0, 1).toUpperCase() + this.crust.substring(1).toLowerCase();
	}
	
	public void setTopping(String Desiredtopping) {
		this.topping = Desiredtopping;
		this.setCost();
	}
	
	public String getTopping() {
		return this.topping.substring(0, 1).toUpperCase() + this.topping.substring(1).toLowerCase();
	}
	
	public void setCost() {
		this.cost += 2;
	}
	
	public String getCost() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return formatter.format(this.cost);
	}
	
	public String toString() {
		return this.type + " pizza\n" + this.getTopping() + " (+ $2.00)\n" + this.getCrust() + " crust\n" + "Total cost is " + this.getCost();  
	}
	
}
