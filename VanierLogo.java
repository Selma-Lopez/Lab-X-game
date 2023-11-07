import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VanierLogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VanierLogo extends Actor
{
    /**
     * Act - do whatever the VanierLogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void size(){
        GreenfootImage vanierLogo = new GreenfootImage ("VanierLogo.jpg");
        vanierLogo.scale(vanierLogo.getWidth()/3, vanierLogo.getHeight()/3);
        setImage(vanierLogo);
    }
}
