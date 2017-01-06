package task27;

public class TestFrequencyDictionary {
    public static void main(String[] args) {
        String text = "qwe asd jjjjj kkkkk jjjjj,   qwe Qwe\n  qweqwe poi kjrj hjjh qwe";
        System.out.println("Text");
        System.out.println(text);
        FrequencyDictionary frequencyDictionary = new FrequencyDictionary();
        frequencyDictionary.makeFrequencyDictionary(text);
        frequencyDictionary.showFrequencyDictionary();
    }
}
