package Modulo_07_parte_04_Sobreescrita;

public class ExemploSobrescrita {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        veiculo.acelerar(); // Saída: Veículo acelerando
        carro.acelerar();   // Saída: Carro acelerando
        moto.acelerar();    // Saída: Moto acelerando
    }
}
