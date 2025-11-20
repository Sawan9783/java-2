import java.awt.*;
import java.awt.event.*;

public class F1 extends Frame {

    public F1() {

        setTitle("F1 Window");
        setSize(300, 200);
        setLayout(null);

        Button b1 = new Button("Open");
        b1.setBounds(100, 70, 100, 30);
        add(b1);

        // Open F2 window
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                F2 obj = new F2();
                obj.setVisible(true);
            }
        });

        // Close F1 window using close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new F1().setVisible(true);
    }
}
