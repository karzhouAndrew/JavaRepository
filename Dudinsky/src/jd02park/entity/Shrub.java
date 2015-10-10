package jd02park.entity;

public class Shrub extends Plant {

    private static final double deepeningInHole = .03;
    private static final double annualFertilizationGain = .05;

    public Shrub(PlantKindEnum kind, double height) {
        super(kind, height - deepeningInHole);
        System.out.print(height + "-metre-high " + kind + " has been displanted as a SHRUB: with ");
        System.out.println(deepeningInHole + "-metre deepening in hole, resultant height is " + (height - deepeningInHole));
    }

    @Override
    public void fertilize() {
        super.setHeight(super.getHeight() + annualFertilizationGain);
    }
}
