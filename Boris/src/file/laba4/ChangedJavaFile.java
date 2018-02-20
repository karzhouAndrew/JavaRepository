package file.laba4;

//Прочитать текст Java-программы и в каждом слове длиннее двух символов
//все строчные символы заменить прописными.


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangedJavaFile {
    private static final String REPLACE_WORD = "\\w{2,}";
    private static final String EXTENSION_REGEX = "\\.java$";
    private File file;
    private AuxiliaryFile temp;

    public ChangedJavaFile(String path) throws IOException, IllegalArgumentException {
        this(new File(path));
    }

    public ChangedJavaFile(File file) throws IOException, IllegalArgumentException {
        if (file.exists()) {
            this.file = new File(file.getCanonicalFile().toString());
        } else if (isRegexExist(file.getName(), EXTENSION_REGEX)) {
            throw new IllegalArgumentException();
        } else {
            throw new FileNotFoundException();
        }
    }

    private boolean isRegexExist(String str, String regex) {
        System.out.println(Pattern.compile(regex).matcher(str).group());
        return Pattern.compile(regex).matcher(str).find();
    }

    public void changeable() throws IOException {
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
        Matcher matcherWord = Pattern.compile(REPLACE_WORD).matcher(str);
        while (matcherWord.find()) {
            String changeWord = matcherWord.group();
            str = str.replaceAll(changeWord, changeWord.toUpperCase());
        }
        writeToAuxiliaryFile(str);
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
