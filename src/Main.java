import javax.swing.*;

public class
Main {


    public static void main(String[] args) {
      //Classa objeto    Construtor
      Turista mochileiro = new Turista();
      //Definir formato do objeto
        mochileiro.setNome("Lindsay");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista("Maria");
        // Definir comportamento
         String retorno = mochileiro.viajar();
        System.out.println(retorno);

        //Criar um novo objeto
        Turista outroTurista = new Turista ();
        String nome = JOptionPane.showInputDialog("Entre com seu nome:");
        outroTurista.setNome(nome);
        JOptionPane.showMessageDialog(null ,"O nome digitado foi"+
                outroTurista.getNome());

        //Criar a captura do CPF deste objeto
        String cpf = JOptionPane.showInputDialog(null,"Digite seu cpf:");
               if(Validacao.cpf(cpf))
                   outroTurista.setCpf(cpf);
                           else
                               System.out.println("ERRO CPF NÃO VALIDADO!");
        JOptionPane.showMessageDialog(null , outroTurista.getCpf()
        +"validado!");






    }
}