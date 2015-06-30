package laba29;


public class TestVocabulary {
    public static void main(String[] args) {
        String testText = "A man was pulled over for driving too fast, even though he thought he was driving " +
                "just fine.\n" +
                "\n" +
                "Officer: You were speeding.\n" +
                "Man: No, I wasn't.\n" +
                "Officer: Yes, you were. I'm giving you a ticket.\n" +
                "Man: But I wasn't speeding.\n" +
                "Officer: Tell that to the judge! (The officer gives man the ticket.)\n" +
                "Man: Would I get another ticket if I called you a jerk?\n" +
                "Officer: Yes, you would.\n" +
                "Man: What if I just thought that you were?\n" +
                "Officer: I can't give you a ticket for what you think.\n" +
                "Man: Fine, I think you're a jerk! ";

        FrequencyVocabulary vocabulary = new FrequencyVocabulary();
        vocabulary.addTextToVocabulary(testText);
        System.out.println(vocabulary);
    }
}
