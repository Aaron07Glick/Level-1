package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	public Controller(Model calcmodel, View calcview) {
		// TODO Auto-generated constructor stub
		calcview.addListener();
	}

	Controller() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

}
