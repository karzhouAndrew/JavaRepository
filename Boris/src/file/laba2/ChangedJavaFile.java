package file.laba2;

//Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.

import java.io.*;
import java.util.regex.Pattern;

public class ChangedJavaFile {
    private static final String REPLACE_WORD = " " + "private" + " ";
    private static final String INSERT_WORD = " " + "public" + " ";
    private static final String CLASS_REGEX = "class +(\\w+)";
    private static final String EXTENSION_REGEX = "\\.java$";
    private File file;
    private AuxiliaryFile temp;

    public ChangedJavaFile(File file) throws IOException, IllegalArgumentException {
        if (file.exists()) {
            this.file = new File(file.getCanonicalFile().toString());
        } else if (isRegexExist(file.getName(), EXTENSION_REGEX)) {
            throw new IllegalArgumentException();
        } else {
            throw new FileNotFoundException();
        }
    }

    public ChangedJavaFile(String path) throws IOException, IllegalArgumentException {
        this(new File(path));
    }

    public void replacePrivateToPublic() throws IOException {
        temp = new AuxiliaryFile(file);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                findReplaceWord(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        AuxiliaryFile.replaceOriginal(temp.getPath(), file);
    }

    private void findReplaceWord(String str) {
        if (isRegexExist(str, CLASS_REGEX)) {
            writeToAuxiliaryFile(str);
        } else if (isRegexExist(str, REPLACE_WORD)) {
            writeToAuxiliaryFile(str.replaceAll(REPLACE_WORD, INSERT_WORD));
        } else {
            writeToAuxiliaryFile(str);
        }
    }

    private boolean isRegexExist(String str, String regex) {
        return Pattern.compile(regex).matcher(str).find();
    }

    private void writeToAuxiliaryFile(String str) {
        temp.writeLineToFile(new StringBuilder(str));
    }

    public StringBuilder seeFile(File file) {
        StringBuilder strB = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            strB = readTextToBuffer(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strB;
    }

    private StringBuilder readTextToBuffer(BufferedReader reader) throws IOException {
        StringBuilder strB = new StringBuilder();
        String str;
        while ((str = reader.readLine()) != null) {
            strB.append(str).append("\n");
        }
        return strB;
    }

    public File getFile() {
        return file;
    }
}
