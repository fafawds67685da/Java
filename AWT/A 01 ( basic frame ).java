import java.awt.*;
import java.awt.event.*;

public class Sear extends Frame {
    Label l = new Label("Enter your name");
    TextField tf = new TextField(20);
    Button b = new Button("Click me");

    Sear() {
        setLayout(new FlowLayout());
        add(l);
        add(tf);
        add(b);
        setSize(400, 400);
        setVisible(true);

        
        // Simple window listener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // closes the window
            }
        });
    }

    public static void main(String[] args) {
        new Sear();
    }
}
