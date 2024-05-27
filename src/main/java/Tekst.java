import java.util.ArrayList;

public class Tekst {

    private ArrayList<String> tekstLinjer = new ArrayList<>();  //= new Arraylist er at instansiere den

    public Tekst() {

    }

    public void tilføj(String stringInput) {
        tekstLinjer.add(stringInput);
    }

    public int findAntalUnikke() {
        ArrayList<String> tempArr = new ArrayList<>();
        for (int i = 0; i < tekstLinjer.size(); i++) {        //fori loop
            if (!(tempArr.contains(tekstLinjer.get(i)))) {
                tempArr.add(tekstLinjer.get(i));
            }
        }
        return tempArr.size();
    }
}


