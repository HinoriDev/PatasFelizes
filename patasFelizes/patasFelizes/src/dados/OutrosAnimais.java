package dados;

public class OutrosAnimais extends Animal {

    @Override
    public String emitirSom() {
        return "Som de animal desconhecido";
    }

    @Override
    public String getEspecie() {
        return "Outro";
    }
}