import java.util.List;
import java.util.ArrayList;


public class ScrabbleScore {

  public Integer calculateScore(String userWord){
    String[] arrayOne = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    String[] arrayTwo = {"d", "g"};
    String[] arrayThree = {"b", "c", "m", "p"};
    String[] arrayFour = {"f", "h", "v", "w", "y"};
    String[] arrayFive = {"k"};
    String[] arrayEight = {"j", "x"};
    String[] arrayTen = {"q", "z"};
    Integer result = 0;
    String[] wordArray = userWord.split("");
    for ( String userLetter : wordArray) {
      for (String resultLetter : arrayOne ) {
        if (userLetter.equals(resultLetter)) {
          result += 1;
        }
      }
      for (String resultLetter : arrayTwo ) {
        if (userLetter.equals(resultLetter)) {
          result += 2;
        }
      }
      for (String resultLetter : arrayThree ) {
        if (userLetter.equals(resultLetter)) {
          result += 3;
        }
      }
      for (String resultLetter : arrayFour ) {
        if (userLetter.equals(resultLetter)) {
          result += 4;
        }
      }
      for (String resultLetter : arrayFive ) {
        if (userLetter.equals(resultLetter)) {
          result += 5;
        }
      }
      for (String resultLetter : arrayEight ) {
        if (userLetter.equals(resultLetter)) {
          result += 8;
        }
      }
      for (String resultLetter : arrayTen ) {
        if (userLetter.equals(resultLetter)) {
          result += 10;
        }
      }
    }
    return result;
  }

}
