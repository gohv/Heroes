package spells;

/**
 * Created by George on 1/21/2017.
 */
public class Spell{

    private String spellName;
    private int spellDamage;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!type.equalsIgnoreCase("protection") && !type.equalsIgnoreCase("damage")){
            throw new IllegalArgumentException();
        }

        this.type = type;
    }

    public Spell(String spellName, int spellDamage) {

        this.spellName = spellName;
        this.spellDamage = spellDamage;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "spellName='" + spellName + '\'' +
                ", spellDamage=" + spellDamage +
                '}';
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public void setSpellDamage(int spellDamage) {
        this.spellDamage = spellDamage;
    }
}
