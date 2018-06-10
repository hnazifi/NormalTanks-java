package game;

/**
 * this class represents a mini tank
 */
public class MiniTank extends Tank{
    public MiniTank(String difficulty, boolean animated){
        if(difficulty.equals("easy"))
            setHealthPoint(25);
        else if(difficulty.equals("normal"))
            setHealthPoint(50);
        else
            setHealthPoint(75);
        setAdversary(true);
        setAnimated(animated);
        if(animated)
            setTurret(-1);
        else
            setCannon(-1);
        setLife(1);
    }
}
