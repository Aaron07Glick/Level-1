import javax.swing.plaf.synth.SynthSpinnerUI;

public class smurfRunner {
	public static void main(String[] args) {
		smurf handySmurf = new smurf("Handy");
		smurf papaSmurf = new smurf("papa");
		smurf smurfette = new smurf ("smurfette");
		handySmurf.eat();
		System.out.println(handySmurf.getName());
		System.out.println(papaSmurf.getName());
		System.out.println(papaSmurf.getHatColor());
		System.out.println(papaSmurf.isGirlOrBoy());
		System.out.println(smurfette.getName());
		System.out.println(smurfette.isGirlOrBoy());
		
	}
	
}
