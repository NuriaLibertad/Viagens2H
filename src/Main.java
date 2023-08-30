public class Main {
    public static void main(String[] args) {
      //Classa objeto    Construtor
      Turista mochileiro = new Turista();
      //Definir formato do objeto
        mochileiro.setNome("Lindsay");
        mochileiro.setCpf(Validacao.cpf("123"));
        Turista mochileira = new Turista("Maria");
        // Definir comportamento
         String retorno = mochileiro.viajar();
        System.out.println(retorno);






    }
}