package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener {
	static Model model;
	static View view;

	public Controller(Model calcmoael, View calcview) {
		// TODO Auto-generated constructor stub
		model = calcmoael;
		view = calcview;
		calcview.addListener();
	}

	Controller() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("test");
		JButton buttonPressed = (JButton) e.getSource();
		// System.out.println(buttonPressed.getText());
		model.addNum(buttonPressed.getText());
		view.viewSetLabel1(model.getinput1());
		view.viewSetLabel2(model.input2());
		view.viewSetLabel3(model.input3());
		view.viewSetLabel4(model.output());
	}

}
