package lab16;

//подсчитать количество знаков препинания

public class Lab16 {
    public static void main(String[] args) {
        String str = "Тестовая, строка, с несколькими,, запятыми";
        int j = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if ((symbol == ',') || (symbol == '.')
                    || (symbol == ';') || (symbol == ':')) {
                j++;
            }
        }
        System.out.println("У нас есть " + j + " знаков препинания");
    }
}

