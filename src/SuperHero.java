public class SuperHero extends Personaje {

    public SuperHero(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    @Override
    public void atacar(Personaje oponente) {
        super.atacar(oponente);
        System.out.println(this.nombre + " ha usado su ataque especial!");
    }

    
    public void atacar(Personaje oponente, int poderExtra) {
        int danoTotal = this.fuerza + poderExtra;
        oponente.vida_hp -= danoTotal;
        System.out.println(this.nombre + " ha atacado con poder extra, causando " + danoTotal + " de daño.");
    }
}
