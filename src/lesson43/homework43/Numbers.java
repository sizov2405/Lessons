package lesson43.homework43;

public class Numbers {

    private Integer current;
    private Integer prev;
    private Integer next;

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public void setNext(int nex) {
        this.next = nex;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "current=" + current +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
