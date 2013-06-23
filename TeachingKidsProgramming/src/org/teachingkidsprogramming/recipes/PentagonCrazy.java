package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Colors.Purples;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 1; i <= 200; i++)
    {
      adjustPen();
      Tortoise.move(i);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    if (Tortoise.getPenWidth() > 4)
      ;
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.SteelBlue);
    ColorWheel.addColor(Purples.DarkOrchid);
    ColorWheel.addColor(Blues.DarkSlateBlue);
    ColorWheel.addColor(Blues.Teal);
    ColorWheel.addColor(Purples.Indigo);
  }
}
