//Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int). Forneça um construtor que inicializa as três variáveis de instância e suponha que os valores fornecidos estejam corretos. Forneça um método set e um get para cada variável de instância. Forneça um método displayDate que exibe o mês, o dia e o ano separados por barras normais (/). Escreva um aplicativo de teste chamado DateTest que demonstra as capacidades da classe Date.
package atividade4;

public class at4 {
    private int mes;  // Mês da data
    private int dia;  // Dia da data
    private int ano;  // Ano da data

    public at4(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getMes() {
        return mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getDia() {
        return dia;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
    public void displayDate() {
        System.out.printf("%02d/%02d/%d%n", mes, dia, ano);
    }
}
