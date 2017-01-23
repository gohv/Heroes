package spells;

import exception.HeroException;

import java.util.ArrayList;

/**
 * Created by George on 1/21/2017.
 */
public class SpellBook {

    public SpellBook() {
        spellBook = new ArrayList<>();
    }

   private ArrayList<Spell> spellBook;

    public ArrayList<Spell> getSpellBook() {

        return spellBook;
    }

    public Spell castSingleSpellFromSpellBook(int spellNumber){
        if(spellNumber > spellBook.size()){
            throw new HeroException("! No such spell !");
        }
        return spellBook.get(spellNumber);

    }


    public void addSpell(Spell spell) {

        spellBook.add(spell);
    }


    @Override
    public String toString() {
        return "SpellBook" +
                "spellBook=" + spellBook;
    }


}
