import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3,2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 2,3 }, input1);
  }
  
  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 3,2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1 };
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = { 2,3 };
    assertArrayEquals(new int[]{ 3,2 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed4() {
    int[] input1 = { 1,2,3 };
    assertArrayEquals(new int[]{ 3,2,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {5};
    double average = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(0, average, 0.0);
  }
  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = { 5,10 };
    double average = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(10, average, 0.0);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input1 = { 12.25,5 };
    double average = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(12.25, average, 0.00);
  }

  @Test
  public void testAverageWithoutLowest4() {
    double[] input1 = { 5,5,12.5,23.5 };
    double average = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(18, average, 0.0);
  }
}
