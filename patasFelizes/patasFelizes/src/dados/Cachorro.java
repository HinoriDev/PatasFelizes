package dados;

public class Cachorro extends Animal {

    @Override
    public String emitirSom() {
        return "Latido: Au Au! | Rosnado: Grrrrr! | Uivo: Auuuuuuuuu!  | Ganido: Nhiii! ";
    }

    @Override
    public String getEspecie() {
        return "Canino";
    }
}