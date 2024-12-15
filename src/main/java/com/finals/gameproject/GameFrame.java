
package com.finals.gameproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
Class for initiating Frame
Graphics
*/

//LOOOOOOOOOOOOOOOOOOOOOLLLLL
//asda
//asdas

//adaad
//asda


public class GameFrame {
    JFrame frame = new JFrame(); //instantiate frame object
    
    GameFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        gd.setFullScreenWindow(frame); //FullScreen the FrameSize
        
        frame.setLocationRelativeTo(null);
        
        
        
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE) {
                    gd.setFullScreenWindow(null);
                    System.exit(0); // Optional
                }
            }
        });

        
        frame.setVisible(true); //always at the bottom
    }
    
    
    
    
    
    // class for creating the Graphics for the HERO
    public class MyHero extends JPanel {
        private Image Hero;

        public MyHero() {
            
        }
    }
}
