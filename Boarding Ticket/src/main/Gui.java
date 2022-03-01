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
    private JPanel panelCenter;
    private JLabel label;
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
    panelCenter = new JPanel();
    frame.setSize(width, height);
    frame.setResizable(false);

        frame.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
    label = new JLabel("Name:");
    panel.add(label);
    panel.add(name);
    label = new JLabel("Email:");
    panel.add(label);
        panel.add(email);
        label = new JLabel("Phone #:");
        panel.add(label);
        panel.add(phoneNumber);
        label = new JLabel("Gender:");
        panelCenter.add(label);
        panelCenter.add(gender);
        label = new JLabel("Age:");
        panelCenter.add(label);
        panelCenter.add(age);
        label = new JLabel("Date:");
        panelCenter.add(label);
        panelCenter.add(date);
        label = new JLabel("Destination:");
        panelCenter.add(label);
        panelCenter.add(destination);
        label = new JLabel("Depart.Time");
        panelCenter.add(label);
        panelCenter.add(departureTime);
        //panel.add(submit);
        panel.setBackground(Color.CYAN);
        panelCenter.setBackground(Color.CYAN);

     /**   name.setBounds(25,25, 75, 25);

        email.setBounds(25, 75, 75, 25);

        phoneNumber.setBounds(25,125, 75,25);

        gender.setBounds(25,175,75,25);

        age.setBounds(25, 225, 75,25);

        date.setBounds(25,275, 75,25);

        destination.setBounds(25,325, 75,25);

        departureTime.setBounds(25,375, 75,25);

        submit.setBounds(775, 225, 50, 25);
    **/
        //panel.setLocation(5,5);
    //frame.add(panel);
        /**frame.getContentPane().add(name);
        frame.getContentPane().add(email);
        frame.getContentPane().add(phoneNumber);
        frame.getContentPane().add(gender);
        frame.getContentPane().add(age);
        frame.getContentPane().add(date);
        frame.getContentPane().add(destination);
        frame.getContentPane().add(departureTime);
        frame.getContentPane().add(submit);
        frame.getContentPane().setBackground(Color.CYAN);
    frame.setLocation(5,5);**/
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, submit);
        frame.getContentPane().add(BorderLayout.CENTER, panelCenter);

    //frame.setLayout(new FlowLayout());
    //frame.pack();
        frame.setVisible(true);
    }


}
