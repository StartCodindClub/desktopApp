/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class mainquiz {

public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
| UnsupportedLookAndFeelException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

Quizz q = new Quizz();
q.Quizz();


}

}