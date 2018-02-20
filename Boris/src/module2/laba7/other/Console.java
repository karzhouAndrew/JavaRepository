package module2.laba7.other;


import module2.laba7.parser.Parser;
import module2.laba7.parser.ParserType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Console {

    public static void runConsole() {
        System.out.println("Hello.");
        String messageStartToWork = "Would you like to parse file? Y\\N";
        while (true) {
            int operation = askToContinue(messageStartToWork, new String[]{"N", "Y"});
            if (operation == 1) {
                nextQuestion();
            } else if (operation == 0) {
                System.out.println("Goodbye.");
                break;
            } else {
                System.out.println("Incorrect command.");
            }
        }
    }

    private static int askToContinue(String messageStartToWork, String[] strings) {
        System.out.println(messageStartToWork);
        String read = new Scanner(System.in).nextLine();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(read.toUpperCase())) {
                return i;
            }
        }
        return -1;
    }

    private static void nextQuestion() {
        String messageChoiceFile = "Get path to file for parsing (root directory is JavaRepository).\n 0 - to exit";
        while (true) {
            System.out.println(messageChoiceFile);
            String reader = new Scanner(System.in).nextLine();
            if ("0".equals(reader)) {
                return;
            } else {
                File file = new File(reader);
                try {
                    if (Parser.isXML(file)) {
                        chooseParse(file);
                        return;
                    } else {
                        System.out.println("There is not xml file.");
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found.");
                }
            }
        }
    }

    private static void chooseParse(File file) {
        String messageChoiceMethod = "Choose a method:\n 1 - DOM parsing;\n 2 - SAX parsing;\n 3 - StAX parsing;\n" +
                " 0 - to exit.";
        ParserType parserType;
        Parser parser = null;
        while (true) {
            int operation = askToContinue(messageChoiceMethod, new String[]{"0", "1", "2", "3"});
            if (operation == 0) {
                return;
            } else if (operation == 1) {
                parserType = ParserType.DOM;
                break;
            } else if (operation == 2) {
                parserType = ParserType.SAX;
                break;
            } else if (operation == 3) {
                parserType = ParserType.STAX;
                break;
            } else {
                System.out.println("Incorrect command.");
            }
        }
        try {

            parser = parserType.getParser();
            parser.parseXML(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String messageGetResult = "Would you like to see result? Y\\N";
        while (true) {
            int operation = askToContinue(messageGetResult, new String[]{"N", "Y"});
            if (operation == 1) {
                System.out.println(parser.getPoints());
                return;
            } else if (operation == 0) {
                return;
            } else {
                System.out.println("Incorrect command.");
            }
        }
    }
}
