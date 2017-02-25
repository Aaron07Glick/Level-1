package calc;

public class calcMain {
	public static void main(String[] args) {
		Model calcmodel = new Model();
		View calcview = new View();
		Controller Controller = new Controller(calcmodel, calcview);

	}
}
