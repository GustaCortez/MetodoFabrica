

// Define la fábrica abstracta para crear enemigos
abstract class FabricaEnemigos {
    private int hp;
    private int nivel;
    abstract Enemigo crearEnemigo();
}