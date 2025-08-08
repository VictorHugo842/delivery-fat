class One {
    public static void main(String[] args) {
        System.out.println("Main class");

        Car carro = new Car("Golf", "2012", "ABC-1234");
        carro.start();
    }
}

class Car {
    private String modelo;
    private String ano;
    private String placa;

    public Car(String modelo, String ano, String placa) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public void start() {
        if (!modelo.isEmpty() && !ano.isEmpty() && !placa.isEmpty()) {
            System.out.println("Vehicle info: " + modelo + " " + ano + " " + placa);
        } else {
            System.out.println("Dados incompletos do veículo.");
        }
        System.out.println("This is JAVA my friend! :)");
    }
}
