public class Friends {

	public static void main(String[] args) {
		// 3. Create an instance of Classmate for each person in your class.
		Classmate bob1 = new Classmate();
		Classmate bob2 = new Classmate();
		Classmate bob3 = new Classmate();
		Classmate bob4 = new Classmate();
		// 4. set descriptions for each Classmate
		bob1.setdescription("nice person");
		bob2.setdescription("annoying person");
		bob3.setdescription("cool person");
		bob4.setdescription("funny person");
		// 5. Use your getter to print out each description
		System.out.println(bob1.getdescription());
		System.out.println(bob2.getdescription());
		System.out.println(bob3.getdescription());
		System.out.println(bob4.getdescription());
	}

}

class Classmate {
	String description;

	// 1. create a setter that sets a description for this person
	public void setdescription(String description) {
		this.description = description;
	}

	// 2. create a getter that gets a description of this person
	public String getdescription() {
		return description;
	}
}
