import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


/**
 * Space. Something for space ships and asteroids to fly in.
 * 
 * @author Michael Kolling
 * @version 1.0
 */
public class Space extends World
{
    public Space() 
    {
        super(600, 400, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        makeStars(300);
        createAsteroids();
    }
    
    public void makeStars(int number) 
    {
        GreenfootImage background = getBackground();             
        for(int i=0; i < number; i++) {            
             int x = Greenfoot.getRandomNumber( getWidth() );
             int y = Greenfoot.getRandomNumber( getHeight() );
             int color = 150 - Greenfoot.getRandomNumber(120);
             background.setColorAt(x,y,new Color(color,color,color));
        }
    }
    
    private void createAsteroids(){
        
        for(int i=0; i < 5; i++) {  
            
             int x = Greenfoot.getRandomNumber( getWidth() );
             int y = Greenfoot.getRandomNumber( getHeight() );
             addObject(new Asteroid(), x, y);
             
            }
    }
}