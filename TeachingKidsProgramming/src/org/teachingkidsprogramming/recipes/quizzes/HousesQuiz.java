package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuiz
{
  public void question1()
  {
    //  The current length is 7
    length = 7;
  }
  public void medium()
  {
    length = 21;
  }
  public void large()
  {
    length = 63;
  }
  @Override
  public void moveTheLength()
  {
    Tortoise.move(length);
  }
  @Override
  public void turnTheCorner()
  {
    Tortoise.turn(-360 / 3);
  }
  @Override
  public void drawASide()
  {
    moveTheLength();
    turnTheCorner();
  }
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
