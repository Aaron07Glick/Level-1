
public class smurf {
	private String name;
	private String Hat;

	smurf(String name) {
		this.name = name;
	}


	public String getName() {
		return "My name is " + name + " Smurf ";
	}


	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}


	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if (name.equals("papa")) {
			return "red";
		}
		
		// 3. Fill in this method
		return "white";
	}


	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if (name.equals("smurfette")) {
			return "girl";
		}
		return "boy";
	}


}


