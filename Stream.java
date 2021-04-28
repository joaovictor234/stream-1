public class Stream {
    private String nomeStream;
    private Filme filme;

    public String getNomeStream(){
        return this.nomeStream;
    }
    public void setNomeStream(String stream){
        nomeStream = stream;
    }
    public void setFilme(String titulo, String genero, int ano, String diretor, String ator, int acesso, double avaliacao){
        this.filme = new Filme();
        this.filme.setTitulo(titulo);
        this.filme.setGenero(genero);
        this.filme.setAno(ano);
        this.filme.setDiretor(diretor);
        this.filme.setAtor(ator);
        this.filme.setAcesso(acesso);
        this.filme.setAvaliacao(avaliacao);
    }
    public void comprarFilme(){}
    public void ultimosLancamentos(){}
    public void filmesMaisVistos(){}
    public void filmesMaisBemAvaliados(){}
}
