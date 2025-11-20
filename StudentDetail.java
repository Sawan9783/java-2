import java.awt.*;
import java.awt.event.*;

public class StudentDetail extends Frame {

    public StudentDetail() {

        setTitle("Student Detail Form");
        setSize(400, 500);
        setLayout(null);

        // ---------- NAME ----------
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 80, 20);
        add(nameLabel);

        TextField nameField = new TextField();
        nameField.setBounds(150, 50, 180, 20);
        add(nameField);

        // ---------- GENDER ----------
        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 90, 80, 20);
        add(genderLabel);

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);

        male.setBounds(150, 90, 60, 20);
        female.setBounds(220, 90, 80, 20);

        add(male);
        add(female);

        // ---------- CITY ----------
        Label cityLabel = new Label("City:");
        cityLabel.setBounds(50, 130, 80, 20);
        add(cityLabel);

        Choice cityChoice = new Choice();
        cityChoice.add("Jaipur");
        cityChoice.add("Delhi");
        cityChoice.add("Agra");
        cityChoice.add("Noida");
        cityChoice.add("Farrukhabad");
        cityChoice.add("Kanpur");
        cityChoice.add("Mumbai");

        cityChoice.setBounds(150, 130, 180, 20);
        add(cityChoice);

        // ---------- HOBBIES ----------
        Label hobbyLabel = new Label("Hobbies:");
        hobbyLabel.setBounds(50, 170, 80, 20);
        add(hobbyLabel);

        Checkbox cricket = new Checkbox("Cricket");
        Checkbox kabaddi = new Checkbox("Kabaddi");
        Checkbox football = new Checkbox("Football");

        cricket.setBounds(150, 170, 80, 20);
        kabaddi.setBounds(150, 200, 80, 20);
        football.setBounds(150, 230, 80, 20);

        add(cricket);
        add(kabaddi);
        add(football);

        // ---------- PIN (List) ----------
        Label pinLabel = new Label("PIN:");
        pinLabel.setBounds(50, 270, 80, 20);
        add(pinLabel);

        List pinList = new List();
        pinList.add("302001");
        pinList.add("110001");
        pinList.add("208001");
        pinList.add("201301");
        pinList.add("209625");

        pinList.setBounds(150, 270, 100, 70);
        add(pinList);

        // ---------- COMMENT ----------
        Label commentLabel = new Label("Comment:");
        commentLabel.setBounds(50, 360, 80, 20);
        add(commentLabel);

        TextArea commentBox = new TextArea();
        commentBox.setBounds(150, 360, 180, 60);
        add(commentBox);

        // ---------- Buttons ----------
        Button okBtn = new Button("OK");
        okBtn.setBounds(100, 440, 80, 30);
        add(okBtn);

        Button cancelBtn = new Button("Cancel");
        cancelBtn.setBounds(200, 440, 80, 30);
        add(cancelBtn);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new StudentDetail().setVisible(true);
    }
}
