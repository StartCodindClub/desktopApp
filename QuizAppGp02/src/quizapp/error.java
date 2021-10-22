/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class error {

private JFrame frmQuizmeapp;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
error window = new error();
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
public error() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmQuizmeapp = new JFrame();
frmQuizmeapp.setIconImage(Toolkit.getDefaultToolkit().getImage("src/quizapp/images/images-removebg-preview.png"));
frmQuizmeapp.setTitle("QuizMe-App");
frmQuizmeapp.setBounds(100, 100, 344, 121);
frmQuizmeapp.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("Enter your user name and email plesae");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel.setBounds(66, 19, 262, 43);
frmQuizmeapp.getContentPane().add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("src/quizapp/images/error.png"));
lblNewLabel_1.setBounds(10, 19, 46, 43);
frmQuizmeapp.getContentPane().add(lblNewLabel_1);
}

}