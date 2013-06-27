package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    words words = new words();
    words.adverb = MessageBox.askForTextInput("Please enter one adverb");
    words.edverb = MessageBox.askForTextInput("Please enter one verb ending in -ed");
    words.currentBodyPart = MessageBox.askForTextInput("Please enter one body part");
    String story = Parser.parseRtfFile("view.rtf", words);
    //MessageBox.showMessage(story);
    Viewer.displayRtfFile(story);
  }
}