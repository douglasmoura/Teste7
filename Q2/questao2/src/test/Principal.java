package test;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("João", 15));
        pessoas.add(new Pessoa("Leandro", 21));
        pessoas.add(new Pessoa("Paulo", 17));
        pessoas.add(new Pessoa("Jessica", 18));

        Integer cont= 1;

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Nome na lista "+cont+": "+pessoas.get(i).getNome());
            cont++;
        }
            for (int i = 0; i < pessoas.size(); i++) {

                if (pessoas.get(i).getIdade() < 18) {
    
                    pessoas.remove(i);
                }
            }

            System.out.println("Ainda existe "+pessoas.size()+" nomes na fila: "+pessoas.get(0).getNome()+ " e "+pessoas.get(1).getNome());

      
    }

    
}
