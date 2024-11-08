package Aula08.Atividade03;

public class Car implements CarbonFootprint {
    private String model;
    private double fuelConsumed; // Consumo de combustível em litros por ano

    public Car(String model, double fuelConsumed) {
        this.model = model;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double getCarbonFootprint() {
        double emissionFactor = 2.31; // Emissão média de CO2 por litro de combustível (em kg)
        return fuelConsumed * emissionFactor; // Pegada de carbono em kg de CO2
    }

    public String getModel() {
        return model;
    }
}
