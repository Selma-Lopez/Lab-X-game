import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Girl extends Actor
{
    /**
     * Act - do whatever the Girl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        size();
        move();
    }
    public void size()
    {
        GreenfootImage girl = new GreenfootImage("GirlCharacter.PNG");
        girl.scale(80,80);
        setImage(girl);
    }
    public void move()
    {
        if( Greenfoot.isKeyDown("d") ){
            move(5);
        }
        if( Greenfoot.isKeyDown("a") ){
            move(-5);
        }
        if( Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("space")
        {
            
        }
    }
}
