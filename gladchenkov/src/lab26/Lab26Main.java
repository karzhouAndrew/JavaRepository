package lab26;

public class Lab26Main {
    public static void main(String[] args) {
        RandomList listEstimate = new RandomList();
        listEstimate.deleteBadEstimate(listEstimate.createRandomEstimateList(20));
    }
}
