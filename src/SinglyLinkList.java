public class SinglyLinkList {
    public SinglyLink firstLink;

    SinglyLinkList() {
        firstLink = null;
    }

    public boolean isEmpty(){
        return (firstLink == null);
    }

    public void insertFirstLink(int num) {
        SinglyLink newLink = new SinglyLink(num);

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public SinglyLink removeFirst() {
        SinglyLink linkReference = firstLink;

        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("The LinkedList is empty...");
        }

        return linkReference;
    }

    public void display() {
        SinglyLink theLink = firstLink;

        System.out.print("head > ");

        while (theLink != null) {

            theLink.display();

            if(theLink.next == null) {
                System.out.print("tail");
            }

            //System.out.print(" > " + theLink.next);

            theLink = theLink.next;
        }
    }

    public void clear() {
        firstLink = null;
        System.out.println("\n\ncleared list successfully...\n\n");
    }
}
