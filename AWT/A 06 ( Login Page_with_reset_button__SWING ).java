import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Test extends JFrame implements ActionListener
{
	JLabel l1 = new JLabel("UserName");
	JLabel l2 = new JLabel("Password");

	JTextField tf1 = new JTextField(20);
	JTextField tf2 = new JTextField(20);
	JTextField tf3 = new JTextField(20);

	JButton login = new JButton("Login");
	JButton reset = new JButton("Reset"); // ✅ New Reset Button

	Test()
	{
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(tf3);
		add(login);
		add(reset); // ✅ Add Reset Button

		login.addActionListener(this);
		reset.addActionListener(this); // ✅ Add ActionListener

		setSize(500, 400);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 80, 30));
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == login)
		{
			if (tf1.getText().equals("Dev") && tf2.getText().equals("JI"))
			{
				tf3.setText("Login successful");
			}
			else
			{
				tf3.setText("Login not successful");
			}
		}
		else if (e.getSource() == reset)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}

	public static void main(String args[])
	{
		new Test();
	}
}
