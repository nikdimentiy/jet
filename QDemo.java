// java <--queue code presentation

class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("\n");
            System.out.println("The Queue - is FULL!");
            return;
        }

        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("🥜🥜🥜The Queue is empty🥜🥜🥜");
            return (char) 0;
        }
        return q[getloc++];
    }
}

public class Main {

    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("<---The usage Queue for alphabet saving--->");

        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.print("The Queue content (BigQ): ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.println("\n");

        System.out.println("Usage queue (SmallQ) for fail generation: ");
        for (i = 0; i < 5; i++) {
            System.out.println("Attempt to saving: " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.println("The context of queue (SmallQ): ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) {
                System.out.println(ch);
            }
        }
    }

}
