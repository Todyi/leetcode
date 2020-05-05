package easy._300_399._374_guess_number_higher_or_lower;

/**
 * Copyright (c) 2020 by tody.cc
 *
 * @ClassName: GuessGame
 * @Description:
 * @author: tody
 * @Date: 2020-05-05 11:56:03
 */

public class GuessGame {
  static int guessNum;

  public GuessGame() {
  }

  public GuessGame(int guessNum) {
    this.guessNum = guessNum;
  }

  public int guess(int num){
    if (guessNum < num){
      return -1;
    }else if (num < guessNum){
      return 1;
    }else {
      return 0;
    }
  }
}
