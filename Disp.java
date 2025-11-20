import java.awt.*;
import java.awt.event.*;

public class Disp extends Frame {

    String msg;

    public Disp(String name) {

        msg = "Hello " + name;

        setTitle("Display Window");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 80, 100);
    }
}
