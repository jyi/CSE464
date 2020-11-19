// comment
package patterns.decorator.example2;

import com.sun.deploy.net.proxy.RemoveCommentReader;
import com.sun.org.apache.xerces.internal.impl.io.UTF16Reader;
import org.junit.Test;

import java.io.*;

public class IODecoratorTest {

    @Test
    public void test1() throws IOException {
        String line;
        BufferedReader in = new BufferedReader(new FileReader("rsc/test.txt"));
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    @Test
    public void test2() throws IOException {
        String line;
        BufferedReader in = new BufferedReader(
                new CharArrayReader(new char[]{'A', 'B', 'C'}));
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    @Test
    public void test3() throws IOException {
        String line;
        BufferedReader in = new BufferedReader(new RemoveCommentReader(new FileReader("rsc/test.txt")));
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
