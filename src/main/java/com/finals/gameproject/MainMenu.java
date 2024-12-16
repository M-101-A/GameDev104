/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finals.gameproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainMenu implements ActionListener{
    JFrame mainMenu = new JFrame();  //Instantiate Main Menu Frame
    JButton Start = new JButton();
    JButton Exit = new JButton();
    
    MainMenu() { //Main Menu Design
        mainMenu.setDefaultCloseOperation(mainMenu.EXIT_ON_CLOSE);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setSize(500, 500);
        mainMenu.setFocusable(false);
        mainMenu.setResizable(false);
        mainMenu.setTitle("Game Project");
        
        //Start Button design
        Start.setSize(100, 30);
        Start.setFont(new Font("Arial", Font.BOLD, 18));
        Start.setEnabled(true);
        Start.addActionListener(this);
        mainMenu.add(Start);
        
        //Exit Button design
        Exit.setSize(100, 30);
        Exit.setFont(new Font("Arial", Font.BOLD, 18));
        Exit.setEnabled(true);
        Exit.addActionListener(this);
        mainMenu.add(Exit);

        
        mainMenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Start) {
            mainMenu.dispose();
            GameFrame gameFrame = new GameFrame();
        }
        
        if (e.getSource() == Exit) {
            mainMenu.setDefaultCloseOperation(mainMenu.EXIT_ON_CLOSE);
        }
    }
}