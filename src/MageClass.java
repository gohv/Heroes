import spells.action.Cast;
import spells.SpellBook;
import spells.Spell;

/**
 * Created by George on 1/21/2017.
 */
public class MageClass extends Hero implements Cast {

    private SpellBook spellBook;

    public SpellBook getSpellBook() {
        return spellBook;
    }

    public void setSpellBook(SpellBook spellBook) {
        this.spellBook = spellBook;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        super.setHealthPoints(healthPoints);
    }

    @Override
    public void setStrengthPoints(int strengthPoints) {
        super.setStrengthPoints(strengthPoints);
    }

    @Override
    public void setIntelligencePoints(int intelligencePoints) {
        super.setIntelligencePoints(intelligencePoints);
    }

    @Override
    public void setStaminaPoints(int staminaPoints) {
        super.setStaminaPoints(staminaPoints);
    }


    @Override
    public String castSpell(Spell spell) {
        if(spell.getSpellDamage() == 0){
            spell.setType("protection");
            return " casts protection spell";
        }else{
            spell.setType("damage");
            return " attacks with " + spell.getSpellName() + " for " + spell.getSpellDamage() +
                    " damage!";
        }
    }
}
