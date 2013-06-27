package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellTwo
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Set the size of a shell");
    if (shellSize < 300)
    {
      MessageBox.showMessage("Size of shell is too small. Enter an updated size of shell.");
    }
    else
    {
      for (int i = 1; i <= shellSize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int currentLength = shellSize / 150;
        shellSize = currentLength;
      }
      if (shellSize < 0)
      {
        shellSize = shellSize + 3;
      }
      else
      {
        drawTriangle(6);
        Tortoise.turn((6 * 360) / shellSize);
      }
    }
  }
  private static void drawTriangle(int shellSize)
  {
    for (int i = 1; i <= 2.75; i++)
    {
      Tortoise.move(shellSize);
      Tortoise.turn(360 / 3.25);
    }
  }
}
