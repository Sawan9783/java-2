import java.awt.*;
import java.awt.event.*;

public class F2 extends Frame {

    public F2() {

        setTitle("F2 Window");
        setSize(300, 200);
        setLayout(null);

        Button b2 = new Button("Close");
        b2.setBounds(100, 70, 100, 30);
        add(b2);

        // Close full application
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
