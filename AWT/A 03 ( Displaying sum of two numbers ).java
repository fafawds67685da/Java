import java.awt.*;
import java.awt.event.*;

public class Sear extends Frame implements ActionListener{
    Label l1 = new Label("Number 1");
    TextField tf1 = new TextField(20);
    Label l2 = new Label("Number 2");
    TextField tf2 = new TextField(20);
    Label l3 = new Label("Result");
    TextField tf3 = new TextField(20);
    Button b = new Button("Add");

    
    WindowAdapter closeListener = new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            dispose(); 
        }
    };

    Sear() {
    	setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns, spacing 10px
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b);
        setSize(200, 120);
        setVisible(true);
        b.addActionListener(this);

        addWindowListener(closeListener);
    }
    public void actionPerformed(ActionEvent e)
    {
    	int a = Integer.parseInt(tf1.getText());
    	int b2 = Integer.parseInt(tf2.getText());
    	tf3.setText(""+(a+b2));
    }

    public static void main(String[] args) {
        new Sear();
    }
}
