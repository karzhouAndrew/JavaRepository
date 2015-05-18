package work.laba4;

//

public class TestFindWord {
    public static void main(String[] args) {
        String strExample = "Some scientists decided to do the following experiments on a dog. \n" +
                "\n" +
                "For the first experiment, they cut one of the dog's legs off, then they told the dog to walk. " +
                "The dog got up and walked, so they they learned that a dog could walk with just three legs. \n" +
                "\n" +
                "For the second experiment, they cut off a second leg from the dog, then they told the dog once " +
                "more to walk. The dog was still able to walk with only two legs. \n" +
                "\n" +
                "For the third experiment, they cut off yet another leg from the dog and once more they told the " +
                "dog to walk. However, the dog wasn't able to walk with only one leg. \n" +
                "\n" +
                "As a result of these three experiments, the scientists wrote in their final report that the dog " +
                "had lost it's hearing after having three legs cut off. \n" +
                "Submitted by:Idrissi Mouhssine\n" +
                "What is the longest word in the English language? \n" +
                "SMILES: there is a mile between the first and last letters!\" ";
        int sizeWord = 7;
        System.out.println(FindWordInInterrogativeSentence.getWords(strExample,sizeWord));
    }
}

