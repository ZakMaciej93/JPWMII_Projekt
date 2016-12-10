package gameObjects.gameEnemies;

/**
 *
 * @author Maciej Żak
 */
public class EnemyZombie extends gameObjects.GameEnemy{
    public EnemyZombie(int x, int y, int level) {
        super(25*(level+1),0, "Zombie", 80*(level+1), 80*(level+1), 15*(level+1), 25*(level+1), 0, 2*(level+1), (level+1), x, y, 2, 0, x*32, y*32, 0);
    }

}