public class Filme {
    private String titulo;
    private String genero;
    private int ano;
    private String diretor;
    private String ator;
    private int numAcessos;
    private double avaliacao;

    public String getTitulo(){
        return this.titulo;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getAno(){
        return this.ano;
    }
    public String getDiretor(){
        return this.diretor;
    }
    public String getAtor(){
        return this.ator;
    }
    public int getNumAcessos(){
        return this.numAcessos;
    }
    public double getAvaliacao(){
        return this.avaliacao;
    }
    
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public void setAtor(String ator){
        this.ator = ator;
    }
    public void setAcesso(int acesso){
        this.numAcessos = acesso;
    }
    public void setAvaliacao(double avaliacao){
        if(avaliacao < 0 || avaliacao > 5){
            System.out.println("Formato de avaliacao invalido");
        }else{
            this.avaliacao = avaliacao;
        }
    }
}
