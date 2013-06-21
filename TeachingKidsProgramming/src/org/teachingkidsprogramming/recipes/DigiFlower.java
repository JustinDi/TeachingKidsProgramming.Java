package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Oranges;
import org.teachingextensions.logo.Colors.Reds;
import org.teachingextensions.logo.Colors.Yellows;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(Colors.Grays.Silver);
    Tortoise.setPenWidth(3);
    createColorPalette();
    for (int i = 1; i <= 15; i++)
    {
      drawOctagon();
      Tortoise.turn(360 / 15);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Reds.Red);
    ColorWheel.addColor(Oranges.DarkOrange);
    ColorWheel.addColor(Yellows.Gold);
    ColorWheel.addColor(Yellows.Yellow);
    ColorWheel.addColor(Yellows.Yellow);
    ColorWheel.addColor(Yellows.Gold);
    ColorWheel.addColor(Oranges.DarkOrange);
    ColorWheel.addColor(Reds.Red);
  }
  private static void drawOctagon()
  {
    drawingOctagon();
    drawingOctagon();
    drawingOctagon();
    drawingOctagon();
    drawingOctagon();
    drawingOctagon();
    drawingOctagon();
    drawingOctagon();
  }
  private static void drawingOctagon()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.move(50);
    Tortoise.turn(360 / 8);
  }
}
