/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AboutUs {

private JFrame frmQuizmeapp;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
AboutUs window = new AboutUs();
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
public AboutUs() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmQuizmeapp = new JFrame();
frmQuizmeapp.getContentPane().setForeground(Color.WHITE);
frmQuizmeapp.setIconImage(Toolkit.getDefaultToolkit().getImage("src/quizapp/images/images-removebg-preview.png"));
frmQuizmeapp.setTitle("QuizMe-App");
frmQuizmeapp.setBounds(100, 100, 368, 299);
frmQuizmeapp.getContentPane().setLayout(null);
JLabel lblNewLabel_7 = new JLabel("");
lblNewLabel_7.setIcon(new ImageIcon("src/quizapp/images/button (42).png"));
lblNewLabel_7.setBounds(125, 207, 106, 42);
frmQuizmeapp.getContentPane().add(lblNewLabel_7);
lblNewLabel_7.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
frmQuizmeapp.setVisible(false);

}
});


JLabel lblNewLabel_5 = new JLabel("");
lblNewLabel_5.setBounds(53, 139, 20, 20);
lblNewLabel_5.setIcon(new ImageIcon("src/quizapp/images/Untitled-1.png"));
frmQuizmeapp.getContentPane().add(lblNewLabel_5);
JLabel lblNewLabel_4 = new JLabel("");
lblNewLabel_4.setBounds(53, 207, 20, 20);
lblNewLabel_4.setIcon(new ImageIcon("src/quizapp/images/Untitled-1.png"));
frmQuizmeapp.getContentPane().add(lblNewLabel_4);

JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setBounds(53, 65, 20, 32);
lblNewLabel_1.setIcon(new ImageIcon("src/quizapp/images/Untitled-1.png"));
frmQuizmeapp.getContentPane().add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setBounds(53, 170, 20, 20);
lblNewLabel_2.setIcon(new ImageIcon("src/quizapp/images/Untitled-1.png"));
frmQuizmeapp.getContentPane().add(lblNewLabel_2);

JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setBounds(53, 108, 20, 20);
lblNewLabel_3.setIcon(new ImageIcon("src/quizapp/images/Untitled-1.png"));
frmQuizmeapp.getContentPane().add(lblNewLabel_3);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("src/quizapp/images/AboutUs.jpg"));
lblNewLabel.setBounds(0, -6, 352, 266);
frmQuizmeapp.getContentPane().add(lblNewLabel);
}
}