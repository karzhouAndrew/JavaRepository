package workGroup;

import java.util.regex.Pattern;
/*
Найти и вывести предложение из текста, в котором максимальное количество одинаковых слов.
*/
/**
 * Created by User on 12.05.2015.
 */
public class WorkWithText2 {
    private static String[] sequence = {};
    private static String[] words = {};
    private static String maxWord;

    public static void printSequenceWithMaxWord(String text) {
        Pattern pattern = Pattern.compile("[.!?]");
        sequence = pattern.split(text);
        int countWords[] = new int[sequence.length];
        String maxWords[] = new String[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            countWords[i] = getMaxWordAndItCount(sequence[i]);
            maxWords[i] = maxWord;
        }
        System.out.println(sequence[getNumberOfMaxElement(countWords)] + " \nСлово: " + maxWords[getNumberOfMaxElement(countWords)]);
    }

    private static int getNumberOfMaxElement(int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[number]) {
                number = i;
            }
        }
        return number;
    }

    private static int getMaxWordAndItCount(String seq) {
        seq = seq.toLowerCase();
        Pattern pattern = Pattern.compile("[ ,:()\"-']+");
        words = pattern.split(seq);

        int tempInt[] = new int[words.length];
        String tempStr[] = new String[words.length];
        for (String w : words) {
            for (int i = 0; i < words.length; i++) {
                if (w.equals(tempStr[i])) {
                    tempInt[i]++;
                    break;
                } else {
                    if (tempStr[i] == null) {
                        tempStr[i] = w;
                        break;
                    }
                }
            }
        }
        maxWord = tempStr[getNumberOfMaxElement(tempInt)];
        return tempInt[getNumberOfMaxElement(tempInt)];
    }

    public static void main(String[] args) {
        String text = "Чаще всего так называемый обычный пользователь, так работая с офисными так программами, так работает с текстовым процессором. Именно при помощи программ этого класса готовят обычно разнообразные служебные документы. Не последнюю роль играют текстовые процессоры и для домашнего пользователя. Использование именно этих программ наилучшим образом отвечает взглядам (впрочем, несколько устаревшим) большинства современных пользователей на использование персонального компьютера, как развитой пишущей машинки. Эта ситуация вполне согласуется с уровнем развития современных текстовых процессоров (таких, например, как OpenOffice Writer), которые взгляду начинающего пользователя предстают универсальными программами, чьи возможности по созданию документов покрывают разумные потребности простого смертного.\n" +
                "\n" +
                "Вместе с тем, работа пользователя компьютера с текстом не сводится только к использованию текстового процессора. Элементарные навыки работы с текстом могут пригодиться при создании сообщений для отправки по электронной почте, при создании компьютерных презентаций. С другой стороны, большинство форматов представления данных в памяти компьютера представляют из себя (на определённом уровне) именно текст.\n" +
                "\n" +
                "Всё, что было сказано выше, определяет, с одной стороны, значимость данной темы в курсе информационных технологий. При этом очевидно, что совершенно не обязательно сводить изучение её к знакомству с текстовыми процессорами.";
        System.out.println(text);
        printSequenceWithMaxWord(text);
    }
}
