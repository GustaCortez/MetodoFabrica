
// Implementa la fábrica concreta para el jugador guerrero
class FabricaGuerrero extends FabricaPersonajes {
    public Personaje crearPersonaje() {
        return new JugadorGuerrero();
    }
}