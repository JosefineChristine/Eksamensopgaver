import java.time.LocalDate;

public class Film {

    private String filmtitel;
    private int udgivelsesår;
    Producer producer;

    Film(String filmtitel, int udgivelsesår, Producer producer) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
        this.producer = producer;
    }

    Film(String filmtitel) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = LocalDate.now().getYear(); //kunne også bare skrive 2024
    }



//    @Override
//    public String toString() {
//
//        //if sætning til om produceren er null, så den ikke printer null
//
//    }

}
