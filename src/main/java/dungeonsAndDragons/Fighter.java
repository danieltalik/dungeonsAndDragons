
package dungeonsAndDragons;
import java.util.Random;
public class Fighter extends CharacterClass {

    Random random = new Random();
    public Fighter(){
        hitDie = 8;
    }

    @Override
    public int Attack() {
        int attack = random.nextInt(Math.abs(hitDie-1));
        return attack;
    }
    @Override
    public int SavingThrow(){
        return random.nextInt(Math.abs(hitDie-1));
    }
}
