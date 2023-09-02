class JugadorArquero implements Personaje {

    @Override
    public void atacar() {
        System.out.println("Jugador arquero dispara una flecha!");
    }

    @Override
    public void recibirDaño(int cantidad) {
        System.out.println("Jugador arquero recibe " + cantidad + " de daño");
    }
}

