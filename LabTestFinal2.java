import java.util.ArrayList;

public class LabTestFinal2 {
 public static void main (String[] args) {
	 ArrayList<String> cupOfCoffee = new ArrayList <String>();	
	 cupOfCoffee.add("java coffee");
	 cupOfCoffee.add("sugar");
	 cupOfCoffee.add("cream");
	 cupOfCoffee.add("whipped cream");
	 
	 System.out.println(cupOfCoffee);
	 
	 // adding new element at beginning
	 cupOfCoffee.add(0,"ice");
	 
	 System.out.println(cupOfCoffee);
	 
	 //adding a new element at end 
	 cupOfCoffee.add(5,"vanilla shot");
	 
	 System.out.println(cupOfCoffee);
	 
	 //removing second-to-last element
	 cupOfCoffee.remove(4);
	 
	 System.out.println(cupOfCoffee);
	 
	 //replacing the item cream with almond milk 
	 cupOfCoffee.set(3,"almond milk");
	 
	 System.out.println(cupOfCoffee);
 }
}