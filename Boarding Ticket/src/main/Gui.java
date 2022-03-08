import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Gui {
    private final String title = "Boarding Ticket";
    private final String genders[] = {"Male", "Female", "Other"};
    private final int width = 800;
    private final int height = 600;
    private final JFrame frame;
    private final JPanel panel;
    private final JPanel panelCenter;
    private JLabel label;
    private JLabel logopic;
    private JTextField name = new JTextField(20);
    private JTextField email = new JTextField(20);
    private JTextField phoneNumber = new JTextField(20);
    private JComboBox gender = new JComboBox(genders);
    private JTextField age = new JTextField(20);
    private JTextField date = new JTextField(20);
    private JTextField destination = new JTextField(20);
    private JTextField departureTime = new JTextField(20);
    private JTextField origin = new JTextField(20);
    private JButton submit = new JButton("Submit");

    //Path needs to be absolute
    ImageIcon logo = new ImageIcon("C:\\Users\\OrnRo\\IdeaProjects\\Boarding Ticket\\src\\resources\\delta.png");

    public Gui()
    {
    frame = new JFrame(title);
    panel = new JPanel();
    panelCenter = new JPanel();
    logopic = new JLabel();
    frame.setSize(width, height);
    frame.setResizable(true);
    Dimension d = new Dimension (256,192);
        frame.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        logopic.setIcon(logo);
        logopic.setBounds(400, 500, 256, 192);
        logopic.setPreferredSize(d);

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
        panel.add(label);
        panel.add(gender);
        label = new JLabel("Age:");
        panel.add(label);
        panel.add(age);
        label = new JLabel("Date:");
        panel.add(label);
        panel.add(date);
        label = new JLabel("Origin:");
        panel.add(label);
        panel.add(origin);
        label = new JLabel("Destination:");
        panel.add(label);
        panel.add(destination);
        label = new JLabel("Depart.Time");
        panel.add(label);
        panel.add(departureTime);
        //panel.add(submit);
        panel.setBackground(Color.CYAN);
        panelCenter.setBackground(Color.CYAN);

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    returnFields();
            }
                                 });
        panel.add(logopic);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, submit);
        frame.getContentPane().setBackground(Color.CYAN);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public ArrayList<String>returnFields()
    {
        ArrayList output = new ArrayList();
        output.add(name.getText());
        output.add(email.getText());
        output.add(phoneNumber.getText());
        output.add(gender.getSelectedItem());
        output.add(age.getText());
        output.add(date.getText());
        output.add(destination.getText());
        output.add(origin.getText());
        output.add(departureTime.getText());
        for(int i = 0; i < output.size(); i++)
        {
            System.out.println(output.get(i));
        }
        return output;
    }

   public String getTitle() {
        return title;
    }

   public int getWidth(){
        return width;
    }

   public int getHeight(){

        return height;
    }

    public String[] getGenders(){
        return genders;
    }

}
