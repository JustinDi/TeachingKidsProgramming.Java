package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    words words = new words();
    words.adverb = MessageBox.askForTextInput("Please enter an adverb");
    words.edverb = MessageBox.askForTextInput("Please enter a verb ending in -ed");
    words.currentBodyPart = MessageBox.askForTextInput("Please enter a body part");
    String story = Parser.parse("Today I woke {adverb}. Then I {edverb} my {currentBodyPart}.", words);
    MessageBox.showMessage(story);
  }
}