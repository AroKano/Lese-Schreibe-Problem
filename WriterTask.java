package readerWriter;

import utils.LogHelper;

public class WriterTask implements Runnable {
    private final Database db;

    public WriterTask (Database db) {
        this.db = db;
    }


    public void run() {
        //read from data base
        DataSet result = this.db.readDataSet();

        StringBuilder sb = new StringBuilder();
        sb.append("read from db: a == ");
        sb.append(result.a);
        // ..... TODO
        LogHelper.printThreadLog(sb.toString());
    }

}
