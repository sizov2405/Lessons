package lesson44;

public class Person {

    private int readingSpeedPerPage;
    private int checkingPeriodPerPage;

    public Person(int readingSpeedPerPage, int checkingPeriodPerPage) {
        this.readingSpeedPerPage = readingSpeedPerPage;
        this.checkingPeriodPerPage = checkingPeriodPerPage;
    }

    public int getReadingSpeedPerPage() {
        return readingSpeedPerPage;
    }

    public int getCheckingPeriodPerPage() {
        return checkingPeriodPerPage;
    }
}
