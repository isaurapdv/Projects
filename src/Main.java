public class Main {
    public static void usarunif() {
        int numeroIf = 30;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

    }

    public static void buclewhile() {
        int contador = 0;

        while (contador < 3) {
            System.out.println(contador);
            contador = contador + 1;
        }
    }

    public static void bucledowhile() {
        int numero = 2;

        do {
            numero++;
            System.out.println(numero);
        } while (numero < 3);

    }

    public static void buclefor() {
        for (int contador = 0; contador <= 3; contador = contador + 1) {
            System.out.println(contador);
        }
    }


    public static void switchestacion (){
        String estacion = "primavera";

        switch (estacion) {
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            default:
                System.out.println("El valor de la variable no es una estación válida");
                break;
        }

    }


    public static void switchestacionNovalida (){
        String estacion = "pp";

        switch (estacion) {
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            default:
                System.out.println("El valor de la variable no es una estación válida");
                break;
        }

    }

    public static void main(String[] args) {
        usarunif();
        buclewhile();
        bucledowhile();
        buclefor();
        switchestacion();
        switchestacionNovalida();
    }



}