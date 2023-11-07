import greenfoot.*;  
import greenfoot.Greenfoot;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Actor

{
    private GreenfootImage creditsButton = new GreenfootImage("CreditsButton.png");
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        isOnTop();
        
    }
    public void credits()
    {
        //GreenfootImage creditsButton = new GreenfootImage("CreditsButton.png");
        creditsButton.scale(creditsButton.getWidth()/4,creditsButton.getHeight()/4);
        setImage(creditsButton);
    }
    public void isOnTop()
    {
        World world = getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int x =  getX();
        int y = getY();
        
        if(x < mouse.getX() && y < mouse.getY()){
            GreenfootImage creditsClicked = new GreenfootImage ("CreditsClicked.png");
            creditsButton.scale(creditsButton.getWidth()/4,creditsButton.getHeight()/4);
            setImage(creditsClicked);
        
        }    
    }
    
}
