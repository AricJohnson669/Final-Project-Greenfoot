import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 500x600 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        initializeStartScreen();
    }
    
    public void act()
    {
        checkNameChange();
        
        gameStart();
    }
    
    private void initializeStartScreen()
    {
        GreenfootImage startScreen = new GreenfootImage("StartScreen3.png");
        startScreen.scale(300, 300);
        getBackground().setColor(Color.BLACK); 
        getBackground().fillRect (0, 0, getWidth(), getHeight());
        //showText("Player1 Name", 400, 100);
        //showText("Player2 Name", 400, 150);
        showText("Press 'Space' to Start", getWidth()/2, 400);
        showText("Player1 = X", 150, 450);
        showText("Player2 = O", 150, 500);
        showText("Controls", 460, 590);
        getBackground().drawImage(startScreen, 25, 50);
    }
    
    private void gameStart()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld (new PlayerOneTurn(new PlayField()));
        }
    }
    
    private void checkNameChange()
    {
        MouseInfo mouseLocation = Greenfoot.getMouseInfo();
        
        if( Greenfoot.mouseClicked(this))
        {
            /**
                if( mouseLocation.getX() > 250 && mouseLocation.getX() < 550 && mouseLocation.getY() > 85 && mouseLocation.getY() < 115)
                {
                    JOptionPane.showInputDialog( "Please enter your name, Player One:", null );
                }
                
                if( mouseLocation.getX() > 250 && mouseLocation.getX() < 550 && mouseLocation.getY() > 135 && mouseLocation.getY() < 165)
                {
                    JOptionPane.showInputDialog( "Please enter your name, Player Two:", null );
                }
            */
            
            if (mouseLocation.getX() > 400 && mouseLocation.getX() < 500 && mouseLocation.getY() > 550 && mouseLocation.getY() < 600)
            {
                Greenfoot.setWorld (new Controls());
            }
        }
        
    }
}
