/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class results {

private JFrame frmQuizmeapp;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
results window = new results();
window.frmQuizmeapp.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public results() {
initialize();
}

/**
* Initialize the contents of the frame.
*/

private void initialize() {


  String file1 = "src/quizapp/audio/cheering.wav";
    music mus = new music();
    mus.playmusic(file1);


      Quizz.result = (int)((Quizz.correctGuesses/(double)Quizz.total_questions)*100);


frmQuizmeapp = new JFrame();
frmQuizmeapp.setIconImage(Toolkit.getDefaultToolkit().getImage("src/quizapp/images/images-removebg-preview.png"));
frmQuizmeapp.setTitle("QuizMe-App");
frmQuizmeapp.setBackground(Color.GRAY);
frmQuizmeapp.setBounds(100, 100, 729, 457);
frmQuizmeapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmQuizmeapp.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(new Color(128, 128, 128));
panel.setBounds(0, -13, 731, 431);
frmQuizmeapp.getContentPane().add(panel);
panel.setLayout(null);
JLabel lblNewLabel_7 = new JLabel("");
lblNewLabel_7.setIcon(new ImageIcon("src/quizapp/images/6ob.gif"));
lblNewLabel_7.setBounds(486, 11, 227, 372);
panel.add(lblNewLabel_7);
JLabel lblNewLabel_6 = new JLabel("");
lblNewLabel_6.setIcon(new ImageIcon("src/quizapp/images/6ob.gif"));
lblNewLabel_6.setBounds(0, 11, 177, 372);
panel.add(lblNewLabel_6);
JLabel lblNewLabel_5 = new JLabel("");
lblNewLabel_5.setIcon(new ImageIcon("src/quizapp/images/6ob.gif"));
lblNewLabel_5.setBounds(187, -35, 300, 418);
panel.add(lblNewLabel_5);
JTextField percentage = new JTextField ();
percentage.setBounds(259, 271, 160, 80);
panel.add(percentage);
percentage.setText(Quizz.result+"%");
percentage.setBackground(new Color(255,255,255));
percentage.setForeground(new Color(0, 0, 0));
percentage.setFont(new Font("MV Boli",Font.BOLD,30));
percentage.setBorder(BorderFactory.createTitledBorder("your percentage is : "));
percentage.setHorizontalAlignment(JTextField.CENTER);
percentage.setEditable(false);

JTextField numberright = new JTextField ();
numberright.setBounds(259, 178, 160, 82);
panel.add(numberright);

numberright.setText("("+Quizz.correctGuesses+"/"+Quizz.total_questions+")");
numberright.setBackground(new Color(255,255,255));
numberright.setForeground(new Color(0, 0, 0));
numberright.setFont(new Font("MV Boli",Font.BOLD,25));
numberright.setBorder(BorderFactory.createTitledBorder("number of right answers :"));
numberright.setHorizontalAlignment(JTextField.CENTER);
numberright.setEditable(false);

JLabel label = new JLabel("Your Results Are :");
label.setForeground(new Color(0, 0, 0));
label.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
label.setBounds(265, 126, 401, 44);
panel.add(label);

JLabel lblNewLabel_1 = new JLabel("Results");
lblNewLabel_1.setFont(new Font("Edwardian Script ITC", Font.BOLD | Font.ITALIC, 99));
lblNewLabel_1.setBounds(224, 11, 354, 102);
panel.add(lblNewLabel_1);

JLabel lblNewLabel = new JLabel("Results");
lblNewLabel.setBackground(new Color(255, 182, 193));
lblNewLabel.setForeground(new Color(255, 255, 255));
lblNewLabel.setFont(new Font("Edwardian Script ITC", Font.BOLD | Font.ITALIC, 99));
lblNewLabel.setIcon(new ImageIcon("src/quizapp/images/report_card_127px.png"));
lblNewLabel.setBounds(225, 11, 481, 102);
panel.add(lblNewLabel);

JLabel lblNewLabel_2 = new JLabel("Your Results Are :");
lblNewLabel_2.setIcon(new ImageIcon("src/quizapp/images/grades_50px.png"));
lblNewLabel_2.setForeground(new Color(255, 255, 255));
lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
lblNewLabel_2.setBounds(260, 124, 401, 44);
panel.add(lblNewLabel_2);

JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\bough\\Desktop\\result.jpg"));
lblNewLabel_3.setBounds(0, 13, 721, 418);
panel.add(lblNewLabel_3);

JLabel lblNewLabel_4 = new JLabel("");
lblNewLabel_4.setIcon(new ImageIcon("src/quizapp/images/grades_50px.png"));
lblNewLabel_4.setBounds(228, 126, 50, 44);
panel.add(lblNewLabel_4);
JLabel label_1 = new JLabel("New label");
label_1.setBounds(99, 315, 46, 14);
panel.add(label_1);
JLabel label_2 = new JLabel("New label");
label_2.setBounds(99, 290, 46, 14);
panel.add(label_2);
}
}