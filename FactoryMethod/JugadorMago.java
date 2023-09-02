//otros personajes y enemigos.

// Agrega más tipos de personajes
class JugadorMago implements Personaje {

    @Override
    public void atacar() {
        System.out.println("Jugador mago lanza un hechizo!");

    }

    @Override
    public void recibirDaño(int cantidad) {
        System.out.println("Jugador mago recibe " + cantidad + " de daño");

    }
}

