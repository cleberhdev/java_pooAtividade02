// Classe da 3° Questão:
public class ContaBancaria {
    String titular;
    float saldo;

    public ContaBancaria(String titular, float saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(float valor){
        this.saldo += valor;
        System.out.printf("Saldo de %s: R$%.2f;\n", this.titular, this.saldo);
    }
    void sacar(float valor){
        this.saldo -= valor;
        System.out.printf("Saldo de %s: R$%.2f;\n", this.titular, this.saldo);
    }
}
