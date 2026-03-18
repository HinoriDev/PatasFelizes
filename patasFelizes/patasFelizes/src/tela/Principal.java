package tela;

import dados.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Abrigo abrigo = new Abrigo();

        int opcao;

        while(true){System.out.println("=== ABRIGO PATAS FELIZES ===");
            System.out.println("1 - Registrar cachorro");
            System.out.println("2 - Registrar gato");
            System.out.println("3 - Registrar outro animal");
            System.out.println("4 - Listar animais");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){

                case 1:

                    Cachorro c = new Cachorro();

                    System.out.println("Espécie:");
                    c.setEspecie(sc.nextLine());

                    System.out.println("Nome do cachorro:");
                    c.setNome(sc.nextLine());

                    System.out.println("Idade:");
                    c.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Raça:");
                    c.setRaca(sc.nextLine());

                    System.out.println("Historico de saúde:");
                    c.setHistorico(sc.nextLine());

                    System.out.println("Status de adoção:");
                    c.setAdocao(sc.nextLine());

                    abrigo.registrarAnimal(c);

                    System.out.println("Cachorro registrado!");

                    break;

                case 2:

                    Gato g = new Gato();

                    System.out.println("Espécie:");
                    g.setEspecie(sc.nextLine());

                    System.out.println("Nome do gato:");
                    g.setNome(sc.nextLine());

                    System.out.println("Idade:");
                    g.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Raça:");
                    g.setRaca(sc.nextLine());

                    System.out.println("Historico de saúde:");
                    g.setHistorico(sc.nextLine());

                    System.out.println("Status de adoção:");
                    g.setAdocao(sc.nextLine());

                    abrigo.registrarAnimal(g);

                    System.out.println("Gato registrado!");

                    break;

                case 3:

                    OutrosAnimais o = new OutrosAnimais();

                    System.out.println("Espécie:");
                    o.setEspecie(sc.nextLine());

                    System.out.println("Nome do animal:");
                    o.setNome(sc.nextLine());

                    System.out.println("Idade:");
                    o.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Raça:");
                    o.setRaca(sc.nextLine());

                    System.out.println("Historico de saúde:");
                    o.setHistorico(sc.nextLine());

                    System.out.println("Status de adoção:");
                    o.setAdocao(sc.nextLine());

                    abrigo.registrarAnimal(o);

                    System.out.println("Animal registrado!");

                    break;

                case 4:

                    abrigo.listarAnimais();

                    break;

                case 5:

                    System.out.println("Encerrando sistema...");
                    return;
            }
        }

    }

}