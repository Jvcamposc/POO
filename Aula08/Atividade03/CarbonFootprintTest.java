package Aula08.Atividade03;

import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {
        // Criando objetos de Building, Car e Bicycle
        Building building = new Building("Edifício Comercial", 50000);  // Exemplo: 50.000 kWh por ano
        Car car = new Car("Fusca", 1000);  // Exemplo: 1000 litros de combustível por ano
        Bicycle bicycle = new Bicycle("Caloi", 20);  // Exemplo: 20 kg de CO2 pela fabricação

        // Adicionando os objetos em um ArrayList de CarbonFootprint
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(building);
        carbonFootprints.add(car);
        carbonFootprints.add(bicycle);

        // Iterando sobre o ArrayList e exibindo as pegadas de carbono
        for (CarbonFootprint item : carbonFootprints) {
            System.out.println("Descrição: " + item.getClass().getSimpleName());
            if (item instanceof Building) {
                Building b = (Building) item;
                System.out.println("Nome do edifício: " + b.getName());
            } else if (item instanceof Car) {
                Car c = (Car) item;
                System.out.println("Modelo do carro: " + c.getModel());
            } else if (item instanceof Bicycle) {
                Bicycle bi = (Bicycle) item;
                System.out.println("Marca da bicicleta: " + bi.getBrand());
            }
            System.out.println("Pegada de carbono: " + item.getCarbonFootprint() + " kg de CO2");
            System.out.println(); // Linha em branco
        }
    }
}

