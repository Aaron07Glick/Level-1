public class Platypus {
	private String name;


	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus perry = new Platypus("perry");
		Platypus barry = new Platypus("barry");
		//2. Call the sayHi method
		perry.sayHi();
		perry.walk();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
	Platypus(String name){
		this.name = name;
	}
	void walk(){
		System.out.println("The platypus " + name + " walked");
	}
}

