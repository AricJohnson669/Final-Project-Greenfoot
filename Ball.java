 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int speed;
    
    public Ball()
    {
        speed = 5;
        setRotation(Greenfoot.getRandomNumber(180));
    }
    
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        if(getX() >= 10)
        {
            rotate();
            speed = -speed;
            move(speed);
        }
        if(isTouching(Paddle.class))
        {
            rotate();
            setLocation(getX(), getY() - 5);
        }
        if(getX() <= 590)
        {
            speed = -speed;
            rotate();
            setRotation(getRotation() + Greenfoot.getRandomNumber(10));
        }
        if(getY() <= 10)
        {
            speed = speed;
            rotate();
        }
        if(getY() >= 590)
        {
            getWorld().removeObject(this);
        }
    } 
    
    private void rotate()
    {
        setRotation(getRotation() * -1);
        setRotation(getRotation() + Greenfoot.getRandomNumber(10));
    }
}
