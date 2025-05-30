public class Personaje {
    protected String nombre;
    protected int fuerza;
    protected int velocidad;
    protected int vida_hp;

    public Personaje(String nombre, int fuerza, int velocidad, int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }

    public void atacar(Personaje oponente) {
        oponente.vida_hp -= this.fuerza;
        System.out.println(this.nombre + " ha atacado a " + oponente.nombre + " causando " + this.fuerza + " de daño.");
    }

    public void defender(int danoRecibido) {
        int danoMitigado = danoRecibido / 2;
        this.vida_hp -= danoMitigado;
        System.out.println(this.nombre + " ha defendido y solo ha recibido " + danoMitigado + " de daño.");
    }

    public void recuperarse() {
        this.vida_hp += 20; 
        System.out.println(this.nombre + " se ha recuperado y ahora tiene " + this.vida_hp + " puntos de vida.");
    }

    public void mostrarEstadisticas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Vida HP: " + vida_hp);
    }
}
