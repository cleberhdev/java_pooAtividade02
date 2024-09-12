// Classe da 2° Questão:
public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    void imprimir(){
        System.out.printf("Título: %s;\nAutor: %s;\nPáginas: %d;\n\n", this.titulo,  this.autor, this.paginas);
        // utiliza o this para referir os parametros da classe geral;
    }
}
