package dia4;

import java.util.Scanner;

//juego de pim

public class pimm {
    //declarar instancias
    int a, b, c;

    //constructor por default
    public pimm() {
        a = 3;
        b = 4;
        c = 5;
    }

    //declaramos en privado el nombre del jugador 1
    private String nombreJugador1;
    
    //declaramos en privado el nombre del jugador 2
    private String nombreJugador2;

    //metodos 
    //set y get para los nombres de los jugadores
    
    //jugador 1
    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    //jugador2
    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    //crear el main para el juego
    public static void main(String[] args) {
        //creamos un objeto de la clase pim
        pim p = new pim();
        int m=0;

        try (//pedimos al usuario que ingrese el nombre del jugador 1
        Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del jugador 1: ");
            String nombreJugador1 = scan.nextLine();
            p.setNombreJugador1(nombreJugador1);

            //pedimos al usuario que ingrese el nombre del jugador 2
            System.out.println("Ingrese el nombre del jugador 2: ");
            String nombreJugador2 = scan.nextLine();
            p.setNombreJugador2(nombreJugador2);

            //empezamos el juego
            System.out.println("Bienvenidos a PIM");
            System.out.println("El juego consiste en una partida de PIM");
            System.out.println("El jugador 1 es: " + nombreJugador1);
            System.out.println("El jugador 2 es: " + nombreJugador2);
            System.out.println("El juego comienza");
            
            //hacer el ciclo while
            int t=1;
            int d=12;
            while(d!=0){
                if (t%2==0){    
                   t=2;
                } else {
                    t=1;
                }
                System.out.println("Turno del jugador: "+t);

                //pedir la cantidad de numeros a eliminar
                System.out.println("Ingrese la cantidad de numeros a eliminar: ");
                m = scan.nextInt();
                scan.nextLine();

                //pedir a que pieza quiere quitar
                System.out.println("Ingrese a que pieza quitar:a ,b o c");
                String pieza = scan.nextLine();
                if (pieza.equals("a")) {
                    if (m>p.a) {
                        System.out.println("No puede quitar esa cantidad");
                        continue;
                    } else {
                        p.a=p.a-m;
                        t++;
                        d=d-m;
                    }
                } else if (pieza.equals("b")) {
                    if (m>p.b) {
                        System.out.println("No puede quitar esa cantidad");
                        continue;
                    } else {
                        p.b=p.b-m;
                        t++;
                        d=d-m;
                    }
                } else if (pieza.equals("c")) {
                    if (m>p.c) {
                        System.out.println("No puede quitar esa cantidad");
                        continue;
                    } else {
                        p.c=p.c-m;
                        t++;
                        d=d-m;
                    }
                }
                // cumplir el ciclo while
                if ((p.a==0) && (p.b==0) && (p.c==0)){
                    System.out.println("El jugador "+t+" gano");
                    break;
                }

                //imprimir el estado del juego
                System.out.println("La pila a tiene: " + p.a + " la pila b tiene: " + p.b + " la pila c tiene: " + p.c);
                
            }
        }
    }           
}