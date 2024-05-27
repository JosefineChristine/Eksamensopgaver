import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;
    private ArrayList<Keyword> seeAlso;

    public Keyword(String word, String definition) {
        this.word = word; //this fordi ellers peger det første word i denne linje bare på nummer to word i denne linje. Med this er det attributten den assigner.
        this.definition = definition;
        seeAlso = new ArrayList<>();
    }

    public boolean matches(String searchWord) {
        word = word.toLowerCase();
        searchWord = searchWord.toLowerCase();
        return searchWord.contains(word);
    }

    public void addKeyword(Keyword k) {
        seeAlso.add(k);
    }

    public ArrayList<Keyword> getSeeAlso() {
        return seeAlso;
    }

    public String getWord(){
        return word;
    }

    public String getDefinition(){
        return definition;
    }

    @Override
    public String toString() {
        String tekst = "";
        tekst += "word: " + word + "\n" +
                "def: " + definition + "\n";

        for (Keyword k : getSeeAlso()) {
            tekst += k.getWord() + ": " + k.getDefinition() + "\n";
        }

        return tekst;
    }


}
