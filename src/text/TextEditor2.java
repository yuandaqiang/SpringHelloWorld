package text;

public class TextEditor2 {

    SpellChecker spellChecker;
    String string;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


    public  void checkSpellChecker()
    {
        System.out.println("T2 spellchecker and string"+spellChecker+""+string);
        spellChecker.check();
    }
}
