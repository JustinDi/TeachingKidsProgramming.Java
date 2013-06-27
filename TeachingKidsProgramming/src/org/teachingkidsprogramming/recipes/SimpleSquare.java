package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 1; i <= 100; i++)
    {
      Tortoise.setPenColor(Colors.Reds.DarkRed);
      Tortoise.move(i / 10);
      Tortoise.turn(360 / i);
    }
    for (int i = 100; i >= 1; i++)
    {
      Tortoise.setPenColor(Colors.Reds.DarkRed);
      Tortoise.move(i / 10);
      Tortoise.turn(360 / i);
    }
    for (int i = 1; i <= 100; i++)
    {
      Tortoise.setPenColor(Colors.Reds.DarkRed);
      Tortoise.move(i / 10);
      Tortoise.turn(-360 / i);
    }
  }
}
