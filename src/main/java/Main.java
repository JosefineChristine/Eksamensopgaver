public class Main {
    public static void main(String[] args) {
        System.out.println("Raflebæger:");
        Raflebæger raflebæger = new Raflebæger(3);
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.se());
        System.out.println();

        System.out.println("Tekst:");
        Tekst tekst = new Tekst();
        tekst.tilføj("hej");
        tekst.tilføj("hej");
        tekst.tilføj("med");
        tekst.tilføj("dig");
        System.out.println(tekst.findAntalUnikke());
        System.out.println();

        System.out.println("Navne:");
        Names name1 = new Names("Josefine Christine Kodal");
        Names name2 = new Names("Monir Mooghen");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println();

        System.out.println("Raflebæger:");
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.se());
        System.out.println();

        System.out.println("Aldersberegner:");
        DateAgeCalculater dateAgeCalculater = new DateAgeCalculater(25, 2);
        System.out.println(dateAgeCalculater);
        System.out.println();

        System.out.println("Keywordopgave");
        Keyword keyword = new Keyword("hej", "en hilsen");
        System.out.println(keyword.matches("hejsa"));
        keyword.addKeyword(new Keyword("farvel", "en hilsen ved afsked"));
        keyword.addKeyword(new Keyword("på gensyn", "en hilsen ved afsked med ønske om gensyn"));
        System.out.println(keyword);



    }
}
