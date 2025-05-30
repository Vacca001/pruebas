import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        SuperHero spiderman = new SuperHero("Spiderman", 80, 70, 200);
        SuperHero iron = new SuperHero("Iron Man", 90, 70, 220);
        SuperHero hulk = new SuperHero("Hulk", 90, 50, 210);

        Villano batman = new Villano("Batman", 50, 75, 200);
        Villano superman = new Villano("Superman", 90, 70, 250);
        Villano linterna = new Villano("Linterna Verde", 80, 70, 220);

        
        SuperHero[] heroes = { spiderman, iron, hulk };
        Villano[] villanos = { batman, superman, linterna };

        
        System.out.println("Elige tu héroe:");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println((i + 1) + ". " + heroes[i].nombre);
        }
        int eleccionHeroe = scanner.nextInt();
        SuperHero heroeElegido = heroes[eleccionHeroe - 1];

        
        System.out.println("Elige el villano a enfrentar:");
        for (int i = 0; i < villanos.length; i++) {
            System.out.println((i + 1) + ". " + villanos[i].nombre);
        }
        int eleccionVillano = scanner.nextInt();
        Villano villanoElegido = villanos[eleccionVillano - 1];

        
        heroeElegido.mostrarEstadisticas();
        villanoElegido.mostrarEstadisticas();

        
        while (heroeElegido.vida_hp > 0 && villanoElegido.vida_hp > 0) {
            System.out.println("\nElige la acción de tu héroe:");
            System.out.println("1. Atacar");
            System.out.println("2. Defender");
            System.out.println("3. Recuperarse");
            System.out.println("4. Mostrar estadísticas");

            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("¿Quieres usar poder extra? (si/no): ");
                    String usarPoderExtra = scanner.next();
                    if (usarPoderExtra.equalsIgnoreCase("si")) {
                        System.out.println("Introduce la cantidad de poder extra: ");
                        int poderExtra = scanner.nextInt();
                        heroeElegido.atacar(villanoElegido, poderExtra);
                    } else {
                        heroeElegido.atacar(villanoElegido);
                    }
                    break;
                case 2:
                    System.out.println("Defenderse contra el ataque del villano.");
                    heroeElegido.defender(villanoElegido.fuerza);
                    break;
                case 3:
                    heroeElegido.recuperarse();
                    break;
                case 4:
                    heroeElegido.mostrarEstadisticas();
                    villanoElegido.mostrarEstadisticas();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            
            if (villanoElegido.vida_hp > 0) {
                System.out.println("\nEs el turno del villano.");
                villanoElegido.atacar(heroeElegido);
                if (heroeElegido.vida_hp <= 0) {
                    System.out.println(heroeElegido.nombre + " ha sido derrotado.");
                    break;
                }
            } else {
                System.out.println(villanoElegido.nombre + " ha sido derrotado.");
            }

            
            heroeElegido.mostrarEstadisticas();
            villanoElegido.mostrarEstadisticas();
        }

        
        System.out.println("¡Fin del juego!");
        scanner.close();
    }
}
