/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guieventdemo1;

/**
 * BackRow1 Group Java2 COP 2805
 * Janna Barry
 * @author Mario
 * Kyle McIntyre
 */ 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class GUIEventDemo1 extends JFrame {
  JTextArea ta  = new JTextArea();
  // Create Label Title
  JLabel  jlblTitle = new JLabel ("Search Engine", JLabel.CENTER);
  Font font = new Font("Courier", Font.BOLD, 22);
  //jlblTitle.setFont(font);
  // Create a text field for setting a new message
  private JTextField jtfMessage = new JTextField(10);
  //Create button to search
  JButton jbtSearch = new JButton("Search");
  
  public static void main(String[] args) {
    GUIEventDemo1 frame = new GUIEventDemo1();
    frame.pack();
    
    frame.setSize(750,700); 
    frame.setTitle("GUIEventDemo1");
    JTextArea ta= new JTextArea(800,800);
    ta.setBounds(0,20,800,800); 
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public GUIEventDemo1() { 	
    
    JPanel jpTextField = new JPanel();
    jpTextField.setLayout(new BorderLayout(5, 0));
    jpTextField.add(jlblTitle, BorderLayout.NORTH);
    jpTextField.add(
      new JLabel("Enter a Word to Search "), BorderLayout.WEST);
    jpTextField.add(jtfMessage, BorderLayout.CENTER);
    jpTextField.add(jbtSearch, BorderLayout.EAST);
    jtfMessage.setHorizontalAlignment(JTextField.LEFT);
    add(jpTextField, BorderLayout.NORTH);
    add(ta);
    
    //Register Listener for search button
    jbtSearch.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
       //Code here StringFinder
      int count = 0,  countBuffer =0, countLine = 0;
      
    String lineNumber = " ";
    String filePath = "C:\\COP2805_Java_HCC\\file1.txt";
    BufferedReader br ;
    String inputSearch =jtfMessage.getText();
    String line = "";
    
     try {
            br = new BufferedReader(new FileReader(filePath));
           
        try {
            while((line = br.readLine()) != null)
              
            {
                countLine++;
                //System.out.println(line);
                String[] words = line.split("[\\s+\\p{P}]");
                for (String word : words) {
                  if (word.equals(inputSearch)) {
                    count++;
                    countBuffer++;
                  }
                }

                if(countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine + "   ,";
                }

            }
            br.close();
     } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    } catch (FileNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
    
    
    ta.setText("Word  " + inputSearch  + "  found  :   " + count + "  times " + "  at  lines   " + lineNumber + "\n");
    
         

       // 
      }
      });
  } 
}
