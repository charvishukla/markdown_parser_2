import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLinks() throws IOException{
        //ArrayList<String> res = MarkdownParse.getLinks("test-file.md");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("https://something.com");
        expectedList.add("some-thing.html");
        assertEquals(expectedList,MarkdownParse.getLinks(content));
    }
}