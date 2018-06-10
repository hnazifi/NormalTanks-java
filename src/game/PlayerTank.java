package game;

/**
 * this class represents the player's tank
 */

public class PlayerTank extends Tank{

    private static final PlayerTank PLAYER_TANK = new PlayerTank();

    public PlayerTank(){
        setLife(3);
        setAdversary(false);
        setAnimated(true);
        setHealthPoint(100);
        setBfCannon(0);
        setCannon(50);
        setTurret(300);
    }
}
