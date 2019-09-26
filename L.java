
/**
 * Write a description of class L here.
 *
 * @author Greg Johnson, University of Connecticut
 * @version 0.3
 */
public class L extends Tetrimino
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class L
     */
    public L(int x, int y, GamePanel panel)
    {
        super(java.awt.Color.ORANGE, panel);
        // initialise instance variables
        this.setLocation(x,y);
    }

    /**
     * Sets the location of the composite Tetrimino object
     *
     * @param  x  the x-coordinate in the JPanel to which to move this object
     * @param  y  the y-coordinate in the JPanel to which to move this object
     * @return    Nothing
     */
    public void setLocation(int x, int y)
    {
        _x = x;
        _y = y;
        _block1.setLocation(x,y);
        _block2.setLocation(x,y+TetrisConstants.BLOCK_SIZE);
        _block3.setLocation(x,y+(2*TetrisConstants.BLOCK_SIZE));
        _block4.setLocation(x+TetrisConstants.BLOCK_SIZE,y+(2*TetrisConstants.BLOCK_SIZE));
    }
}
