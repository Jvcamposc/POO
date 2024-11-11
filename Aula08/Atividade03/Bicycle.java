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
