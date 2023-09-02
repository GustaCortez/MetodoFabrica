public class ClasePrincipal {
    // Clase principal
    public static class Main {
        public static void main(String[] args) {
            FabricaPersonajes fabricaJugador = new FabricaMago(); // Selecciona la fábrica de jugadores
            Personaje jugador = fabricaJugador.crearPersonaje();
            jugador.atacar();
            jugador.recibirDaño(10);

            FabricaEnemigos fabricaEnemigo = new FabricaEnemigoNormal(); // Selecciona la fábrica de enemigos
            Enemigo enemigo = fabricaEnemigo.crearEnemigo();
            enemigo.atacar();
            enemigo.recibirDaño(15);

            // Interacción entre jugador y enemigo
            System.out.println("----- Interacción entre jugador y enemigo -----");
            jugador.atacar();
            enemigo.recibirDaño(20);
            enemigo.atacar();
            jugador.recibirDaño(25);
        }
    }
}

