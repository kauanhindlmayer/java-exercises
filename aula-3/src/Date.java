public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void advanceDay() {
        this.day += 1;
        if(month == 2 && day > 28) {
            this.day = 1;
            this.month += 1;
        }

        if(month == 12 && day > 31) {
            day = 1;
            year += 1;
        }

        if(day > 30) {
            this.day = 1;
            this.month += 1;
        }
    }

    String formatDate() {
        return day + "/" + month + "/" + year;
    }
}
