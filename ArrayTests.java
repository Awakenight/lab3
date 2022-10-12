import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 3 , 5 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 5, 3 }, input2);
	}

	@Test 
	public void testReverseInPlaceEmpty() {

    int[] input4 = { };
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{ }, input4);
	}

	@Test 
	public void testReverseInPlaceMany() {

    int[] input3 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input3);

	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 5 , 10 };
    assertArrayEquals(new int[]{ 10 , 5 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversedOdd() {

    int[] input3 = { 5, 9, 17 };
    assertArrayEquals(new int[]{ 17, 9, 5 }, ArrayExamples.reversed(input3));
  }
}
