

package com.finals.gameproject;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.TimerTask;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


public class MainMenu extends JFrame implements ActionListener{
    JFrame mainMenu = new JFrame();  //Instantiate Main Menu Frame
    JButton Start = new JButton("Start");
    JButton Quit = new JButton("Quit");
    
    MainMenu() { //Main Menu Design
        mainMenu.setDefaultCloseOperation(mainMenu.EXIT_ON_CLOSE);
        Image logo = ResourcesIcon.getLogoIcon().getImage();
        mainMenu.setIconImage(logo);
        mainMenu.setSize(400, 400);
        mainMenu.setResizable(false);
        mainMenu.setTitle("Game Project");
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setLayout(new GridBagLayout());
        
        ImageIcon menuBG = new ImageIcon(ResourcesIcon.getMainMenuBG().getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
        JLabel menuBGLabel = new JLabel(menuBG);
        mainMenu.setContentPane(menuBGLabel);
        
        //Start Button design
        ImageIcon startIcon = new ImageIcon(ResourcesIcon.getStartButton().getImage().getScaledInstance(220, 60, Image.SCALE_SMOOTH));     //instance of Button ImageIcon Object
        Start.setIcon(startIcon);
        Start.setBounds(20, 175, 200, 50);
        Start.setBackground(Color.black);
        Start.setEnabled(true);
        Start.addActionListener(this);
        mainMenu.add(Start, SwingConstants.CENTER);
        
        //Quit Button design
        ImageIcon quitIcon = new ImageIcon(ResourcesIcon.getQuitButton().getImage().getScaledInstance(220, 60, Image.SCALE_SMOOTH));     // Resize to 200X50 pixels
        Quit.setBounds(30, 235, 180, 40);
        Quit.setFont(new Font("Arial", Font.BOLD, 18)); //removable
        Quit.setBackground(Color.red); //removable
        Quit.setEnabled(true);
        Quit.addActionListener(this);
        //Quit.setIcon(quitIcon); // REMOVE SLASH TO ACTIVATE
        mainMenu.add(Quit);
        
        mainMenu.setVisible(true);    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Start) {
            mainMenu.dispose();
            Game gameFrame = new Game();
        }
        
        if (e.getSource() == Quit) {
            mainMenu.dispose();
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    JDialog closing = new JDialog();
                    closing.setSize(200, 150);
                    Image logo = ResourcesIcon.getLogoIcon().getImage();
                    closing.setIconImage(logo);
                    closing.setModal(true);
                    closing.setTitle("Game Project");
                    closing.setLocationRelativeTo(null);
                    
                    //BG
                    ImageIcon BGImg = new ImageIcon(ResourcesIcon.getMainMenuBG().getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH));
                    JLabel BGLabel = new JLabel(BGImg);
                    BGLabel.setLayout(new BorderLayout());
                    //Meesage
                    JLabel message = new JLabel("       Good bye...", SwingConstants.LEFT);
                    message.setFont(new Font("Arial", Font.BOLD, 12));
                    message.setForeground(Color.BLACK);
                    //Insert BG, IMG
                    BGLabel.add(message, BorderLayout.CENTER);
                    closing.setContentPane(BGLabel);
                    
                    // Timer to close the closing
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            closing.dispose(); // Close the closing
                            System.exit(0);
                        }}, 2000); // 2000 milliseconds = 2 seconds
                    closing.setVisible(true);
                }
            });
        }
    }
}