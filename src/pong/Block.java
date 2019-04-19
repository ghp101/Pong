package pong;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {

    private int xPos;
    private int yPos;
    private int width;
    private int height;

    private Color color;

    public Block()
    {
        xPos = 1;
        yPos = 1;
        width = 1;
        height = 1;
        color = Color.MAGENTA;
    }

    //add other Block constructors - x , y , width, height, color
    public Block(int x, int y)
    {
        xPos = x;
        yPos = y;
        width = 1;
        height = 1;
        color = Color.MAGENTA;
    }
    
    public Block(int x, int y, int w)
    {
        xPos = x;
        yPos = y;
        width = w;
        height = 1;
        color = Color.MAGENTA;
    }
    
    public Block(int x, int y, int w, int h)
    {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = Color.MAGENTA;
    }
    
    public Block(int x, int y, int w, int h, Color c)
    {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = c;
    }
    
    //add the other set methods
    public void setPos(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    
    /**
     * @return the xPos
     */
    public int getX() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setX(int xPos) {
        this.xPos = xPos;
    }

    /**
     * @return the yPos
     */
    public int getY() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setY(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color col)
    {
        color = col;
    }

    public void draw(Graphics window)
    {
   	//uncomment after you write the set and get methods
        window.setColor(color);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public void draw(Graphics window, Color col)
    {
        window.setColor(col);
        window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    public boolean equals(Object obj)
    {
        Block b = (Block) obj;
        if(this.getX() == b.getX() && this.getY() == b.getY()
            && this.getWidth() == b.getWidth() && this.getHeight() == b.getHeight() 
            && this.getColor().equals(b.getColor()))
        {
            return true;
        }
                
        return false;
    }
    
   //add a toString() method  - x , y , width, height, color
    public String toString()
    {
        return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
    } 
}
