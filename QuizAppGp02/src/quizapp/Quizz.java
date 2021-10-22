/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.awt.event.*;
import java.io.IOException;
import java.awt.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;


public class Quizz implements ActionListener   {

String [] questions= {
"Which city is Argentina's capital ?\r\n",
"Which animal has the strongest bite ?\r\n",
"How many times does the eye blink in a minute ?\r\n",
"Who was the first president of the united states of America ?\r\n",
"How many bird species are there in the world ?\r\n",
"which one is the biggest sea in the world?\r\n",
"When was java initially released ?\r\n",
"What is the largest organ in the human body ?\r\n",
"Who is the scientest who discovered the multiplication table ?\r\n",
   "What is the result of this equation: (-5^0)-(-5)^0 ?\r\n",
                    };
 String [][] options = {
{"Caracas","Buenos Aires","Lima","Saw Paulo"},
{ "Great white shark" , "Salt water crocodile" , "Hippopotamus" , "Polar bear" },
{"Arround 20 times","Arround 30 times", "Arround 10 times","Arround 5 times"},
{"J.F Kennedy","Ibraham Lincolin", "George Washington", "Richard Nixon"},
{"100.000","50.000","10.000","500,000"},
{"Philippine Sea","Coral Sea","Caribbean Sea","Norwegian Sea"},
{"1980","1996","1991" , "1979"},
{"The liver","The lungs","The intestine","The skin"},
{"Alan Turing","Whilhelm Leibnter","John Leslie","Fibonacci"},
{"-2","-1","0","1"},
                  };
 char [] answers = {
             'B',
             'B',
             'A',
             'C',
             'C',
             'A',
             'B',
             'D',
             'C',
             'A',

                   };
 
 char guess ;
 char answer ;
 int index ;
 static int correctGuesses=0 ;
 static int total_questions= 10;
 static int result ;
 int timer= 12 ;
 
 JFrame frmQuizmeapp = new JFrame ();
 JTextField textfield = new JTextField ();
 JLabel textarea = new JLabel ();
 
 JButton buttonA = new JButton ();
 JButton buttonB = new JButton ();
 JButton buttonC = new JButton ();
 JButton buttonD = new JButton ();
 
 JLabel answerlabelA = new JLabel();
 JLabel answerlabelB = new JLabel();
 JLabel answerlabelC = new JLabel();
 JLabel answerlabelD = new JLabel();
 
 JLabel timerlabel=new JLabel();
 
 JLabel timerdown = new JLabel ();
 
 JTextField numberright = new JTextField ();
 JTextField percentage = new JTextField ();
 
 
 Timer temp = new Timer(1000, new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
timer--;
timerdown.setText(String.valueOf(timer));
if(timer <= 0 ) {
displaylAnswer();
}
}
});
 
public void Quizz() {


frmQuizmeapp.setIconImage(Toolkit.getDefaultToolkit().getImage("src/quizapp/images/images-removebg-preview.png"));
frmQuizmeapp.setTitle("QuizMe-App");

frmQuizmeapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmQuizmeapp.setSize(858,505);
frmQuizmeapp.getContentPane().setBackground(new Color(255, 228, 225));
frmQuizmeapp.getContentPane().setLayout(null);
frmQuizmeapp.setResizable(true);

buttonA.setBounds(176, 134, 62, 58);
buttonA.setFont(new Font("Viner Hand ITC", Font.BOLD, 25) );
buttonA.setBackground(new Color(209, 230, 231));
buttonA.setFocusable(false);
buttonA.addActionListener(this);
buttonA.setText("A");


buttonB.setBounds(176, 206, 62, 58);
buttonB.setFont(new Font("Viner Hand ITC", Font.BOLD, 25) );
buttonB.setBackground(new Color(209, 230, 231));
buttonB.setFocusable(false);
buttonB.addActionListener(this);
buttonB.setText("B");


buttonC.setBounds(176, 275, 62, 58);
buttonC.setFont(new Font("Viner Hand ITC", Font.BOLD, 25) );
buttonC.setBackground(new Color(209, 230, 231));
buttonC.setFocusable(false);
buttonC.addActionListener(this);
buttonC.setText("C");


buttonD.setBounds(176, 345, 62, 58);
buttonD.setFont(new Font("Viner Hand ITC", Font.BOLD, 25) );
buttonD.setBackground(new Color(209, 230, 231));
buttonD.setFocusable(false);
buttonD.addActionListener(this);
buttonD.setText("D");

answerlabelA.setBounds(253, 134, 420, 58);
answerlabelA.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 33));
answerlabelA.setForeground(new Color(0, 0, 0));


answerlabelB.setBounds(253, 204,410, 61);
answerlabelB.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 33));
answerlabelB.setForeground(Color.BLACK);

answerlabelC.setBounds(253, 276, 420, 57);
answerlabelC.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 33));
answerlabelC.setForeground(Color.BLACK);

answerlabelD.setBounds(253, 344, 410, 59);
answerlabelD.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 33));
answerlabelD.setForeground(Color.BLACK);


timerdown.setBounds(398, 423, 50, 50);
timerdown.setBackground(new Color (209, 230, 231));
timerdown.setForeground(new Color (255,0,0));
timerdown.setFont(new Font("Ink Free", Font.BOLD | Font.ITALIC, 25));
timerdown.setBorder(BorderFactory.createEmptyBorder());
timerdown.setOpaque(false);
timerdown.setHorizontalAlignment(JTextField.CENTER);
timerdown.setText(String.valueOf(timer));


numberright.setBounds(360,225,160,60);
numberright.setBackground(new Color(255,255,255));
numberright.setForeground(new Color(0,0,0));
numberright.setFont(new Font("MV Boli",Font.BOLD,25));
numberright.setBorder(BorderFactory.createTitledBorder("number of right answers :"));
numberright.setHorizontalAlignment(JTextField.CENTER);
numberright.setEditable(false);


percentage.setBounds(360,290,160,60);
percentage.setBackground(new Color(255,255,255));
percentage.setForeground(new Color(0,0,0));
percentage.setFont(new Font("MV Boli",Font.BOLD,30));
percentage.setBorder(BorderFactory.createTitledBorder("your percentage is : "));
percentage.setHorizontalAlignment(JTextField.CENTER);
percentage.setEditable(false);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("src/quizapp/images/Untitled-6.png"));
lblNewLabel_1.setBounds(669, 276, 163, 174);
frmQuizmeapp.getContentPane().add(lblNewLabel_1);


textarea.setBounds(33, 33, 950,98);
textarea.setForeground(new Color(0, 0, 0));
textarea.setFont(new Font("Segoe Print", Font.BOLD, 26));
textarea.setBorder(BorderFactory.createBevelBorder(10000));
frmQuizmeapp.getContentPane().add(textarea);
// hada zidi a3dlihom




frmQuizmeapp.getContentPane().add(timerdown);
frmQuizmeapp.getContentPane().add(answerlabelA);
frmQuizmeapp.getContentPane().add(answerlabelB);
frmQuizmeapp.getContentPane().add(answerlabelC);
frmQuizmeapp.getContentPane().add(answerlabelD);
frmQuizmeapp.getContentPane().add(buttonA);
frmQuizmeapp.getContentPane().add(buttonB);
frmQuizmeapp.getContentPane().add(buttonC);
frmQuizmeapp.getContentPane().add(buttonD);
frmQuizmeapp.getContentPane().add(textfield);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("src/quizapp/images/hiii.jpg"));
lblNewLabel.setBounds(0, 0, 854, 473);
frmQuizmeapp.getContentPane().add(lblNewLabel);
frmQuizmeapp.setVisible(true);

nextQuestion();


}
public void nextQuestion() {

if (index>= total_questions) {
result();
}
else {
textfield.setText("Questions"+(index+1));
textarea.setText(questions[index]);
answerlabelA.setText(options[index][0]);
answerlabelB.setText(options[index][1]);
answerlabelC.setText(options[index][2]);
answerlabelD.setText(options[index][3]);

temp.start();

}


}
@Override
public void actionPerformed(ActionEvent e) {

buttonA.setEnabled(true);
buttonB.setEnabled(true);
buttonC.setEnabled(true);
buttonD.setEnabled(true);
// hado rodihom mba3d true

if(e.getSource() == buttonA) {
answer = 'A';
        if (answer == answers [index] ) {
       
        correctGuesses++;
        String file1 = "src/quizapp/audio/correct1.wav";
    music mus = new music();
    mus.playmusic(file1);
       
        }
        else {
        String file1 = "src/quizapp/audio/wrong.wav";
    music mus = new music();
    mus.playmusic(file1);
        }
}
if(e.getSource() == buttonB) {
answer = 'B';
        if (answer == answers [index] ) {
        String file = "src/quizapp/audio/correct1.wav";
    music mus = new music();
    mus.playmusic(file);
       
        correctGuesses++;
        }
        else {
        String file1 = "src/quizapp/audio/wrong.wav";
    music mus = new music();
    mus.playmusic(file1);
        }
}
if(e.getSource() == buttonC) {
answer = 'C';
        if (answer == answers [index] ) {
        String file1 = "src/quizapp/audio/correct1.wav";
    music mus = new music();
    mus.playmusic(file1);
        correctGuesses++;
        }
        else {
        String file1 = "src/quizapp/audio/wrong.wav";
    music mus = new music();
    mus.playmusic(file1);
        }
}
if(e.getSource() == buttonD) {
answer = 'D';
        if (answer == answers [index] ) {
        String file1 = "src/quizapp/audio/correct1.wav";
    music mus = new music();
    mus.playmusic(file1);
        correctGuesses++;
        }
        else {
        String file1 = "src/quizapp/audio/wrong.wav";
    music mus = new music();
    mus.playmusic(file1);
        }
       
       
}
displaylAnswer ();


}
public void displaylAnswer () {


temp.stop();

buttonA.setEnabled(true);
buttonB.setEnabled(true);
buttonC.setEnabled(true);
buttonD.setEnabled(true);
// hado rodihom mba3d true

if (answers[index] != 'A') {
answerlabelA.setForeground(new Color (255,0,0));

}
else
answerlabelA.setForeground(new Color ( 38, 106, 46));

if (answers[index] != 'B') {
answerlabelB.setForeground(new Color (255,0,0));

}
else
answerlabelB.setForeground(new Color ( 38, 106, 46));

if (answers[index] != 'C') {
answerlabelC.setForeground(new Color (255,0,0));

}
else
answerlabelC.setForeground(new Color ( 38, 106, 46));

if (answers[index] != 'D') {
answerlabelD.setForeground(new Color (255,0,0));

}
else
answerlabelD.setForeground(new Color ( 38, 106, 46));


Timer pause = new Timer (1000, new ActionListener() {
@Override
public void actionPerformed (ActionEvent e) {
answerlabelA.setForeground(new Color ( 38, 106, 46));
answerlabelB.setForeground(new Color ( 38, 106, 46));
answerlabelC.setForeground(new Color ( 38, 106, 46));
answerlabelD.setForeground(new Color ( 38, 106, 46));

answer = ' ' ;
timer = 12 ;
timerdown.setText (String.valueOf(timer));
buttonA.setEnabled(true);
buttonB.setEnabled(true);
buttonC.setEnabled(true);
buttonD.setEnabled(true);

index++;
nextQuestion();


}
});
pause.setRepeats(false);
pause.start();

}
public void result () {
frmQuizmeapp.setVisible(false);

result = (int)((correctGuesses/(double)total_questions)*100);

numberright.setText("("+correctGuesses+"/"+total_questions+")");
percentage.setText(result+"%");
results.main(null);
}
}