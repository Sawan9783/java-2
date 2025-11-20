import java.awt.*;
import java.awt.event.*;

public class Entry extends Frame implements ActionListener {

    TextField t;
    Button b;

    public Entry() {

        setTitle("Entry Window");
        setSize(300, 200);
        setLayout(null);

        Label l = new Label("Name:");
        l.setBounds(50, 50, 60, 20);
        add(l);

        t = new TextField();
        t.setBounds(120, 50, 120, 20);
        add(t);

        b = new Button("OK");
        b.setBounds(100, 100, 80, 30);
        add(b);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        String name = t.getText();

        // Open second frame
        new Disp(name);
    }

    public static void main(String[] args) {
        new Entry().setVisible(true);
    }
}
