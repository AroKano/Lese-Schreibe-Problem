package readerWriter;

public class Problem {
    public static void main(String[] args) {

        Database db = new Database();
        ReaderTask r1 = new ReaderTask(db);

        Thread t1 = new Thread(r1);

        t1.start();
    }
}
