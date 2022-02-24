import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Gui {
    String title = "Boarding Ticket";
    private String genders[] = {"Male", "Female", "Other"};
    private int width = 800;
    private int height = 600;
    private JFrame frame;
    private JPanel panel;
    private JTextField name = new JTextField(20);
    private JTextField email = new JTextField(20);
    private JTextField phoneNumber = new JTextField(20);
    private JComboBox gender = new JComboBox(genders);
    private JTextField age = new JTextField(20);
    private JTextField date = new JTextField(20);
    private JTextField destination = new JTextField(20);
    private JTextField departureTime = new JTextField(20);
    private JButton submit = new JButton("Submit");
    public Gui()
    {
    frame = new JFrame(title);
    panel = new JPanel();
    frame.setSize(width, height);
    frame.setResizable(false);

        frame.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));

    panel.add(name);
        panel.add(email);
        panel.add(phoneNumber);
        panel.add(gender);
        panel.add(age);
        panel.add(date);
        panel.add(destination);
        panel.add(departureTime);
        panel.setBackground(Color.CYAN);
        name.setBounds(25,25, 75, 25);

        email.setBounds(25, 75, 75, 25);

        phoneNumber.setBounds(25,125, 75,25);

        gender.setBounds(25,175,75,25);

        age.setBounds(25, 225, 75,25);

        date.setBounds(25,275, 75,25);

        destination.setBounds(25,325, 75,25);

        departureTime.setBounds(25,375, 75,25);
        //panel.setLocation(5,5);
    frame.add(panel);
    /**frame.add(name);
    frame.add(email);
    frame.add(phoneNumber);
    frame.add(gender);
    frame.add(age);
    frame.add(date);
    frame.add(destination);
    frame.add(departureTime);
    frame.setBackground(Color.CYAN);
    frame.setLocation(5,5);
**/

    //frame.setLayout(new FlowLayout());
    //frame.pack();
        frame.setVisible(true);
    }


}
