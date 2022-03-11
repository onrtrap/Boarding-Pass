import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class HangmanGui {
    private JFrame frame;
    private JLabel hangmanPic;
    private Container c;
    public HangmanGui(String title){
        frame = new JFrame(title);
        //frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,200, 500, 800);
        hangmanPic = new JLabel();

    }

    public void addImage(String filepath){
        String path = filepath;
        //hangmanPic.setLocation(20, 100);
        //hangmanPic.setSize(500, 800);
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        //hangmanPic.setIcon(icon);

        frame.add(new JLabel(icon));
        frame.revalidate();
    }

    public void setVisible(){
        frame.pack();
        frame.setVisible(true);
    }
}
