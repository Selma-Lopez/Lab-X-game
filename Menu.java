import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(512, 512, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,256,258);
        playButton.playButton();
        playButton.setLocation(256,305);
        Credits credits = new Credits();
        addObject(credits,256,184);
        credits.credits();
        credits.setLocation(256,400);
        Logo logo = new Logo();
        addObject(logo,263,153);
        logo.sizeLogo();
    }
}
