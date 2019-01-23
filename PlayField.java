import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class PlayField here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayField extends greenfoot.World
{
    private boolean isPlayerOne = true;
    
    /**
     * Constructor for objects of class PlayField.
     * 
     */
    public PlayField()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        initializePlayField();
        addObjectsToWorld();
    }
    
    public void act()
    {
        addObjectsToWorld();
    }
    
    private void initializePlayField()
    {
        getBackground().setColor(Color.WHITE); 
        getBackground().fillRect (0, 0, getWidth(), getHeight());
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (200, 0, 4, getHeight());
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (400, 0, 4, getHeight());
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (0, 200, 600, 4);
        getBackground().setColor(Color.GRAY);
        getBackground().fillRect (0, 400, 600, 4);
    }
    
    private void addObjectsToWorld()
    {
        MouseInfo mouseLocation = Greenfoot.getMouseInfo();
        
        if( Greenfoot.mouseClicked(this))
        {
            if( isPlayerOne == true )
            {
                if (mouseLocation.getX() > 0 && mouseLocation.getX() < 200 && mouseLocation.getY() > 0 && mouseLocation.getY() < 200)
                {
                    addObject (new Player1(), 100, 100);
                }
                
                if (mouseLocation.getX() > 200 && mouseLocation.getX() < 400 && mouseLocation.getY() > 0 && mouseLocation.getY() < 200)
                {
                    addObject (new Player1(), 300, 100);
                }
                
                if (mouseLocation.getX() > 400 && mouseLocation.getX() < 600 && mouseLocation.getY() > 0 && mouseLocation.getY() < 200)
                {
                    addObject (new Player1(), 500, 100);
                }
                
                if (mouseLocation.getX() > 0 && mouseLocation.getX() < 200 && mouseLocation.getY() > 200 && mouseLocation.getY() < 400)
                {
                    addObject (new Player1(), 100, 300);
                }
                
                if (mouseLocation.getX() > 200 && mouseLocation.getX() < 400 && mouseLocation.getY() > 200 && mouseLocation.getY() < 400)
                {
                    addObject (new Player1(), 300, 300);
                }
                
                if (mouseLocation.getX() > 400 && mouseLocation.getX() < 600 && mouseLocation.getY() > 200 && mouseLocation.getY() < 400)
                {
                    addObject (new Player1(), 500, 300);
                }
                
                if (mouseLocation.getX() > 0 && mouseLocation.getX() < 200 && mouseLocation.getY() > 400 && mouseLocation.getY() < 600)
                {
                    addObject (new Player1(), 100, 500);
                }
                
                if (mouseLocation.getX() > 200 && mouseLocation.getX() < 400 && mouseLocation.getY() > 400 && mouseLocation.getY() < 600)
                {
                    addObject (new Player1(), 300, 500);
                }
                
                if (mouseLocation.getX() > 400 && mouseLocation.getX() < 600 && mouseLocation.getY() > 400 && mouseLocation.getY() < 600)
                {
                    addObject (new Player1(), 500, 500);
                }
                
                isPlayerOne = false;
                
                Greenfoot.delay( 60 );
        
                Greenfoot.setWorld( new PlayerTwoTurn( this ) );
            }
            else
            {
                if (mouseLocation.getX() > 0 && mouseLocation.getX() < 200 && mouseLocation.getY() > 0 && mouseLocation.getY() < 200)
                {
                    addObject (new Player2(), 100, 100);
                }
                
                if (mouseLocation.getX() > 200 && mouseLocation.getX() < 400 && mouseLocation.getY() > 0 && mouseLocation.getY() < 200)
                {
                    addObject (new Player2(), 300, 100);
                }
                
                if (mouseLocation.getX() > 400 && mouseLocation.getX() < 600 && mouseLocation.getY() > 0 && mouseLocation.getY() < 200)
                {
                    addObject (new Player2(), 500, 100);
                }
                
                if (mouseLocation.getX() > 0 && mouseLocation.getX() < 200 && mouseLocation.getY() > 200 && mouseLocation.getY() < 400)
                {
                    addObject (new Player2(), 100, 300);
                }
                
                if (mouseLocation.getX() > 200 && mouseLocation.getX() < 400 && mouseLocation.getY() > 200 && mouseLocation.getY() < 400)
                {
                    addObject (new Player2(), 300, 300);
                }
                
                if (mouseLocation.getX() > 400 && mouseLocation.getX() < 600 && mouseLocation.getY() > 200 && mouseLocation.getY() < 400)
                {
                    addObject (new Player2(), 500, 300);
                }
                
                if (mouseLocation.getX() > 0 && mouseLocation.getX() < 200 && mouseLocation.getY() > 400 && mouseLocation.getY() < 600)
                {
                    addObject (new Player2(), 100, 500);
                }
                
                if (mouseLocation.getX() > 200 && mouseLocation.getX() < 400 && mouseLocation.getY() > 400 && mouseLocation.getY() < 600)
                {
                    addObject (new Player2(), 300, 500);
                }
                
                if (mouseLocation.getX() > 400 && mouseLocation.getX() < 600 && mouseLocation.getY() > 400 && mouseLocation.getY() < 600)
                {
                    addObject (new Player2(), 500, 500);
                }
                
                isPlayerOne = true;
                
                Greenfoot.delay( 60 );
        
                Greenfoot.setWorld( new PlayerOneTurn( this ) );
            }
        }
    }
}
