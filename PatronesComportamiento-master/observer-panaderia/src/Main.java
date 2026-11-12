public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       BIENVENIDOS A LA PANADERIA");
        System.out.println("========================================");



        Panaderia panaderia = new Panaderia();


        System.out.println("\n========================================");
        System.out.println("          REGISTRO DE VECINOS");
        System.out.println("========================================");


    
        Vecino vecino1 = new Vecino("Carlos", panaderia);
        Vecino vecino2 = new Vecino("Maria", panaderia);
        Vecino vecino3 = new Vecino("Juan", panaderia);


        System.out.println("\n========================================");
        System.out.println("       SUSCRIPCION DE LOS VECINOS");
        System.out.println("========================================");


  
        panaderia.suscribir(vecino1);
        System.out.println("Carlos se ha suscrito correctamente.");

        panaderia.suscribir(vecino2);
        System.out.println("Maria se ha suscrito correctamente.");

        panaderia.suscribir(vecino3);
        System.out.println("Juan se ha suscrito correctamente.");


        System.out.println("\n========================================");
        System.out.println("          ESTADO DE LA PANADERIA");
        System.out.println("========================================");


        // Comprobamos si hay pan disponible
        System.out.println("¿Hay pan caliente?");
        System.out.println(panaderia.hay_Pan()
                ? "Si, hay pan disponible."
                : "No, todavia no hay pan.");


        System.out.println("\n========================================");
        System.out.println("          SALE EL PAN CALIENTE");
        System.out.println("========================================");



        panaderia.sacarPan();


    }
}

