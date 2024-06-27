package org.testTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private List<Integer> fileData;

    public FileReader() {
        this.fileData = new ArrayList<>();
    }

    public List<Integer> readDataFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                fileData.add(number);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return fileData;
    }
}
