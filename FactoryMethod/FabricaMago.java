

    // Implementa la fábrica concreta para el jugador mago
    class FabricaMago extends FabricaPersonajes {
        public Personaje crearPersonaje() {

            return new JugadorMago();
        }
    }

