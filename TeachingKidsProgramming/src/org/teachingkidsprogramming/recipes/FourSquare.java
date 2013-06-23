package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    drawSquare();
    drawSquare();
    drawSquare();
    drawSquare();
    Tortoise.turn(90);
    //  Repeat
  }
  private static void drawSquare()
  {
    lineTurnright();
    lineTurnright();
    lineTurnright();
    lineTurnright();
  }
  private static void lineTurnright()
  {
    Tortoise.setPenColor(Colors.getRandomColor());
    Tortoise.move(50);
    Tortoise.turn(90);
  }
}
