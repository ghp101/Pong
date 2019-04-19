package pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{

    private int xSpeed;
    private int ySpeed;

    public Ball()
    {
        super(200, 200);
        xSpeed = 3;
        ySpeed = 1;
    }

    //add the other Ball constructors
    public Ball(int x, int y)
    {
        super(x, y);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x, int y, int w, int h)
    {
        super(x, y, w, h);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x, int y, int w, int h, Color c)
    {
        super(x, y, w, h, c);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x, int y, int w, int h, Color c, int xs, int ys)
    {
        super(x, y, w, h, c);
        xSpeed = xs;
        ySpeed = ys;
    }
    
    //add the set methods
    /**
     * @return the xSpeed
     */
    public int getXSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getYSpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public void moveAndDraw(Graphics window)
    {
   	//draw a white ball at old ball location
        draw(window, Color.WHITE);
        
        setX(getX() + getXSpeed());
        //setY
        setY(getY() + getYSpeed());

        //draw the ball at its new location
        draw(window);
    }

    public boolean equals(Object obj)
    {
        Ball b = (Ball) obj;
        if(this.getX() == b.getX() && this.getY() == b.getY()
            && this.getWidth() == b.getWidth() && this.getHeight() == b.getHeight() 
            && this.getColor().equals(b.getColor()) && this.getXSpeed() == b.getXSpeed()
            && this.getYSpeed() == b.getYSpeed())
        {
            return true;
        }
        
        return false;
    }
    
    public boolean didCollideLeft(Object obj)
    {
        Block o = (Block) obj;
        return getX() <= o.getX() + o.getWidth() + Math.abs(getXSpeed());
    }
    
    public boolean didCollideTop(Object obj)
    {
        Block o = (Block) obj;
        return getY() + getHeight() >= getY();
    }

   //add a toString() method
    public String toString()
    {
        return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
    }
}
