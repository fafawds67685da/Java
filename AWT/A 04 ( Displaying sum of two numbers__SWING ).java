import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Sear extends JFrame implements ActionListener
{
	JLabel l1 = new JLabel("Number 1");
	JLabel l2 = new JLabel("Number 2");
	JLabel l3 = new JLabel("Result");
	
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);
	
	JButton b = new JButton("Add");
	
	Sear()
	{
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		
		add(b);
		setVisible(true);
		setSize(400,300);
		setLayout(new FlowLayout(FlowLayout.CENTER,80,30));
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		tf3.setText(""+(a+b));
	}
	
	public static void main(String args[])
	{
		new Sear();
	}
}
