package Vinhicola;

import javax.jws.WebService;

@WebService(endpointInterface = "Vinhicola.VinhicolaServer")
public class VinhicolaServerpl implements VinhicolaServer {
    @Override
    public Vinho cadastrarVinho(Long id, String nome, Float preco){
        Vinho vinho = new Vinho();
        vinho.setId(id);
        vinho.setNome(nome);
        vinho.setPreco(preco);
        System.out.print("====> O vinho cadastrado foi: " + vinho.getNome());
        return vinho;
    }

    @Override
    public Vinho pesquisarPreco(String nome){
        Vinho vinho1 = new Vinho();
        vinho1.setId(1l);
        vinho1.setNome("Vinho1");
        vinho1.setPreco(200.00F);

        Vinho vinho2 = new Vinho();
        vinho2.setId(2L);
        vinho2.setNome("Vinho2");
        vinho2.setPreco(500.00F);

        if (vinho1.getNome().equals(nome)){
            System.out.println("====> O vinho procurado foi: " + vinho1.getNome());
            return vinho1;
        } else if (vinho2.getNome().equals(nome)){
            System.out.println("====> O vinho procurado foi: " + vinho2.getNome());
            return vinho2;
        }
    }

}
