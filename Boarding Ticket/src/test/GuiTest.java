import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GuiTest {

    Gui gui;

    @BeforeEach
    void setUp(){
        gui = new Gui();
    }

    @Test
    public void getTitle(){
        assertEquals("Boarding Ticket", gui.getTitle(), "Error on Title" );
    }

    @Test
    public void getWidth(){
        assertEquals(800, gui.getWidth(), "Error on Width" );
    }

    @Test
    public void getHeight(){
        assertEquals(600, gui.getHeight(), "Error on Height" );
    }

    @Test
    public void getGenders(){
        assertEquals(new String[]{"Male", "Female", "Other"}, gui.getGenders(), "Error on Genders");
    }

    @AfterEach
    void tearDown(){

    }
}