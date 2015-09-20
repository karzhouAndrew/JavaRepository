package addit_file05;

import java.io.*;
import java.util.Scanner;

public class MarksListProcessor {

    public String readMarkList(String marksFilePath) {
        StringBuilder strBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(marksFilePath))) {
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                strBuilder.append(inputLine).append('\n');
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + marksFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBuilder.toString();
    }

    public String upCaseWhenAverMarkOver(double borderLevel, String givenStr) {
        Scanner lineScan = new Scanner(givenStr);
        StringBuilder editedStrBuilder = new StringBuilder();
        while (lineScan.hasNextLine()) {
            String readLine = lineScan.nextLine();
            readLine = editNextLine(borderLevel, readLine);
            editedStrBuilder.append(readLine).append('\n');
        }
        lineScan.close();
        return editedStrBuilder.toString();
    }

    private String editNextLine(double borderLevel, String readLine) {
        Scanner markScan = new Scanner(readLine);
        markScan.useDelimiter("[, ]+");
        int currentSum = 0;
        int counter = 0;
        while (markScan.hasNext()) {
            if (markScan.hasNextInt()) {
                currentSum += markScan.nextInt();
                counter++;
            } else {
                markScan.next();
            }
        }
        markScan.close();
        if ((double) currentSum / counter > borderLevel) {
            readLine = readLine.toUpperCase();
        }
        return readLine;
    }

    public void write(String editedList, File outputFile) {
        try (Writer writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(editedList);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + outputFile.getName());
        } catch (IOException e) {
            System.err.println("Can't write to file: " + outputFile.getName());
            e.printStackTrace();
        }
    }

    public void createFile(File file) {
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Can't create file or directory: " + file.getName());
            e.printStackTrace();
        }
    }
}
