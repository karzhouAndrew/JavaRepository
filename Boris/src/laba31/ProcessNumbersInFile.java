package laba31;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
//        убрать все повторяющиеся числа и снова распечатать.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessNumbersInFile {
    private List<Integer> numbersInFile;
    private int nextEmptySell;
    private final static String DECIMAL_REGEX = "\\d+";

    public ProcessNumbersInFile() {
        numbersInFile = new ArrayList<>();
    }

    public void addNumberToArrayFromFile(String file) {
        FileReader inputText = null;
        try {
            inputText = new FileReader(file);
            addNumberWhenFind(inputText);
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass());
        } catch (IOException e) {
            System.out.println(e.getClass());
        } finally {
            nextEmptySell = numbersInFile.size();
            if (inputText != null) {
                try {
                    inputText.close();
                } catch (IOException e) {
                    System.out.println(e.getClass());
                }
            }
        }
    }

    private void addNumberWhenFind(FileReader inputText) throws IOException {
        int symbol;
        while ((symbol = inputText.read()) != -1) {
            addNumber((char) symbol);
        }
    }

    private void addNumber(char symbol) {
        try {
            int number = Integer.valueOf(String.valueOf(symbol));
            isNewNumber(number);
        } catch (IllegalArgumentException e) {
            nextEmptySell = numbersInFile.size();
        }
    }

    private void isNewNumber(int number) {
        if (numbersInFile.size() == nextEmptySell) {
            numbersInFile.add(number);
        } else {
            numbersInFile.set(nextEmptySell, constructInteger(number));
        }
    }

    private Integer constructInteger(int number) {
        return number + numbersInFile.get(nextEmptySell) * 10;
    }

    public int sumNumbersInText() {
        int sum = 0;
        for (Integer number : numbersInFile) {
            sum += number;
        }
        return sum;
    }

    public List<Integer> getDifferentNumbers() {
        return new ArrayList<>(new HashSet<>(numbersInFile));
    }

    public List<Integer> getNumbersInFile() {
        return numbersInFile;
    }

    public void removeListNumbers(){
        numbersInFile.clear();
    }

    public void addNumbersFromFile(String file) {
        BufferedReader inputText = null;
        try {
            inputText = new BufferedReader(new FileReader(file));
            String readLine = inputText.readLine();
            while (readLine != null) {
                addNumberToArray(readLine);
                readLine = inputText.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputText != null) {
                try {
                    inputText.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void addNumberToArray(String readLine) {
        Matcher matcher = Pattern.compile(DECIMAL_REGEX).matcher(readLine);
        while (matcher.find()) {
            numbersInFile.add(Integer.valueOf(matcher.group()));
        }
    }

}
