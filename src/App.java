public class App {
    public static void main(String[] args) throws Exception {
        //1° Questão:
        Carro palio = new Carro("Fiat", "Palio", "prata", 2002, 5000);
        System.out.println(palio.marca);
        System.out.println(palio.modelo);
        System.out.println(palio.cor);
        System.out.println(palio.ano);
        System.out.println(palio.preco + "\n");
        //Classe associada -> Carro.java
        //Fim 1° Questão!

        //2° Questão:
        Livro gerald = new Livro("Último Desejo", "Cleitinho" , 256);
        gerald.imprimir();
        //Classes associada -> Livro.java
        //Fim 2° Questão!
        
        //3° Questão:
        ContaBancaria cleitinho = new ContaBancaria("Cleitinho do Pneu", 0);
        cleitinho.depositar(50);
        cleitinho.sacar(5);
        //Classes associada -> ContaBancaria.java
        //Fim 3° Questão!
    }   
}
