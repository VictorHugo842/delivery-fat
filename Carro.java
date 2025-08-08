public class Carro {

    private String modelo;
    private String ano;
    private String placa;

    // Construtor para definir os valores
    public Carro(String modelo, String ano, String placa) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Veículo ligado: " + modelo + " " + ano + " " + placa);
    }
    
}
