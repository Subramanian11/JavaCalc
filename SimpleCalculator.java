package GUI;

import java.awt.*;
import java.awt.event.*;



public class SimpleCalculator implements ActionListener{

	Frame frame = new Frame();
	Label l1 = new Label("First Number: ");
	Label l2 = new Label("Second Number: ");
	Label l3 = new Label("Result: ");
	
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	
	Button b1 = new Button("Add");
	Button b2 = new Button("Sub");
	Button b3 = new Button("Mul");
	Button b4 = new Button("Div");
	Button b5 = new Button("Cancel");
	
	//constructor:
	
	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
		//positioning of the labels
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);

		//positioning of the Text Fields
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		
		//positioning of the Buttons
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		b5.setBounds(290,250,50,20);
		
		//Add components to the frames
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		//Creating the action for the button
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400,350);
		frame.setLocation(500,200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		
		if(e.getSource()==b1) {
			t3.setText(String.valueOf(n1+n2));
		}
		
		if(e.getSource()==b2) {
			t3.setText(String.valueOf(n1-n2));
		}
		
		if(e.getSource()==b3) {
			t3.setText(String.valueOf(n1*n2));
		}
		
		if(e.getSource()==b4) {
			t3.setText(String.valueOf(n1/n2));
		}
		
		if(e.getSource()==b5) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new SimpleCalculator();
	}

}
