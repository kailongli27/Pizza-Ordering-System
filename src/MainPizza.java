import java.util.Scanner;

public class MainPizza {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("What type of pizza would you like to buy (Cheese or Meat)?: ");
		String PizzaType = myObj.next();
		
		if (PizzaType.equalsIgnoreCase("meat")) {
			Pizza myPizza = new Pizza();
			
			System.out.print("What type of crust (Thin or Thick)?: ");
			String crust = myObj.next();
			myPizza.setCrust(crust);
			
			System.out.print("What topping? (Please choose one from the following: Sausage, Pepperoni, Bacon): ");
			String topping = myObj.next();
			
			if (topping.equalsIgnoreCase("sausage") || topping.equalsIgnoreCase("pepperoni") || topping.equalsIgnoreCase("bacon")) {
				myPizza.setTopping(topping);
			
				System.out.println("Your order is:");
				System.out.println(myPizza);
			}
			
			else {
				System.out.println("Sorry! We only have sausage, pepperoni, or bacon.");
			}
			
		}
		
		else if (PizzaType.equalsIgnoreCase("cheese")) {
			Cheese myPizza = new Cheese();
			
			System.out.println("Your order is:");
			System.out.println(myPizza);
		}
		
		else {
			System.out.println("Sorry! We only have cheese or meat pizzas.");
		}
		
	}

}
