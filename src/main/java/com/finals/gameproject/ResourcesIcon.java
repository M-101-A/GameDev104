
package com.finals.gameproject;

/*
* class for resources such as images, icons, LOGO!
*/

import java.awt.Image;
import javax.swing.ImageIcon;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


class ResourcesIcon {
    //MAIN MENU SETTUP
    private static final ImageIcon LOGO = new ImageIcon("C:\\ICT104\\GameDevFinals104\\GameDev104\\GameDev104\\src\\main\\java\\Files\\Icon.png");
    private static final ImageIcon STARTBUTTON = new ImageIcon("C:\\ICT104\\GameDevFinals104\\GameDev104\\GameDev104\\src\\main\\java\\Files\\startBtn.png");
    private static final ImageIcon QuitBUTTON = new ImageIcon("");
    private static final ImageIcon MainMenu = new ImageIcon("C:\\ICT104\\GameDevFinals104\\GameDev104\\GameDev104\\src\\main\\java\\Files\\menuBG.png");
    
    //MAIN FRAME SETTUP
    private static final ImageIcon MainFrame = new ImageIcon("C:\\ICT104\\GameDevFinals104\\GameDev104\\GameDev104\\src\\main\\java\\Files\\");
    //private static final ImageIcon MainMenu = new ImageIcon("C:\\ICT104\\GameDevFinals104\\GameDev104\\GameDev104\\src\\main\\java\\Files\\menuBG.png");

    //AUDIO SETTUP
    private static String filePath = "src\\A Caring Friend.wav";
    private static File file = new File(filePath); //Insert Audio File Path here
    
    public static ImageIcon getLogoIcon() {
        return LOGO;
    }
    
    public static ImageIcon getStartButton() {
        return STARTBUTTON; //return file path
    }
    
    public static ImageIcon getQuitButton() {
        return QuitBUTTON; //return file path
    }
    
    public static ImageIcon getMainMenuBG() {
        return MainMenu; //return file path
    }
    
    
    /* AUDIO FUNCTIONS
    audiofile.start();
    audiofile.stop();
    audiofile.setMicrosecondPosition(0);
    clip.close();
    
    ================
    
    FILE CATCHER WHEN ITS ABOUT TO MAKE A RUN 
    catch(LineUnavailableException e){
        System.out.println("Unable to access audio resource");
    }
    */
    
    
    // .wav FILE ONLY!
    public static AudioInputStream backGroundMusic() {
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            return audioStream;
            //Clip clip = AudioSystem.getClip();
            //clip.open(audioStream);
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        return null;
    }
    
    
    
    
}
