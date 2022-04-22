import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.*;
import java.util.ArrayList;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void newTest() throws IOException{
        Path fileName = Path.of("test-file.md");
        String fileCont = Files.readString(fileName);
        ArrayList<String> toReturn = new ArrayList<String>();

        int currentIndex = 0;
        while(currentIndex < fileCont.length())
        {
            int openBracket = fileCont.indexOf("[", currentIndex);
            int closeBracket = fileCont.indexOf("]", openBracket);
            int openParen = fileCont.indexOf("(", closeBracket);
            int closeParen = fileCont.indexOf(")", openParen);

            toReturn.add(fileCont.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
        }
        System.out.println(toReturn);
        
    }


}