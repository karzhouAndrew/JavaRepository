package stringExtraTask7;

/**
 * Created by dmitry on 12.5.15.
 */
public class DeleteWordLength {
    public static void main(String[] args) {
        String str = "Название файла играет очень важную роль в Java." +
                " Компилятор Java требует, чтобы мы использовали расширение Java.";
        String newStr = str.replaceAll("\\b[a-zA-Zа-яА-Я]{4,4}\\b", "");
        System.out.println(newStr);
    }
}

