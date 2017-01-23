import spells.SpellBook;
import spells.Spell;

/**
 * Created by George on 1/21/2017.
 */
public class Main {


    public static void main(String[] args) {
        Spell fireball = new Spell("fireball", 10);
        Spell shield = new Spell("shield", 0);
        Spell magicMissile = new Spell("magic missile", 5);
        SpellBook spellBook = new SpellBook();
        spellBook.addSpell(shield);
        spellBook.addSpell(fireball);
        spellBook.addSpell(magicMissile);

        MageClass raistlin = new MageClass();

        raistlin.setName("Ronin");
        raistlin.setStrengthPoints(1);
        raistlin.setStaminaPoints(10);
        raistlin.setIntelligencePoints(18);

        raistlin.setSpellBook(spellBook);

        System.out.println(raistlin.getName() + raistlin.castSpell(shield));
        System.out.println(raistlin.getName() + raistlin.castSpell(spellBook.castSingleSpellFromSpellBook(1)));

    }
}
