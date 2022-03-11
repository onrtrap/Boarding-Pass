import javax.swing.*;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;

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
    String exit;
    Dictionary wordGuess;
    public GuesserGui(String title) {
        game = true;
        playing = true;
        pressed = false;
        String wGuess = "";
        ArrayList <String> incomplete = new ArrayList<String>();
        String incompleteString = "";
        part = 1;
        Dictionary wordGuess = new Dictionary();
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HangmanGui hang = new HangmanGui("Hangman");
        hang.addImage("hangman0.jpg");
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
                pressed = true;
            }
        });

       frame.getContentPane().add(BorderLayout.NORTH, panelTop);
       frame.getContentPane().add(BorderLayout.SOUTH, panelBottom);
        hang.setVisible();
        this.setVisible();
    while(game) {
        String answer = wordGuess.getWord();
        incomplete.removeAll(Collections.emptyList());

        for(int i = 0; i < answer.length() - 1; i++)
        {
            wGuess += "_";
            incomplete.add("_");
        }
        while (playing) {
            incompleteString = "";
            for(int i = 0; i < answer.length() - 1; i++)
            {
             if(wGuess.charAt(i) == answer.charAt(i)) {
                 incomplete.set(i, "" + wGuess.charAt(i));
             }
            }
            for(int i = 0; i < incomplete.size() - 1; i++)
            {
                incompleteString += incomplete.get(i);
            }
            setText(incompleteString);
            while(!pressed) {
                guess.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        returnGuess();
                        pressed = true;
                    }
                });
            }
        }
        setText("Play Again? Y/N");
        while(!pressed) {
            guess.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    returnGuess();
                    pressed = true;
                }
            });
            if (exit.equals("N") || exit.equals("n")) {
                game = false;
                pressed = true;
                setText("Goodbye!");
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
            else if(exit.equals("Y") || exit.equals("y")){
                game = true;
                pressed = true;
            }
        }
    }

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
        wGuess = output;
    }

    public void returnAnswer(){
        String output = guessField.getText();
        exit = output;
    }

    public String getGuess(){
        return whatIs;
    }
}
