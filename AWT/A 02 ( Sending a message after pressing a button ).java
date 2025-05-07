import java.awt.*;
import java.awt.event.*;

public class Sear extends Frame implements ActionListener{
    Label l = new Label("Enter your name");
    TextField tf = new TextField(20);
    Button b = new Button("Click me");

    
    WindowAdapter closeListener = new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            dispose(); 
        }
    };

    Sear() {
        setLayout(new FlowLayout());
        add(l);
        add(tf);
        add(b);
        setSize(400, 400);
        setVisible(true);
        b.addActionListener(this);

        addWindowListener(closeListener);
    }
    public void actionPerformed(ActionEvent e)
    {
    	tf.setText("Hello Java");
    }

    public static void main(String[] args) {
        new Sear();
    }
}
