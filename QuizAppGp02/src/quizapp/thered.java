/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class thered {

private JFrame frmQuizmeapp;
protected Object show;

/**
* Launch the application.
*/
public static void page2(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
thered window = new thered();
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
public thered() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {

frmQuizmeapp = new JFrame();
frmQuizmeapp.setIconImage(Toolkit.getDefaultToolkit().getImage("src/quizapp/images/images-removebg-preview.png"));
frmQuizmeapp.setTitle("QuizMe-App");
frmQuizmeapp.setBounds(100, 100, 613, 463);
frmQuizmeapp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frmQuizmeapp.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(new Color(105, 105, 105));

panel.setBounds(0, 0, 597, 424);
frmQuizmeapp.getContentPane().add(panel);
panel.setLayout(null);
JLabel lblNewLabel_5 = new JLabel("");
lblNewLabel_5.setIcon(new ImageIcon("src/quizapp/images/button (25).png"));
lblNewLabel_5.setBounds(10, 355, 151, 58);
panel.add(lblNewLabel_5);
lblNewLabel_5.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
	System.exit(1);

}
});
JLabel lblNewLabel_4 = new JLabel("");
lblNewLabel_4.setIcon(new ImageIcon("src/quizapp/images/button (24).png"));
lblNewLabel_4.setBounds(75, 126, 222, 44);
panel.add(lblNewLabel_4);
lblNewLabel_4.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
	NewButton.main(null);

}
});
JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("src/quizapp/images/button (22).png"));
lblNewLabel_2.setBounds(21, 205, 175, 44);
panel.add(lblNewLabel_2);
lblNewLabel_2.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
	AboutUs.main(null);

}
});
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setIcon(new ImageIcon("src/quizapp/images/button (23).png"));
lblNewLabel.setBounds(172, 50, 216, 44);
panel.add(lblNewLabel);
lblNewLabel.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
	try {
		mainquiz.main(null);
	} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	frmQuizmeapp.setVisible(false);
}
});
JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setIcon(new ImageIcon("src/quizapp/images/Untitled-3.png"));
lblNewLabel_3.setBounds(215, 65, 550, 504);
panel.add(lblNewLabel_3);
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("src/quizapp/images/thered.jpg"));
lblNewLabel_1.setBounds(0, 0, 597, 424);
panel.add(lblNewLabel_1);
}
public static void setVisible(boolean b) {

}
}