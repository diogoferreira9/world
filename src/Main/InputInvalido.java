package Main;

// Classe que representa informações sobre entradas inválidas em um ficheiro
public class InputInvalido {
    String nomeFicheiro;         // Nome do ficheiro
    int linhasValidas;           // Número de linhas válidas no ficheiro
    int linhasInvalidas;         // Número de linhas inválidas no ficheiro
    int primeiraLinhaInvalida;   // Número da primeira linha inválida encontrada no ficheiro

    // Construtor que inicializa todos os atributos com os valores fornecidos
    public InputInvalido(String nomeFicheiro, int linhasValidas, int linhasInvalidas, int primeiraLinhaInvalida) {
        this.nomeFicheiro = nomeFicheiro;
        this.linhasValidas = linhasValidas;
        this.linhasInvalidas = linhasInvalidas;
        this.primeiraLinhaInvalida = primeiraLinhaInvalida;
    }



    // toString para retornar a representação em string do objeto InputInvalido
    @Override
    public String toString() {
        return nomeFicheiro + " | " + linhasValidas + " | " + linhasInvalidas + " | " + primeiraLinhaInvalida;
    }
}