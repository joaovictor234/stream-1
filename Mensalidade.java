public class Mensalidade {
    private double saldoCliente;
    public void Pagamento(String tipo, double valor, double valorFilme){
        if(valor == 0){
            this.saldoCliente -= valorFilme;
        }else if(tipo == "credito" || tipo == "debito" || tipo == "boleto" || tipo == "pre pago" || tipo == "TED" || tipo == "PIX"){
            if(valor > valorFilme){
                double troco;
                troco = valor - valorFilme;
                this.saldoCliente += troco;
            }
            if(saldoCliente == valorFilme){
                System.out.println("Voce tem um saldo equivalente a um preco de um filme");
                this.saldoCliente = 0;
            }    

        }
    }
    public double getSaldoCliente(){
        return this.saldoCliente;
    }
}
