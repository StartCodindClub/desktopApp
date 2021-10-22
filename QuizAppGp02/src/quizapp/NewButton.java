/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;

public class NewButton {

private JFrame frmQuizmeapp;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
NewButton window = new NewButton();
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
public NewButton() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmQuizmeapp = new JFrame();
frmQuizmeapp.setIconImage(Toolkit.getDefaultToolkit().getImage("src/quizapp/images/images-removebg-preview.png"));
frmQuizmeapp.setTitle("QuizMe-App");
frmQuizmeapp.setBounds(100, 100, 368, 299);
frmQuizmeapp.getContentPane().setLayout(null);
JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("src/quizapp/images/button (42).png"));
lblNewLabel_2.setBounds(132, 215, 100, 41);
frmQuizmeapp.getContentPane().add(lblNewLabel_2);
lblNewLabel_2.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
frmQuizmeapp.setVisible(false);

}
});

JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("src/quizapp/images/HowToPlay.jpg"));
lblNewLabel.setBounds(0, 0, 352, 260);
frmQuizmeapp.getContentPane().add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setFont(new Font("Vivaldi", Font.PLAIN, 27));
lblNewLabel_1.setBounds(46, 677, 46, 14);
frmQuizmeapp.getContentPane().add(lblNewLabel_1);

JLayeredPane layeredPane = new JLayeredPane();
layeredPane.setBounds(285, 70, -34, -35);
frmQuizmeapp.getContentPane().add(layeredPane);

JLayeredPane layeredPane_1 = new JLayeredPane();
layeredPane_1.setBounds(158, 87, -54, -52);
frmQuizmeapp.getContentPane().add(layeredPane_1);
}

public void setVisible(boolean b) {
// TODO Auto-generated method stub

}
}