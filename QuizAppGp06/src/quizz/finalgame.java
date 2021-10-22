/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class finalgame extends JComponent implements ActionListener {String[] questions = 	{
        "(System.out.println) de quel langage ?",         
        "  le nombre binaire 1001 vaut en héxadécimal:",
        "  l'addition de 0011+1001 en binaire donne ?",
        "   Lequel parmi les choix n'est pas OOP ?",
        "  Quel est l'ancètre d'internet ?",
        " nom de protocol de sécurisé utilisé sur internet",
        "  quel protocole est dit sécurisé  parmis :",
        "   qu'appelle t-on la RAM ?",
        "   lequel n'est pas un périphirique d'enter ?",
        "  a quoi est égale 1 octet ? ",
        "  quel est le plus grand réseaux ?"
        
		};
String[][] options = 	{
		{"  java","  c++","  c","  HTML"}, 
		{"  F3","  9","  1A","  F4"},
		{"  1100","0111001","  1110","  0111"},
     {"  java","C","python","C++"},
     {"  MouliNet","  Ranater","  Arpanet","  MINITEL "},
     {"  HTTP","  HTTPS","  SMTP","  SHTP",},
     {"  POP","  Telnet","  SSL","  SHTP"},
     {" mémoire morte"," mémoire vivre"," mémoire cache"," mémoire vidéo"},
     {"  clavier","  joystick","  microphone","  ecran"},
     {"  8 bytes","  8 bits","  16 bits","  16 bytes"},
     {"  WAN","  PAN","  LAN","   CAN"}
     
		};
char[] answers = 		{	
		'A',
		'B',
		'A',
		'B',
		 'C',
		 'B',
		 'C',
		 'A',
		 'D',
		 'B',
		 'A'
		 
		
		
		
    
     
		};
char guess;
char answer;
int index;
int correct_guesses =0;
int total_questions = questions.length;
int result;
int seconds=20;


static JFrame frame = new JFrame("Quizz Land");
static JFrame sos = new JFrame("Quizz Land");
JTextField textfield = new JTextField();
JTextArea  text = new JTextArea();
JLabel tex= new JLabel();
JButton A = new JButton( );
JButton B  = new JButton();
JButton C = new JButton();
JButton D= new JButton();
JTextField a = new JTextField();
JTextField b = new JTextField();
JTextField c = new JTextField();
JTextField d = new JTextField();
JLabel time = new JLabel();
JLabel seconds_left = new JLabel();
JLabel ph = new JLabel();
JLabel nbr = new JLabel();
JLabel percentage = new JLabel();
JLabel fin = new JLabel();
JLabel score = new JLabel();
JLabel question = new JLabel();



	



Timer timer = new Timer(1000, new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
seconds--;
seconds_left.setText(String.valueOf(seconds));
if(seconds<=0) {
displayAnswer();
}
}
});

public static void main(String[] args) {
	
	finalgame fin= new finalgame();
}
public finalgame(){
	JFrame s =new JFrame("Quizz Land");
	s.setSize(700, 700);
	 s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 s.setLocationRelativeTo(null);
  s.setLayout(null);
  
  
  
  JFrame y1=new JFrame("Quizz Land");
	y1.setSize(700, 700);
	y1.setBackground(new Color(204,153,255));
	 y1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 y1.setLocationRelativeTo(null);
	 y1.getContentPane().setBackground( new Color(102,102,255));
   y1.setLayout(null);
   
   
  
 
     
      
  JLabel p= new JLabel();
  p.setIcon(new ImageIcon("src/quizz/ssr.jpg"));
  p.setBounds(0,0,700,700);
  
  JLabel o= new JLabel();
  o.setIcon(new ImageIcon("src/quizz/icon.gif"));
 o.setBounds(50, 5,700,700);
  
  
  JLabel OOP= new JLabel();
  OOP.setIcon(new ImageIcon("src/quizz/photo.gif"));
  OOP.setBounds(0,0,700,700);
  
  

 
  

  JTextField firstname = new JTextField(10);
  JTextField lastname = new JTextField(10);	 
  JLabel ss=new JLabel("  Profitez avec Quizz Land");
  JLabel titre = new JLabel(" Inscription :");
  JLabel name=new JLabel("Prénom : ");
  JLabel sname=new JLabel("Nom de Famille : ");
  JLabel pass = new JLabel("Mot de passe  :");
  JPasswordField password=new JPasswordField(8);         
  JButton play = new  JButton("jouer");       
  JProgressBar pb= new JProgressBar(0,1000);
 
  
  
     
     
     FocusListener f1 = new FocusListener() {
     	 
         @Override
         public void focusGained(FocusEvent e) {
       
             e.getComponent().setBackground(Color.yellow);
         }

         @Override
         public void focusLost(FocusEvent e) {
             
             e.getComponent().setBackground(Color.white);
         }

     };
     
     firstname.addFocusListener(f1);                    
     lastname.addFocusListener(f1);  
     
	     password.addFocusListener(f1);                    
	        play.addFocusListener(f1);  
     
     
      
 
     ss.setBounds(170,0,500,200);
     titre.setBounds(230,15,300,300);
     name.setBounds(230,180, 200, 40);
     firstname.setBounds(230,215,170,20);
     sname.setBounds(230,240, 200, 40);
     lastname.setBounds(230,275,170,20);
     pass.setBounds(230, 165, 200,300);
     password.setBounds(230, 330,170, 20);
     play.setBounds(290, 400, 100, 40);	     
      
      
      
    ss.setFont(new Font("serif",Font.ITALIC,30));
    ss.setForeground(Color.black);
    name.setForeground(Color.black);
    sname.setForeground(Color.black);
    pass.setForeground(Color.black);
   /* S.setForeground(Color.white);*/
    titre.setFont(new Font("serif",Font.ITALIC,25));
    titre.setForeground(Color.black);
    name.setFont(new Font("serif",Font.ITALIC,25));
    firstname.setBackground(Color.white);
    sname.setFont(new Font("serif",Font.ITALIC,25));
    lastname.setBackground(Color.white);
    pass.setFont(new Font("serif",Font.ITALIC,25));
    password.setBackground(Color.white);
    play.setBackground(Color.white);
    play.setFont(new Font("serif",Font.ITALIC,25));
   
   
    
    

      pb.setStringPainted(true);
      pb.setBounds(150,600, 350, 40);
      pb.setString("Loading..."); 
      pb.setBackground(new Color(232,99,196));
      
     play.addActionListener(new ActionListener(){
     	
    
	        	 
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e){

		        if(firstname.getText().isEmpty()
		        		||lastname.getText().isEmpty()||password.getText().isEmpty()){
		        	JOptionPane.showMessageDialog(null, "PLEAS ENTER YOUR INFORMATIONS"
		        			, "Error Message", JOptionPane.ERROR_MESSAGE);
		        }else{
		        	
		        	
     		play.setBackground(Color.yellow);
     		y1.setVisible(true);
     		 

		        }	
     }
     });
           
     
     
     
     JLabel x2=new JLabel("Bienvennue,sur Quizz Land préparez vous ");
     JLabel x3=new JLabel("faire une partie ^^");
      x2.setFont(new Font("serif",Font.ITALIC,25));
      x2.setForeground(Color.white);
      x2.setBounds(80, 10, 550, 60);
      
      x3.setFont(new Font("serif",Font.ITALIC,25));
      x3.setBounds(200,150,600,200);
     

      
	   	 
	        	   
 

 s.add(ss); 
 s.add(titre);
 s.add(name); 
 s.add(firstname);
 s.add(sname);
 s.add(lastname);
 s.add(pass);
 s.add(password);
 s.add(play);
 s.add(p);
  
  
  s.setVisible(true);	
 
  
 
  y1.add(pb);
  y1.add(o);
  y1.add(x2);
  y1.add(x3);
 
  
  
  
int cue=pb.getValue();
  while(cue<pb.getMaximum())
  {
	  try{Thread.sleep(100);}
	  catch(Exception e){}
	  cue +=4;
	  pb.setValue(cue);
  } 
  if(cue==1000)
  {
 	 frame.setVisible(true);
 	 }
  
  
  

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(700,700);
	frame.getContentPane().setBackground(new Color(50,50,50));
	frame.setLayout(null);
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	
	

	sos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	sos.setSize(700,700);
sos.getContentPane().setBackground(new Color(50,50,50));
	sos.setLayout(null);
	sos.setLocationRelativeTo(null);
	sos.setResizable(false);
	
	
	
	
	
	
	
	



	textfield.setBounds(230,598,320,40);
	textfield.setBackground(new Color(255,255,255));
	textfield.setForeground( Color.black);
	textfield.setFont(new Font("serif",Font.ITALIC,25));
	textfield.setBorder(BorderFactory.createBevelBorder(1));
	textfield.setEditable(false);

	text.setBounds(108,97,498,35);
	text.setBackground(new Color(255,255,255));
	text.setForeground(Color.black);
	text.setFont(new Font("serif",Font.ITALIC,25));
	text.setEditable(false);
	
	
	



	A.setBounds(140,250,45,45);
	A.setFont(new Font("MV Boli",Font.BOLD,15));
	A.setBackground(new Color(255,255,255));
	A.setFocusable(false);
	A.addActionListener(this);
	A.setText("A");

	B.setBounds(138,330,45,45);
	B.setFont(new Font("MV Boli",Font.BOLD,15));
	B.setBackground(new Color(255,255,255));
	B.setFocusable(false);
	B.addActionListener(this);
	B.setText("B");

	C.setBounds(138,427,45,45);
	C.setFont(new Font("MV Boli",Font.BOLD,15));
	C.setBackground(new Color(255,255,255));
	C.setFocusable(false);
	C.addActionListener(this);
	C.setText("C");

	D.setBounds(138,517,45,45);
	D.setFont(new Font("MV Boli",Font.BOLD,15));
	D.setFocusable(false);
	D.setBackground(new Color(255,255,255));
	D.addActionListener(this);
	D.setText("D");

	a.setBounds(240,250,300,40);
	a.setBackground(Color.white);
	a.setForeground(Color.black);
	a.setFont(new Font("Serif",Font.ITALIC,25));
	a.setEditable(false);

	b.setBounds(240,335,300,40);
	b.setBackground(Color.white);
	b.setForeground( Color.black);
	b.setFont(new Font("Serif",Font.ITALIC,25));
	b.setEditable(false);

	c.setBounds(240,425,300,40);
	c.setBackground(Color.white);
	c.setForeground( Color.black);
	c.setFont(new Font("Serif",Font.ITALIC,25));
	c.setEditable(false);

	d.setBounds(240,515,300,40);
	d.setBackground(Color.white);
	d.setForeground( Color.black);
	d.setFont(new Font("Serif",Font.ITALIC,25));
	d.setEditable(false);


	seconds_left.setBounds(310,10,50,50);
	/*seconds_left.setBackground( Color.white);*/
	seconds_left.setForeground(new Color(255,0,0));
	seconds_left.setFont(new Font("Ink Free",Font.BOLD,30));
	seconds_left.setBorder(BorderFactory.createBevelBorder(1));
	seconds_left.setOpaque(true);
	seconds_left.setHorizontalAlignment(JTextField.CENTER);
	seconds_left.setText(String.valueOf(seconds));

	nbr.setBounds(350,260,250,100);
	nbr.setForeground(Color.white);
	nbr.setFont(new Font("Serif",Font.ITALIC,30));


	percentage.setBounds(370,360,250,100);
	percentage.setForeground(Color.white);
	percentage.setFont(new Font("Serif",Font.ITALIC,30));
	
	
	
	


	  


	
	frame.add(seconds_left);
	
	frame.add(a);
	frame.add(b);
	frame.add(c);
	frame.add(d);
	frame.add(A);
	frame.add(B);
	frame.add(C);
	frame.add(D);
	frame.add(text);
	
	frame.add(textfield);
	frame.add(OOP);
   


	frame.add(tex);





	nextQuestion();
	}
	public void nextQuestion() {

	if(index>=total_questions) {
	results();
	}
	else {
	textfield.setText("   Numéro de Questions:"+(index+1)+"/11");
	text.setText(questions[index]);
	a.setText(options[index][0]);
	b.setText(options[index][1]);
	c.setText(options[index][2]);
	d.setText(options[index][3]);
	timer.start();
	}
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	A.setEnabled(false);
	B.setEnabled(false);
	C.setEnabled(false);
	D.setEnabled(false);

	if(e.getSource()==A) {
	answer= 'A';
	if(answer == answers[index]) {
	correct_guesses++;
	}
	}
	if(e.getSource()==B) {
	answer= 'B';
	if(answer == answers[index]) {
	correct_guesses++;
	}
	}
	if(e.getSource()==C) {
	answer= 'C';
	if(answer == answers[index]) {
	correct_guesses++;
	}
	}
	if(e.getSource()==D) {
	answer= 'D';
	if(answer == answers[index]) {
	correct_guesses++;
	}
	}
	displayAnswer();
	}
	public void displayAnswer() {

	timer.stop();

	A.setEnabled(false);
	B.setEnabled(false);
	C.setEnabled(false);
	D.setEnabled(false);

	if(answers[index] != 'A'){
	a.setForeground(Color.red);

	}
	if(answers[index] != 'B')
	b.setForeground(Color.red);
	if(answers[index] != 'C')
	c.setForeground(Color.red);
	if(answers[index] != 'D')
	d.setForeground(Color.red);

	Timer pause = new Timer(2000, new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {

	a.setForeground(Color.green);
	b.setForeground(Color.green);
	c.setForeground(Color.green);
	d.setForeground(Color.green);

	answer = ' ';
	seconds=20;
	seconds_left.setText(String.valueOf(seconds));
	A.setEnabled(true);
	B.setEnabled(true);
	C.setEnabled(true);
	D.setEnabled(true);
	index++;
	nextQuestion();
	}
	});
	pause.setRepeats(false);
	pause.start();
	}
	public void results(){

	A.setEnabled(false);
	B.setEnabled(false);
	C.setEnabled(false);
	D.setEnabled(false);

	result = (int)((correct_guesses/(double)total_questions)*100);

	textfield.setText("RESULTS!");
	text.setText("");
	a.setText("");
	b.setText("");
	c.setText("");
	d.setText("");

	nbr.setText("("+correct_guesses+"/"+total_questions+")");
	
	
	if(result==100)
		fin.setText(" Félicitation à vous ");
	else
		if(result<40)
			fin.setText("Essayez de jouer une autre fois");
		else
			fin.setText("Excellente");
	
	
	percentage.setText(result+"%");
	
	fin.setBounds(138, 120, 500, 50);
	fin.setForeground(Color.white);
	fin.setFont(new Font("Serif",Font.ITALIC,30));
	

	score.setText("votre score:" );
	score.setBounds(150,250,250,50);
	score.setForeground(Color.white);
	score.setFont(new Font("Serif",Font.ITALIC,30));
	
	question.setText("votre réponces  : ");
	question.setBounds(150,350,250,50);
	question.setForeground(Color.white);
	question.setFont(new Font("Serif",Font.ITALIC,30));
	
	JLabel fr= new JLabel();
 fr.setIcon(new ImageIcon("src/quizz/img.gif"));
fr.setBounds(0,0,700,700);
	sos.add(fin);
	sos.add(score);
	sos.add(percentage);
	sos.add(question);
	sos.add(nbr);
	sos.add(fr);

			
	
	

	
	if(questions.length==11)
		
		sos.setVisible(true);

  
 
 
  
  
  
	
}

}


