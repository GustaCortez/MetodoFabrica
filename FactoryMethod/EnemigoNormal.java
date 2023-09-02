

// Implementa el enemigo normal
class EnemigoNormal implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("Enemigo ataca!");

    }

    @Override
    public void recibirDaño(int cantidad) {
        System.out.println("Enemigo recibe " + cantidad + " de daño");

    }
}



