/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networking1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kaitlin
 */
public class NetworkingFrame extends JFrame {
    private JFrame frame;
    private JPanel hostPanel;
    private JPanel IPPanel;
    private JLabel hostLabel;
    private JLabel IPLabel;
    private JTextField hostText;
    private JTextField IPText;
    private JButton hostButton;
    private JButton IPButton;
    private JPanel panel;
        
        
    public NetworkingFrame(){
        setSize(500,500);

        //Labels
        hostPanel = new JPanel();
        IPPanel = new JPanel();
        hostLabel = new JLabel("Enter Host Name");
        IPLabel = new JLabel("Enter IP Address");
        
        hostPanel.add(hostLabel);
        IPPanel.add(IPLabel);
        
        
        hostPanel.setPreferredSize(new Dimension(300,300));
        IPPanel.setPreferredSize(new Dimension(300,300));
        
        //textfields
        hostText = new JTextField(25);
        IPText = new JTextField(25);
        hostText.setPreferredSize(new Dimension(200,24));
        IPText.setPreferredSize(new Dimension(200,24));
        
        
        hostText.setEditable(true);
        IPText.setEditable(true);
        
        hostPanel.add(hostText);
        IPPanel.add(IPText);
        
        //Buttons
        hostButton = new JButton("Convert");
        ActionListener listener = new ChoiceListener();
        hostButton.addActionListener(listener);
        
        IPButton = new JButton("Convert");
        ActionListener listener2 = new ChoiceListener2();
        IPButton.addActionListener(listener2);
        
        
        hostPanel.add(hostButton);
        IPPanel.add(IPButton);
        
        
        //Panel
        panel = new JPanel();
        panel.add(hostPanel);
        panel.add(IPPanel);
     
        
        add(panel);
        
    }
    
    class ChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getIP();
        }
    }
    
    class ChoiceListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getHost();
        }
    }
    
    public void getIP() {
        try {
            String gethostNameText = hostText.getText();
            InetAddress hostName = InetAddress.getByName(gethostNameText);
            hostText.setText(hostName.getHostAddress());
            
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(NetworkingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getHost(){
        try {
            String getIPText = IPText.getText();
            InetAddress getIPaddress = InetAddress.getByName(getIPText);
            IPText.setText(getIPaddress.getHostName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(NetworkingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

    
