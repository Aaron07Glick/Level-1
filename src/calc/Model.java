package calc;

public class Model {
	String input1 = "";
	String input2 = "";
	String input3 = "";
	String output = "";

	String getinput1() {
		return input1;
	}

	void setinput1(String input1) {
		this.input1 = input1;
	}

	String input2() {
		return input2;
	}

	void setinput12(String input2) {
		this.input2 = input2;
	}

	String input3() {
		return input3;
	}

	void setinput3(String input3) {
		this.input3 = input3;
	}

	String output() {
		return output;
	}

	void setoutput(String output) {
		this.output = output;
	}

	void addNum(String num) {
		input1 = input1 + num;
		System.out.println(input1);
	}
}
