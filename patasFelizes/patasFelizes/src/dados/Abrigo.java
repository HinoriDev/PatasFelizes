package dados;

import java.util.ArrayList;
import java.util.List;

public class Abrigo {

    private List<Animal> animais = new ArrayList<>();

    public void registrarAnimal(Animal animal){
        animais.add(animal);
    }

    public void listarAnimais(){

        for(Animal a : animais){
            System.out.println("Nome: " + a.getNome());
            System.out.println("Espécie: " + a.getEspecie());
            System.out.println("Som: " + a.emitirSom());
            System.out.println("Raça: " + a.getRaca());
            System.out.println("idade: " + a.getIdade());
            System.out.println("Status de adoção: " + a.getAdocao());
            System.out.println("Historico de saúde: " + a.getHistorico());
            System.out.println("--------------------");
        }

    }
}