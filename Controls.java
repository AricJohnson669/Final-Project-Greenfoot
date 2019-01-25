import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Controls sets up a controls menu and a button to go back to the StartScreen
 * 
 * @author (Aric Johnson) 
 * @version (Jan 24, 2019)
 */
public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        initializeControls();
    }
    
    /**
     * Act - do whatever Controls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkScreenSwitch();
    }
    
    /**
     * initializeControls sets up the design for the controls menu by adding 
     * text, an example of the play field "playFieldEx" and a button in the 
     * bottum right that takes you back to the start screen.
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void initializeControls()
    {
        GreenfootImage playFieldEx = new GreenfootImage("Gridv2.PNG");
        getBackground().setColor(Color.BLACK); 
        getBackground().fillRect (0, 0, getWidth(), getHeight());
        showText("Click on your desired grid box \n in order to make your move", 150, 100);
        showText("Go Back", 460, 590);
        getBackground().drawImage(playFieldEx, 100, 150);
    }
    
    
    /**
     * checkScreenSwitch checks if the user has clicked on "go back" in the bottom right corner. 
     * If they have then it sets the world to the start screen
     * 
     * @param There are no parameters
     * @return Nothing is being returned
     */
    private void checkScreenSwitch()
    {
        MouseInfo mouseLocation = Greenfoot.getMouseInfo();
        
        if( Greenfoot.mouseClicked(this))
        {
            if (mouseLocation.getX() > 400 && mouseLocation.getX() < 500 && mouseLocation.getY() > 550 && mouseLocation.getY() < 600)
                {
                    Greenfoot.setWorld (new StartScreen());
                }
        }
    }
}
