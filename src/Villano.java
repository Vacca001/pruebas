public class Villano extends Personaje {

    public Villano(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    @Override
    public void atacar(Personaje oponente) {
        int danoDuplicado = this.fuerza * 2;
        oponente.vida_hp -= danoDuplicado;
        System.out.println(this.nombre + " ha hecho trampa y ha duplicado su ataque, causando " + danoDuplicado + " de daño.");
    }
}
