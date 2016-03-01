/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj3uia;

/**
 * BackRow1 Group Java COP 2805
 * Janna Barry
 * @author Mario Perez-Jordan
 * Kyle MCIntyre
 * Eric Pigott
 */
//package BackRow1 Group;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Proj3UIA extends JFrame {
  private JLabel jlblMessage = new JLabel("Project 3 Java COP 2805", JLabel.CENTER);
  private JLabel  jlblTitle = new JLabel ("Search Engine", JLabel.CENTER);
  private JLabel jlblIndexOf = new JLabel("  Number of Files Indexed :                     ");
  
  
  // Create check boxes to set the font for the message
  private JCheckBox jchkBold = new JCheckBox("Bold");
  private JCheckBox jchkItalic = new JCheckBox("Italic");
  
  // Create three radio buttons to set message colors
  private JRadioButton jrbRed = new JRadioButton("All of the Search Terms");
  private JRadioButton jrbGreen = new JRadioButton("Any The Search terms");
  private JRadioButton jrbBlue = new JRadioButton("Exact Phrase");
  
  // Create a text field for setting a new message
  private JTextField jtfMessage = new JTextField(10);

 // Create Button Search, Maintenance and About
  private JButton jbtSearch = new JButton("Search");
  private JButton jbtMaintenance = new JButton("Maintenance ");
  private JButton jbtAbout = new JButton("About"); 

  public static void main(String[] args) {
    Proj3UIA frame = new Proj3UIA();
    frame.pack();
    frame.setSize(600,400);
    frame.setTitle("Search Engine");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public Proj3UIA() { 	
    // Create Center Label to BorderLayout to CENTER
    jlblMessage.setBorder(new LineBorder(Color.BLACK, 2));
    add(jlblMessage, BorderLayout.CENTER);
	
       
    // Create a new panel to hold check boxes BORDER LAYOUT EAST
    JPanel jpCheckBoxes = new JPanel();
    jpCheckBoxes.setLayout(new GridLayout(2, 1));
    jpCheckBoxes.add(jchkBold);
    jpCheckBoxes.add(jchkItalic);    
    add(jpCheckBoxes, BorderLayout.EAST);
  	
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
    group.add(jbtMaintenance);
    // Set initial message color to blue
    jrbBlue.setSelected(true);
    jlblMessage.setForeground(Color.blue);
	
	
    // Create a new panel to hold label, text field and button to Border Layout NORTH
    JPanel jpTextField = new JPanel();
    jpTextField.setLayout(new BorderLayout(7, 5));
    jpTextField.add(jlblTitle, BorderLayout.NORTH);
	 //new  JLabel(" Search Engine ", JLabel.CENTER), BorderLayout.NORTH );
	Font font = new Font("Courier", Font.BOLD,24);
    jlblTitle.setFont(font);
    jpTextField.add(
      new JLabel("Search Items"), BorderLayout.WEST);
    jpTextField.add(jtfMessage, BorderLayout.CENTER);
    jpTextField.add(jbtSearch, BorderLayout.EAST);
    jtfMessage.setHorizontalAlignment(JTextField.RIGHT);
    add(jpTextField, BorderLayout.NORTH);
	
    //Create buttons and Textfields to BorderLayout SOUTH
	 JPanel jpanelSouth = new JPanel();
	 jpanelSouth.add(jbtMaintenance, BorderLayout.WEST);
	 jpanelSouth.add(jlblIndexOf, BorderLayout.CENTER);
	 jpanelSouth.add(jbtAbout, BorderLayout.EAST);
     add(jpanelSouth, BorderLayout.SOUTH);
    
	
	
	
	
	// Set mnemonic keys for check boxes and radio buttons
    jchkBold.setMnemonic('B');
    jchkItalic.setMnemonic('I');
    jrbRed.setMnemonic('A');
    jrbGreen.setMnemonic('y');
    jrbBlue.setMnemonic('P');
    
    // Register listeners with check boxes
    jchkBold.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setNewFont();
      }
    });
    jchkItalic.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setNewFont();
      }
    });
    
    // Register listeners for radio buttons
    jrbRed.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      	jlblMessage.setForeground(Color.red);
      }
    });
    jrbGreen.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      	jlblMessage.setForeground(Color.green);
      }
    });
    jrbBlue.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jlblMessage.setForeground(Color.blue);
      }
    });
    
    // Register listener for text field
    jtfMessage.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jlblMessage.setText(jtfMessage.getText());
        jtfMessage.requestFocusInWindow();
      }
    });
  }
  
  private void setNewFont() {
    // Determine a font style
    int fontStyle = Font.PLAIN;
    fontStyle += (jchkBold.isSelected() ? Font.BOLD : Font.PLAIN);
    fontStyle += (jchkItalic.isSelected() ? Font.ITALIC : Font.PLAIN);

    // Set font for the message
    Font font = jlblMessage.getFont();
    jlblMessage.setFont(
      new Font(font.getName(), fontStyle, font.getSize()));
  }
}