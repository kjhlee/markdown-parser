import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {

    // @Test
    // public void addition() {
    //     assertEquals(2, 1 + 1);
    // }
    // @Test
    // public void testFile() throws IOException{

    //     Path fileName = Path.of("test-file.md");
    //     String fileCont = Files.readString(fileName);
    //     ArrayList<String> toReturn = MarkdownParse.getLinks(fileCont);
    //     ArrayList<String> expected = new ArrayList<String>();

    //     expected.add("https://something.com");
    //     expected.add("some-thing.html");

    //     assertEquals(expected, toReturn);
        
    // }

    // @Test
    // public void testSnippet1() throws IOException{
    //     Path fileName = Path.of("snippet1.md");
    //     String fileCont = Files.readString(fileName);
    //     ArrayList<String> toReturn = MarkdownParse.getLinks(fileCont);
    //     ArrayList<String> expected = new ArrayList<String>();
    //     expected.add("url.com");
    //     expected.add("`google.com");
    //     expected.add("google.com");

    //     assertEquals(expected, toReturn);
    // }
    // @Test
    // public void testSnippet2() throws IOException{
    //     Path fileName = Path.of("snippet2.md");
    //     String fileCont = Files.readString(fileName);
    //     ArrayList<String> toReturn = MarkdownParse.getLinks(fileCont);
    //     ArrayList<String> expected = new ArrayList<String>();
    //     expected.add("a.com");
    //     expected.add("a.com(())");
    //     assertEquals(expected, toReturn);
    // }
    @Test
    public void testSnippet3() throws IOException {
        Path fileName = Path.of("snippet3.md");
        String fileCont = Files.readString(fileName);
        ArrayList<String> toReturn = MarkdownParse.getLinks(fileCont);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("    https://www.twitter.com");
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");


        assertEquals(expected, toReturn);
    }
    // @Test
    // public void testFile2() throws IOException{

    //     Path fileName = Path.of("test-file2.md");
    //     String fileCont = Files.readString(fileName);
    //     ArrayList<String> toReturn = MarkdownParse.getLinks(fileCont);
    //     ArrayList<String> expected = new ArrayList<String>();

    //     expected.add("https://something.com");
    //     expected.add("some-page.html");

    //     assertEquals(expected, toReturn);
        
    // }

    // @Test
    // public void testFile3() throws IOException{

    //     Path fileName = Path.of("noBrack.md");
    //     String fileCont = Files.readString(fileName);
    //     ArrayList<String> toReturn = MarkdownParse.getLinks(fileCont);
    //     ArrayList<String> expected = new ArrayList<String>();

    //     expected.add("https://youtube.com");

    //     assertEquals(expected, toReturn);
        
    // }


}