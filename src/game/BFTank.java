package game;

/**
 * this class represents a big tank
 */

public class BFTank extends Tank{
    public BFTank(String difficulty, boolean animated){
        if(difficulty.equals("easy"))
            setHealthPoint(50);
        else if(difficulty.equals("normal"))
            setHealthPoint(75);
        else
            setHealthPoint(100);
        setAdversary(true);
        setAnimated(animated);
        if(animated)
            setBfCannon(-1);
        else
            setCannon(-1);
        setLife(1);
    }
}
