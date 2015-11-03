package jd02park.entity;

public class Tree extends Plant {

    private static final double deepeningInHole = .05;
    private static final double annualFertilizationGain = .1;

    public Tree(PlantKindEnum kind, double height) {
        super(kind, height - deepeningInHole);
        System.out.print(height + "-metre-high " + kind + " has been displanted as a TREE: with ");
        System.out.println(deepeningInHole + "-metre deepening in hole, resultant height is " + (height - deepeningInHole));
    }

    @Override
    public void fertilize() {
        super.setHeight(super.getHeight() + annualFertilizationGain);
    }
}
