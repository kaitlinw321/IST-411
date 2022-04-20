/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networking2;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Kaitlin
 */
public class Networking2Frame extends JFrame {
    private JEditorPane jEditorPane;
    private JScrollPane jScrollPane;
    private JPanel mainPanel;
    private JButton jButton;
    private JTextField jTextField;
    
    
    
    public Networking2Frame(){
        setSize(700,700);

        
//text field

        jTextField = new JTextField(25);
        jTextField.setText("http://www.");
        jTextField.setEditable(true);
        jTextField.setPreferredSize(new Dimension(200,24));
        
        
//button

        jButton = new JButton("Display");
        ActionListener listener = new ChoiceListener();
        jButton.addActionListener(listener);
        

//EditorPane
        
        jEditorPane = new JEditorPane();
        jEditorPane.setEditable(false);
       
            
//ScrollPane
       
        jScrollPane = new JScrollPane(jEditorPane);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setPreferredSize(new Dimension(600, 400));
        jScrollPane.setMinimumSize(new Dimension(500, 300));
        
        

//mainPanel
        
        mainPanel = new JPanel();
        mainPanel.add(jScrollPane); 
        mainPanel.add(jTextField);
        mainPanel.add(jButton);
       
        
           
        add(mainPanel);
        
        }
    
    class ChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            createEditorPane();
        }
    }
        
        private JEditorPane createEditorPane(){
      
            String editText = jTextField.getText();
            
            
            try {
                jEditorPane.setPage(editText);
            } 
        
            catch (IOException e) {
            
                System.out.println("Attempted to read a bad URL");
            }
            
            return jEditorPane;
} 
        
}
    
    
    

