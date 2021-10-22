/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class music {
    void playmusic(String loc) {
    try {
    File file = new File(loc);
    if(file.exists()) {
    AudioInputStream audio = AudioSystem.getAudioInputStream(file);
       Clip clip = AudioSystem.getClip();
    clip.open(audio);
    clip.start();
    if(loc=="src/quizapp/audio/quiz.wav") {
    clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
   
    }
    }
    catch(Exception e) {
    e.printStackTrace();
    }
   
    }
}
