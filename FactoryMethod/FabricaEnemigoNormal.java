
// Implementa la fábrica concreta para enemigos normales
class FabricaEnemigoNormal extends FabricaEnemigos {
    public Enemigo crearEnemigo() {
        return new EnemigoNormal();
    }
}