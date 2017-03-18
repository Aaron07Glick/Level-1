package calc;

public class Model {
	String input1 = "";
	String input2 = "";
	String input3 = "";
	String output = "";
	boolean operatorPressed;

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
		if (num.equals("=")) {
			calculate();
		} else if (num.equals("C")) {
			input1 = "";
			input2 = "";
			input3 = "";
			output = "";
			operatorPressed = false;
		} else if (num.equals("+") || num.equals("-") || num.equals("/") || num.equals("*")) {
			operatorPressed = true;
			input2 = num;
		} else if (operatorPressed == false) {
			input1 = input1 + num;
		} else if (operatorPressed == true) {
			input3 = input3 + num;
		}
	}

	void calculate() {
		int input1Num = Integer.parseInt(input1);
		// int input2Num = Integer.parseInt(input2);
		int input3Num = Integer.parseInt(input3);
		int outputNum = 0;
		if (input2.equals("+")) {
			outputNum = input1Num + input3Num;
		}
		if (input2.equals("-")) {
			outputNum = input1Num + input3Num;
		}
		if (input2.equals("*")) {
			outputNum = input1Num * input3Num;
		}
		if (input2.equals("/")) {
			outputNum = input1Num / input3Num;
		}
		output = outputNum + "";
	}
}
