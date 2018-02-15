public class SinglyLink {
    public int num;

    public SinglyLink next;

    public SinglyLink(int num) {
        this.num = num;
    }

    public void display() {
        System.out.print(num + " > ");
    }

    public String toString() {
        return Integer.toString(num);
    }
}
