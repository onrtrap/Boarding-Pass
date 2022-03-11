import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Dictionary {
    ArrayList<String> lines;
    public Dictionary(){
        lines = new ArrayList<String>();

        try{
            lines = new ArrayList<>(Files.readAllLines(Paths.get("src/resources/1-1000.txt")));
        }
        catch(IOException e){

        }
    }

    public String getWord(){
        int size = lines.size();
        int rand = (int)(Math.random() * (size + 1));
        return lines.get(rand);
    }
}
