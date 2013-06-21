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
    //    ------------- Recipe for createColorPalette --#8
    createColorPalette();
    //    ------------- End of createColorPalette recipe 
    //    DrawPentagon (recipe below) --#10
    //    ------------- Recipe for drawPentagon --#10
    //    Do the following 200 times --#2
    //        AdjustPen (recipe below) --#9
    //        ------------- Recipe for adjustPen --#9
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15          
    //        If the tortoises pen width is greater than 4, then --#17
    //            Reset it to 1 --#16
    //        ------------- End of adjustPen recipe 
    //        Move the tortoise the length of a side --#4
    Tortoise.turn(360 / 5);
    //        Turn the tortoise 1 more degree --#5
    //    Repeat
    //    ------------- End of drawPentagon recipe
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
