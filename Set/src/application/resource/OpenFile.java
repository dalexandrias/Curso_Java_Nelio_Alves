package application.resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OpenFile {
    private final String pathFile;

    public OpenFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public Set<String> hashSetFile() {

        Set<String> set = null;
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))){

            set = new LinkedHashSet<>();

            String line = br.readLine();
            while (null != line) {
                if (!line.equals("")) {
                    set.add(line);
                }
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return set;
    }
}
