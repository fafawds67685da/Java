import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Sear extends JFrame implements ActionListener
{
	JLabel l1 = new JLabel("Username");
	JLabel l2 = new JLabel("Password");
	
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(25);
	JButton b = new JButton("Login");
	
	Sear()
	{
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(tf3);
		add(b);
		setVisible(true);
		setSize(400,300);
		setLayout(new FlowLayout(FlowLayout.CENTER,80,30));
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String a = tf1.getText();
		String b = tf2.getText();
		if(a.equals("Dev") && b.equals("pass"))
		{
			tf3.setText("Login Succesful");
		}
		else
		{
			tf3.setText("Login Unsuccesful, Please Try again !");
		}
	}
	
	public static void main(String args[])
	{
		new Sear();
	}
}
