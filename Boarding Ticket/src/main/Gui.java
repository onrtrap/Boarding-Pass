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
    private final JPanel imagePanel;
    private final JPanel panelCenter;
    private JLabel label;
    private JLabel logo;
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

    public Gui()
    {
    frame = new JFrame(title);
    panel = new JPanel();
    imagePanel = new JPanel();
    panelCenter = new JPanel();
    frame.setSize(width, height);
    frame.setResizable(false);

        frame.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        //logo = new JLabel();
        //logo.setIcon(new ImageIcon("delta.png"));
        //Dimension size = logo.getPreferredSize();
        //logo.setBounds(400, 500, 256, 192);
        //imagePanel.add(logo);

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
        label = new JLabel("Origin:");
        panelCenter.add(label);
        panelCenter.add(origin);
        label = new JLabel("Destination:");
        panelCenter.add(label);
        panelCenter.add(destination);
        label = new JLabel("Depart.Time");
        panelCenter.add(label);
        panelCenter.add(departureTime);
        //panel.add(submit);
        panel.setBackground(Color.CYAN);
        panelCenter.setBackground(Color.CYAN);

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    returnFields();
            }
                                 });
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, submit);
        frame.getContentPane().add(BorderLayout.CENTER, panelCenter);

    //frame.setLayout(new FlowLayout());
        frame.pack();
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


}
