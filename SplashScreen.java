import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{

    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(512, 512, 1); 
        prepare();
        showNames("Manal Jkini \nAya Kharchafi \nSelma Lopez \nIclal Seyma Uyanik", 200, 400);
        courseName("Game Programming 1", 120, 100);
        act();
        
       
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        VanierLogo vanierLogo = new VanierLogo();
        addObject(vanierLogo,344,285);
        vanierLogo.size();
        vanierLogo.setLocation(256,267);
        
        
        
        
    }
    public void act(){
        long startTime = System.currentTimeMillis();
        long currentTime = System.currentTimeMillis();
        int durationMillis = (int)(currentTime - startTime);
        //int durationSecs = durationMillis / 1000;
        
        if (durationMillis == 3000){
            World menu = new Menu();
            Greenfoot.setWorld(menu);
        }
    }
    

    public void showNames(String names, int x, int y){
        GreenfootImage bg = getBackground();
        Font font = new Font(18);
        
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(names, x, y);
    }
    public void courseName(String course, int x, int y){
        GreenfootImage bg = getBackground();
        Font font = new Font(30);
        
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(course, x, y);
    }
   
}
