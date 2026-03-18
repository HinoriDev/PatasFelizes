package dados;

public class Gato extends Animal {

    @Override
    public String emitirSom() {
        return "Miau! | Ronronar: Prrrr! | Bufar: Fsssssss! | Rosnar: Rrrrrr! ";
    }

    @Override
    public String getEspecie() {
        return "Felino";
    }
}