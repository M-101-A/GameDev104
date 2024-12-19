/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finals.gameproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainMenu extends JFrame implements ActionListener{
    JFrame mainMenu = new JFrame();  //Instantiate Main Menu Frame
    JButton Start = new JButton("Start");
    JButton Exit = new JButton("Exit");
    
    MainMenu() { //Main Menu Design
        mainMenu.setDefaultCloseOperation(mainMenu.EXIT_ON_CLOSE);
        mainMenu.setSize(400, 400);
        mainMenu.setResizable(false);
        mainMenu.setTitle("Game Project");
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        
        //Start Button design
        /*
        ImageIcon startIcon = new ImageIcon(""); // Image Name insert here for Start Button!
        Image startImg = startIcon.getImage(); // Convert to Image object
        Image startResized = startImg.getScaledInstance(200, 50, Image.SCALE_SMOOTH); // Resize to 200X50 pixels
        ImageIcon newStartIcon = new ImageIcon(startResized);
        */
        
        Start.setPreferredSize(new Dimension(200, 50));
        Start.setFont(new Font("Arial", Font.BOLD, 18));
        Start.setBackground(Color.blue);
        Start.setEnabled(true);
        Start.addActionListener(this);
        gbc.gridx = 0; // Column position
        gbc.gridy = 0; // Row position
        gbc.insets = new Insets(10, 10, 10, 10); // Padding
        //Start.setIcon(newStartIcon); // REMOVE SLASH TO ACTIVATE
                
        mainMenu.add(Start, gbc);
        
        //Exit Button design
        /*
        ImageIcon exitIcon = new ImageIcon(""); // Image Name insert here for Exit Button!
        Image exitImg = exitIcon.getImage(); // Convert to Image object
        Image exitResized = exitImg.getScaledInstance(200, 50, Image.SCALE_SMOOTH); // Resize to 200X50 pixels
        ImageIcon newExitIcon = new ImageIcon(exitResized);
        */

        Exit.setPreferredSize(new Dimension(200, 50));
        Exit.setFont(new Font("Arial", Font.BOLD, 18));
        Exit.setBackground(Color.red);
        Exit.setEnabled(true);
        Exit.addActionListener(this);
        gbc.gridx = 0; // Column position
        gbc.gridy = 2; // Row position
        gbc.insets = new Insets(10, 10, 10, 10); // Padding
        //Exit.setIcon(newExitIcon); // REMOVE SLASH TO ACTIVATE
        
        mainMenu.add(Exit, gbc);

        
        mainMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Start) {
            mainMenu.dispose();
            GameFrame gameFrame = new GameFrame();
        }
        
        if (e.getSource() == Exit) {
            try {
                JOptionPane.showMessageDialog(null,"Game Project","Program Closing...",JOptionPane.INFORMATION_MESSAGE);
                Thread.sleep(2000); // Delay for 2000 milliseconds (2 seconds)
                System.exit(0);
            } catch (InterruptedException d) {
                System.out.println("Interrupted!");
            }
        }
    }
}