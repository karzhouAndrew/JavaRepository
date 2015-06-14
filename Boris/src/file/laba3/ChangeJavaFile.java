package file.laba3;

//Прочитать текст Java-программы и записать в другой файл в обратном по-
//        рядке символы каждой строки.

import java.io.*;
import java.util.regex.Pattern;

public class ChangeJavaFile {
    private static final String JAVA_REGEX = "\\.java$";
    File file;
    AuxiliaryFile tempFile;

    public ChangeJavaFile(File file) throws FileNotFoundException {
        if (file.exists()) {
            if (Pattern.compile(JAVA_REGEX).matcher(file.toString()).find()) {
                this.file = file;
            } else {
                throw new FileNotFoundException("Not java file.");
            }
        } else {
            throw new FileNotFoundException(file.toString());
        }
    }

    public ChangeJavaFile(String file) throws FileNotFoundException {
        this(new File(file));
    }

    public void changeFile() {
        try {
            tempFile = new AuxiliaryFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String readLine;
            while ((readLine = reader.readLine()) != null) {
                tempFile.writeLineToFile(getChangeableLine(readLine));
            }
            tempFile.replaceOriginal(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private StringBuilder getChangeableLine(String readLine) {
        StringBuilder strB = new StringBuilder();
        for (int i = readLine.length(); i > 0; i--) {
            strB.append(readLine.charAt(i - 1));
        }
        strB.append("\n");
        return strB;
    }

    public StringBuilder readFile() {
        StringBuilder strB = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile.getPath()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                strB.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strB;
    }

}
