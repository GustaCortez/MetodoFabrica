public class JugadorGuerrero extends FabricaPersonajes implements Personaje{
    @Override
    Personaje crearPersonaje() {
        return null;
    }

    @Override
    public void atacar() {
        System.out.println("Jugador gerrero lanza un espadazo!");


    }

    @Override
    public void recibirDaño(int cantidad) {
        System.out.println("Jugador arquero recibe " + cantidad + " de daño");

    }
}
