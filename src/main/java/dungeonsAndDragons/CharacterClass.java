package dungeonsAndDragons;

public abstract class CharacterClass implements Actions {
    protected int hitDie;
    protected int primaryAttribute;
    protected int saves;
    protected int armorClass;
    protected CharacterAttributes characterAttributes;

    public void setCharacterAttributes(CharacterAttributes characterAttributes) {
        this.characterAttributes = characterAttributes;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public void setPrimaryAttribute(int primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }

    public void setHitDie(int hitDie) {
        this.hitDie = hitDie;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public int getPrimaryAttribute() {
        return primaryAttribute;
    }

    public CharacterAttributes getCharacterAttributes() {
        return characterAttributes;
    }

    public int getHitDie() {
        return hitDie;
    }

    public int getSaves() {
        return saves;
    }

    public int SavingThrow(int saves) {
        this.saves = saves;
        return saves;
    }


    public int Attack() {
        this.hitDie = hitDie;
        return hitDie;
    }
}
