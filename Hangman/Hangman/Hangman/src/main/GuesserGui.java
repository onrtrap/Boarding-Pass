import javax.swing.*;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuesserGui {

    JTextPane textPane;
    JFrame frame;
    JTextField guessField = new JTextField(20);
    JButton guess = new JButton("Guess");
    String whatIs;
    boolean pressed;
    boolean game;
    boolean playing;
    int part;
    String wGuess;
    Dictionary wordGuess;
    public GuesserGui(String title) {
        game = true;
        playing = true;
        pressed = false;
        String wGuess = "";
        part = 1;
        Dictionary wordGuess = new Dictionary();
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HangmanGui hang = new HangmanGui("Hangman");
        hang.addImage("C:\\Users\\OrnRo\\OneDrive\\Documents\\GitHub\\Hangman\\src\\resources\\hangman0.jpg");
        textPane = new JTextPane();
        whatIs = "";
       JPanel panelTop = new JPanel();
       JPanel panelBottom = new JPanel();

       panelTop.add(textPane);
       panelBottom.add(guessField);
       panelBottom.add(guess);

        guess.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                returnGuess();
                setText(getGuess());
                pressed = true;
            }
        });

       frame.getContentPane().add(BorderLayout.NORTH, panelTop);
       frame.getContentPane().add(BorderLayout.SOUTH, panelBottom);
        hang.setVisible();
        this.setVisible();

        String answer = wordGuess.getWord();
    }

    public void setVisible(){
        frame.pack();
        frame.setVisible(true);
    }

    public void setText(String text){
        textPane.setText(text);
        frame.revalidate();
    }
    public void returnGuess(){
        String output = guessField.getText();
        whatIs = output;
    }

    public String getGuess(){
        return whatIs;
    }
}
