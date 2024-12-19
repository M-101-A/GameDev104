
package com.finals.gameproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
Class for initiating Frame
Graphics
*/



public class GameFrame {
    JFrame mainFrame = new JFrame(); //instantiate Main Frame
    
    
    
    GameFrame() {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        gd.setFullScreenWindow(mainFrame); //FullScreen the FrameSize
        
        mainFrame.setLocationRelativeTo(null);
        
        
        
        mainFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) {
                    System.exit(0); // Optional
                }
            }
        });
        mainFrame.setVisible(true); //always at the bottom
    }
    
    
    
    
    
    // class for creating the Graphics for the HERO
}
