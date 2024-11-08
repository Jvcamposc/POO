package Aula08.Atividade03;

public class Bicycle implements CarbonFootprint {
    private String brand;
    private double manufacturingCO2; // Emissão de CO2 pela fabricação da bicicleta (em kg)

    public Bicycle(String brand, double manufacturingCO2) {
        this.brand = brand;
        this.manufacturingCO2 = manufacturingCO2;
    }

    @Override
    public double getCarbonFootprint() {
        return manufacturingCO2; // Pegada de carbono baseada na fabricação
    }

    public String getBrand() {
        return brand;
    }
}
