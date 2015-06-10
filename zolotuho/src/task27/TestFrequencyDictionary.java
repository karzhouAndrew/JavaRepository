package task27;

public class TestFrequencyDictionary {
    public static void main(String[] args) {
        String string = "qwe asd jjjjj kkkkk jjjjj, qwe qwe  qweqwe poi kjrj hjjh qwe";
        System.out.println("Text");
        System.out.println(string);
        FrequencyDictionary frequencyDictionary = new FrequencyDictionary();
        frequencyDictionary.makeFrequencyDictionary(string);
        frequencyDictionary.showFrequencyDictionary();
    }
}
