import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleScoreTest {

  @Test
  public void calculateScore_returnsScoreForA_1() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForOnePointLetter_1() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("t"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoPointLetter_1() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoCharacterTwoPointLetter_1() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("so"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoCharacterThreePointLetter_1() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("do"));
  }

  @Test
  public void calculateScore_returnsScoreForEighteenPointLetter_1() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 18;
    assertEquals(expected, testScrabble.calculateScore("gazebo"));
  }
}
