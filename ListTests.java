import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{

    @Test 
	public void testfilter(){
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<String> expected = new ArrayList<String>();
        String[] input1 = {"first" , "second", "third"};
        StringChecker sc = new ListExamples(); 
        for(int i = 0; i < input1.length; i++) {
            input.add(input1[i]);
        }
        for(int i = 0; i < input1.length; i++) {
            expected.add(input1[i]);
        }

        assertEquals(expected, ListExamples.filter(input, sc));
    }

}