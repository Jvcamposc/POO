/*Usando as interfaces você pode especificar comportamentos semelhantes para as classes
possivelmente díspares. Governos e empresas em todo o mundo estão cada vez mais
preocupados com as pegadas de carbono (liberações anuais de dióxido de carbono na
atmosfera) a partir de edifícios que queimam vários tipos de combustíveis para aquecimento,
veículos que queimam combustíveis para obter energia etc. Muitos cientistas culpam esses
gases do efeito estufa pelo fenômeno chamado de aquecimento global. Crie três classes
pequenas não relacionadas por meio de herança — as classes Building, Car e Bicycle. Dê a
cada classe alguns atributos e comportamentos adequados únicos que ela não tem em comum
com outras classes. Escreva uma interface de CarbonFootprint com um método
getCarbonFootprint . Faça com que cada uma das suas classes implemente essa interface para
que o método getCarbonFootprint calcule uma pegada de carbono adequada para essa classe
(confira alguns sites que explicam como calcular pegadas de carbono). Escreva um aplicativo
que cria objetos de cada uma das três classes, insere referências a esses objetos em
ArrayList<CarbonFootprint> , então itera pelo ArrayList polimorficamente invocando o método
getCarbonFootprint de cada objeto. Para cada objeto, imprima algumas informações de
identificação e a pegada de carbono do objeto. */
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

