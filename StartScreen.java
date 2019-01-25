import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * StartScreen sets up a world that tells the player how to start the game and it adds a controls button in the bottom right
 * 
 * @author (Aric Johnson) 
 * @version (Jan 24, 2019)
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
    
    /**
     * Act - do whatever StartScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        buttonClicked();
        gameStart();
    }
    
    /**
     * initializeStartScreen sets up the start screen 
     * by setting the background color to black and 
     * pasting text as well as putting a button in the 
     * bottom right
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void initializeStartScreen()
    {
        GreenfootImage startScreen = new GreenfootImage("StartScreen3.png");
        startScreen.scale(300, 300);
        getBackground().setColor(Color.BLACK); 
        getBackground().fillRect (0, 0, getWidth(), getHeight());
        showText("Press 'Space' to Start", getWidth()/2, 400);
        showText("Player1 = X", 150, 450);
        showText("Player2 = O", 150, 500);
        showText("Controls", 460, 590);
        getBackground().drawImage(startScreen, 25, 50);
    }
    
    /**
     * gameStart checks if the space bar has been 
     * pressed, if it has then the world is set to 
     * PlayField
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void gameStart()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld (new PlayerOneTurn(new PlayField()));
        }
    }
    
    /**
     * checkButtonClicked checks if the controls 
     * button in the bottom right of the start screen
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void buttonClicked()
    {
        MouseInfo mouseLocation = Greenfoot.getMouseInfo();
        
        if( Greenfoot.mouseClicked(this))
        {
            if (mouseLocation.getX() > 400 && mouseLocation.getX() < 500 && mouseLocation.getY() > 550 && mouseLocation.getY() < 600)
            {
                Greenfoot.setWorld (new Controls());
            }
        }
    }
}
