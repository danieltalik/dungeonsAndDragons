package dungeonsAndDragons;

public class PlayableCharacter {


    private int level;
    private String name;
    private int exp;
    private String alignment;
    private String background;
    private String race;
    private int hp;
    private CharacterClass characterClass;

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
}
