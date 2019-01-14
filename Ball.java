 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private final int SIZE = 20;
    private static int velocity = 0;
    
    public Ball()
    {
        GreenfootImage ballImage = new GreenfootImage (SIZE, SIZE);
        ballImage.setColor (Color.GRAY);
        ballImage.fillOval (0, 0, SIZE, SIZE);
        setImage (ballImage);
        turn (Greenfoot.getRandomNumber(360) - 1);
    }
    
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld field = (MyWorld) getWorld();
        
        if (field.getStarted() == true)
        {
            move(velocity);
            checkCollition();
        }
    } 
    
    private void checkCollition()
    {
        Actor hitting = getOneIntersectingObject(Paddle.class);
        MyWorld world = (MyWorld) getWorld();
        
        if (hitting != null)
        {
            velocity = -5;
            setRotation(- getRotation());
            move(velocity);
        }
        
        if (getY() <= 10)
        {
            setRotation(- getRotation());
        }
        
        if (getY() >= 590)
        {
           setRotation(- getRotation()); 
        } 
        
        if (getX() <= 10)
        {
            getWorld().removeObject (this);
            //getPoint = (Score)world.getObjects(Score.class_).get(0);
            //getPoint.countScore();
            //world.reset();
        }
        else if (getX() >= 790)
        {
           getWorld().removeObject (this); 
           //getPoint = (Score)world.getObjects(Score.class_).get(0);
           //getPoint.countScore();
           //world.reset();
        }
    }
    
    public void setVelocity(int v)
    {
        velocity = v;
    }
}
