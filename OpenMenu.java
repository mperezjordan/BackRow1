/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openmenu;

/**
 * BackRow1 Group Java COP 2805
 * Janna Barry
 * @author Mario Perez-Jordan
 * Kyle MCIntyre
 * Eric Pigott
 */
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
import java.io.*;  
import javax.swing.border.*;

  
public class OpenMenu extends JFrame implements ActionListener{  
JMenuBar mb;  
JMenu file;  
JMenuItem open;  
JTextArea ta; 

JLabel jlblMessage = new JLabel("Project 3 Java COP 2805", JLabel.CENTER);
JLabel  jlblTitle = new JLabel ("Search Engine", JLabel.CENTER);
JLabel jlblIndexOf = new JLabel("  Number of Files Indexed :                  ");
  // Create Button Search, Maintenance and About
 JButton jbtSearch = new JButton("Search");
 JButton jbtAbout = new JButton("About"); 
   // Create a text field for setting a new message
  JTextField jtfMessage = new JTextField(10);


  // Create three radio buttons to set message colors
  private JRadioButton jrbRed = new JRadioButton("All of the Search Terms");
  private JRadioButton jrbGreen = new JRadioButton("Any The Search terms");
  private JRadioButton jrbBlue = new JRadioButton("Exact Phrase");


OpenMenu(){  
// Create Center Label to BorderLayout to CENTER
jlblMessage.setBorder(new LineBorder(Color.BLACK, 2));
add(jlblMessage, BorderLayout.CENTER);   


// Create a new panel to hold check boxes to BorderLaout WEST
    JPanel jpRadioButtons = new JPanel();
    jpRadioButtons.setLayout(new GridLayout(3, 1));
    jpRadioButtons.add(jrbRed);
    jpRadioButtons.add(jrbGreen);
    jpRadioButtons.add(jrbBlue);
    add(jpRadioButtons, BorderLayout.WEST);

    // Create a radio-button group to group three buttons
    ButtonGroup group = new ButtonGroup();
    group.add(jrbRed);
    group.add(jrbGreen);
    group.add(jrbBlue);
    //group.add(jbtMaintenance);
    // Set initial message color to blue
    jrbBlue.setSelected(true);
    jlblMessage.setForeground(Color.blue);
	


    
    
open=new JMenuItem("Open File");  
open.addActionListener(this);  
          
file=new JMenu("File");  
file.add(open);  
          
mb=new JMenuBar();  
mb.setBounds(0,0,800,20);  
mb.add(file);  
          
ta=new JTextArea(800,800);  
ta.setBounds(0,20,800,800);  
          
add(mb);  
add(ta);  

JPanel jpTextField = new JPanel();
    jpTextField.setLayout(new BorderLayout(7, 5));
    jpTextField.add(jlblTitle, BorderLayout.NORTH);
	 //new  JLabel(" Search Engine ", JLabel.CENTER), BorderLayout.NORTH );
	Font font = new Font("Courier", Font.BOLD,48);
    jlblTitle.setFont(font);
    jpTextField.add(
      new JLabel("Search Items"), BorderLayout.WEST);
    jpTextField.add(jtfMessage, BorderLayout.CENTER);
    jpTextField.add(jbtSearch, BorderLayout.EAST);
    jtfMessage.setHorizontalAlignment(JTextField.RIGHT);
    add(jpTextField, BorderLayout.NORTH);
    
    //Create buttons and Textfields to BorderLayout SOUTH
	 JPanel jpanelSouth = new JPanel();
	 //jpanelSouth.add(jbtMaintenance, BorderLayout.WEST);
	 jpanelSouth.add(jlblIndexOf, BorderLayout.CENTER);
	 jpanelSouth.add(jbtAbout, BorderLayout.EAST);
     add(jpanelSouth, BorderLayout.SOUTH);


          
}  
public void actionPerformed(ActionEvent e) {  
if(e.getSource()==open){  
openFile();  
}  
}  
      
void openFile(){  
JFileChooser fc=new JFileChooser();  
int i=fc.showOpenDialog(this);  
          
if(i==JFileChooser.APPROVE_OPTION){  
File f=fc.getSelectedFile();  
String filepath=f.getPath();  
              
displayContent(filepath);  
              
}  
          
}  
  
void displayContent(String fpath){  
try{  
BufferedReader br=new BufferedReader(new FileReader(fpath));  
String s1="",s2="";  
              
while((s1=br.readLine())!=null){  
s2+=s1+"\n";  
}  
ta.setText(s2);  
br.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
  
public static void main(String[] args) {  
    OpenMenu om=new OpenMenu(); 
    om.pack();
    om.setSize(800,800);  
   // om.setLayout(null); 
    om.setTitle("Search Engine");
    om.setVisible(true);  
    om.setLocationRelativeTo(null); // Center the frame
    om.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // om.setDefaultCloseOperation(EXIT_ON_CLOSE);  
}  
}  