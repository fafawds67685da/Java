import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
public class Test extends JFrame implements ActionListener
{
	JLabel l1 = new JLabel("Enter String");
	JLabel l2 = new JLabel("Result");
	
	JTextField tf1 = new JTextField(50);
	JTextField tf2 = new JTextField(50);
	
	JButton b1 = new JButton("CountVowel");
	JButton b2 = new JButton("Reset");
	JButton b3 = new JButton("Exit");
	
	Test()
	{
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
		setSize(600,500);
		setLayout(new FlowLayout(FlowLayout.CENTER,80,30));
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			int z = 0;
			String s = tf1.getText();
			s = s.toUpperCase();
			int l =s.length();
			for(int i =0;i<l;i++)
			{
				char ch = s.charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					z+=1;
				}
			}
			tf2.setText(Integer.toString(z));
		}
		else if(e.getSource()==b2)
		{
			tf2.setText("");
			tf1.setText("");
		}
		else
		{
			System.exit(0);
		}
	}
	
	public static void main(String args[])
	{
		new Test();
	}
	
}
