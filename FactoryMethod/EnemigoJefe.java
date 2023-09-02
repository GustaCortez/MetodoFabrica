// Agrega más tipos de enemigos
class EnemigoJefe implements Enemigo {

    @Override
    public void atacar() {
        System.out.println("Enemigo jefe ejecuta un ataque poderoso!");

    }

    @Override
    public void recibirDaño(int cantidad) {
        System.out.println("Enemigo jefe recibe " + cantidad + " de daño");

    }
}

