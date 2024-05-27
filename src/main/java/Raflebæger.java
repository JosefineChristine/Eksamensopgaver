import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    ArrayList<Integer> terninger = new ArrayList<>();

    Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
    }

    public int ryst() {
        int samletAntalØjne = 0;
        for (int i = 0; i < antalTerninger; i++) {
            Random random = new Random();
            int terning = random.nextInt(7);
            terninger.add(terning);
            samletAntalØjne += terning;
        }
        return samletAntalØjne;
    }

    public String se() {
        String output = "";
        for (int i = 0; i < terninger.size(); i++) {
            output += "Terning " + (i+1) + ": " + terninger.get(i) + "\n";
        }
        return output;
    }

}
