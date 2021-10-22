/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

/**
 *
 * @author mac
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


public class quizApp extends javax.swing.JFrame  {
 
/**
*
*/
private static final long serialVersionUID = 1L;
private JFrame frmQuizme;
private JTextField txtEmail;
private JTextField txtUsername_1;


/**
* Launch the application.
* @throws LineUnavailableException
* @throws IOException
* @throws UnsupportedAudioFileException
*/

public quizApp() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

initialize();
this.setLocationRelativeTo(null);
}
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
quizApp window = new quizApp();
window.frmQuizme.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});

}

/**
* Create the application.
*/




/**
* Initialize the contents of the frame.
* @throws IOException
* @throws UnsupportedAudioFileException
* @throws LineUnavailableException
*/
private void initialize() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	
	String file1 = "src/quizapp/audio/quizz.wav";
	music musi = new music();
	musi.playmusic(file1);

frmQuizme = new JFrame();
frmQuizme.setIconImage(Toolkit.getDefaultToolkit().getImage("src/quizapp/images/images-removebg-preview.png"));
frmQuizme.setTitle("QuizMe-App");
frmQuizme.setResizable(false);
frmQuizme.setBounds(100, 100, 648, 350);
frmQuizme.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frmQuizme.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setForeground(new Color(255, 255, 255));
panel.setBorder(new LineBorder(new Color(0, 0, 0), 9));
panel.setBackground(new Color(255, 255, 255));
panel.setBounds(0, 0, 644, 321);
frmQuizme.getContentPane().add(panel);
panel.setLayout(null);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(128, 128, 128));
panel_1.setBounds(0, 0, 328, 321);
panel.add(panel_1);

/*
JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ProBook\\Desktop\\critical_thinking_127px.png"));
lblNewLabel_2.setBounds(94, 47, 134, 189);
panel_1.add(lblNewLabel_2);
*/
panel_1.setLayout(null);

JLabel lblNewLabel_6 = new JLabel("");
lblNewLabel_6.setIcon(new ImageIcon("src/quizapp/images/quizz.jpg"));
lblNewLabel_6.setBounds(0, 0, 328, 321);
panel_1.add(lblNewLabel_6);



JPanel panel_2 = new JPanel();
panel_2.setBackground(Color.WHITE);
panel_2.setBounds(327, 0, 317, 321);
panel.add(panel_2);
panel_2.setLayout(null);


txtUsername_1 = new JTextField();
txtUsername_1.setForeground(new Color(0, 0, 0));
txtUsername_1.setBounds(53, 100, 195, 24);
txtUsername_1.setFont(new Font("Verdana Pro Cond Light", Font.BOLD, 11));
txtUsername_1.setBorder(null);
txtUsername_1.setBackground(Color.WHITE);
panel_2.add(txtUsername_1);
txtUsername_1.setColumns(10);

txtEmail = new JTextField();
txtEmail.setBounds(53, 155, 195, 24);
txtEmail.setFont(new Font("Verdana Pro Cond Light", Font.BOLD, 11));
txtEmail.setBackground(Color.WHITE);
txtEmail.setBorder(null);
panel_2.add(txtEmail);
txtEmail.setColumns(10);



JSeparator separator = new JSeparator();
separator.setBounds(53, 124, 195, 18);
separator.setForeground(new Color(0, 0, 0));
separator.setBackground(new Color(0, 0, 0));
panel_2.add(separator);

JSeparator separator_1 = new JSeparator();
separator_1.setBounds(53, 180, 195, 18);
separator_1.setForeground(Color.BLACK);
separator_1.setBackground(Color.BLACK);
panel_2.add(separator_1);




JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBounds(30, 96, 20, 20);
lblNewLabel.setIcon(new ImageIcon("src/quizapp/images/male_user__20px.png"));
panel_2.add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setIcon(new ImageIcon("src/quizapp/images/secured_letter_20px.png"));
lblNewLabel_1.setBounds(30, 153, 20, 20);
panel_2.add(lblNewLabel_1);

JLabel lblNewLabel_4 = new JLabel("E-mail");
lblNewLabel_4.setIcon(new ImageIcon("src/quizapp/images/secured_letter_20px.png"));
lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 11));
lblNewLabel_4.setBounds(53, 132, 76, 24);
panel_2.add(lblNewLabel_4);

JLabel lblNewLabel_5 = new JLabel("User name");
lblNewLabel_5.setIcon(new ImageIcon("src/quizapp/images/male_user__20px.png"));
lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 11));
lblNewLabel_5.setBounds(53, 80, 97, 24);
panel_2.add(lblNewLabel_5);

JLabel lblNewLabel_2 = new JLabel("");
lblNewLabel_2.setIcon(new ImageIcon("src/quizapp/images/button (35).png"));
lblNewLabel_2.setBounds(53, 240, 111, 44);
panel_2.add(lblNewLabel_2);
JLabel lblNewLabel_3 = new JLabel("");
lblNewLabel_3.setIcon(new ImageIcon("src/quizapp/images/button (36).png"));
lblNewLabel_3.setBounds(168, 233, 139, 58);
panel_2.add(lblNewLabel_3);
lblNewLabel_3.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
	if(((txtUsername_1.getText()).equals(""))||((txtEmail.getText()).equals(""))) {
		error.main(null);
		}
		else
		{
		dispose();
		thered.page2(null);
		frmQuizme.setVisible(false);
		}

}
});



lblNewLabel_2.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent arg0) {
System.exit(1);
}
});



}
}
