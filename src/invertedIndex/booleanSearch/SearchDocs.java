package invertedIndex.booleanSearch;

import java.io.*;
import java.util.Hashtable;
import java.util.LinkedList;

public class SearchDocs {
    private String dataPath;
    private Hashtable<String, LinkedList<Integer>> indexs;

    public SearchDocs(String dataPath) {
        this.dataPath = dataPath;
        createIndex();
    }

    private void createIndex() {
        File data = new File(dataPath);

        try {
            BufferedReader read = new BufferedReader(new FileReader(data));
            String x = read.readLine();
            System.out.println(x);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
