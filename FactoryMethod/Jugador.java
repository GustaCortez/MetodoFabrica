 class Jugador implements Personaje{
     // Implementa el jugador que controla el personaje

     private int hp;

     private int nivel;
     @Override
     public void atacar() {

             System.out.println("Jugador ataca!");

     }

     @Override
     public void recibirDaño(int cantidad) {
         System.out.println("Jugador recibe " + cantidad + " de daño");

     }


}
