/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String path = "src/main/resources/gates.js";
        fileLinter(path);

    }

    public static List<String> fileLinter(String fileName) {
        List<String> errors  = new ArrayList<>();

        Path path = Paths.get(fileName);

        int lineNumber = 0;
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line = null;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.length() != 0) {
                    if (line.charAt(line.length() - 1) != 59
                            && line.charAt(line.length() - 1) != 123
                            && line.charAt(line.length() - 1) != 125
                            && !line.contains("if")
                            && !line.contains("else")
                    ) {
                        errors.add("Line " + lineNumber + ": Missing semicolon.");
                        System.out.println(errors.toArray()[errors.toArray().length -1]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return errors;

    }
}
