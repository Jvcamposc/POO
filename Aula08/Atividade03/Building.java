package Aula08.Atividade03;

public class Building implements CarbonFootprint {
    private String name;
    private double energyConsumed; // Energia consumida em kWh

    public Building(String name, double energyConsumed) {
        this.name = name;
        this.energyConsumed = energyConsumed;
    }

    @Override
    public double getCarbonFootprint() {
        double emissionFactor = 0.92; // Emissão média de CO2 por kWh (em kg)
        return energyConsumed * emissionFactor; // Pegada de carbono em kg de CO2
    }

    public String getName() {
        return name;
    }
}

