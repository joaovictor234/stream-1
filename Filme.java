public class Filme {
    //atributos
    private String titulo;
    private String genero;
    private int anoDeLancamento;
    private String diretor;
    private String atorPrincipal;
    private double avaliacao;
    private double preco;
    private int qtdEstoque;

    //construtores
    Filme(String titulo, String genero, int anoDeLancamento, String diretor, String atorPrincipal, double avaliacao, double preco, int qtdEstoque){
        this.titulo = titulo;
        this.genero = genero;
        this.anoDeLancamento = anoDeLancamento;
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.avaliacao = avaliacao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    //métodos
    public String getTitulo(){
        return this.titulo;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getAnoDeLancamento(){
        return this.anoDeLancamento;
    }
    public String getDiretor(){
        return this.diretor;
    }
    public String getAtorPrincipal(){
        return this.atorPrincipal;
    }
    public double getAvaliacao(){
        return this.avaliacao;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getQtdEstoque(){
        return this.qtdEstoque;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setAnoDeLancamento(int ano){
        this.anoDeLancamento = ano;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public void setAtorPrincipal(String ator){
        this.atorPrincipal = ator;
    }
    public void setAvaliacao(double avaliacao){
        if(avaliacao < 0 && avaliacao > 5){
            System.out.println("A avaliacao inserida esta incorreta!! Informe uma nota de 0 a 5");
        }else{
            this.avaliacao = avaliacao;
        }
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQtdEstoque(int qtd){
        this.qtdEstoque = qtd;
    }

    public void imprimirFilmes(Filme[] filme){
        for(int i = 0; i < filme.length; i++){
            System.out.println("--------------------");
            System.out.println("Titulo: " + filme[i].getTitulo());
            System.out.println("Gênero: " + filme[i].getGenero());
            System.out.println("Ano de lançamento: " + filme[i].getAnoDeLancamento());
            System.out.println("Diretor: " + filme[i].getDiretor());
            System.out.println("Ator principal: " + filme[i].getAtorPrincipal());
            System.out.println("Avaliação: " + filme[i].getAvaliacao());
            System.out.println("Preço: " + filme[i].getPreco());
            System.out.println("Quantidade disponível: " + filme[i].getQtdEstoque());
            System.out.println("--------------------");
        }
    }
}
