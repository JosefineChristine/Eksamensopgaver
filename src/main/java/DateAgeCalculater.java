public class DateAgeCalculater {

    private int yourAge;
    private int dateAge;

    DateAgeCalculater(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int lowestAcceptableAge() {
        int lowestAge = 0;
        lowestAge = (yourAge/2)+7;
        return lowestAge;
    }

    @Override
    public String toString() {
        if (dateAge >= lowestAcceptableAge()){
            return "Your date is old enough";
        } else {
        return "Your date is too young. Your date has to be " + lowestAcceptableAge() + " years old";
        }
    }
}
