package addit_file08;

import java.io.*;

public class TextProcessor {

    private final String BLANKS_REGEX = "[ \t]{2,}";
    private final String SPACE_REGEX = " ";
    private final String NEW_LINES_REGEX = "[ \n]{2,}";
    private final String NEW_LINE_REGEX = "\n";


    public void removeAdditionalBlanks(String givenFilePath, String resultFilePath) {
        String givenText = readText(givenFilePath);
        String editedText = removeAdditionalCharsIn(givenText);
        File outputFile = new File(resultFilePath);
        createFile(outputFile);
        writeStrToFile(editedText, outputFile);
    }

    private void writeStrToFile(String text, File file) {
        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getName());
        } catch (IOException e) {
            System.err.println("Can't write to file: " + file.getName());
            e.printStackTrace();
        }
    }

    private void createFile(File file) {
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Can't create file or directory: " + file.getName());
            e.printStackTrace();
        }
    }

    private String removeAdditionalCharsIn(String text) {
        return text.replaceAll(BLANKS_REGEX, SPACE_REGEX).replaceAll(NEW_LINES_REGEX, NEW_LINE_REGEX);
    }

    private String readText(String filePath) {
        StringBuilder strBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                strBuilder.append(inputLine).append('\n');
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBuilder.toString();
    }
}
