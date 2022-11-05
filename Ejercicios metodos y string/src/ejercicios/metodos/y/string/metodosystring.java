package com.mycompany.ejerciciosmetodosystring;

/**
 *
 * @author salvador
 */
import java.util.Scanner;

public class Ejerciciosmetodosystring {

    public static void main(String[] args) {
        Scanner moly = new Scanner(System.in);
        boolean goku = true;
        do {//inicio do
            System.out.println("Bienvenido al menu!");
            System.out.println("1.Replace\n2.Factorial\n3.Mensajes\n4.Promedios\n5.Aprobados o reprobados\n6.Contains\n7.Salir");
            System.out.println("Ingrese una opcion disponible: ");
            int op = moly.nextInt();
            switch (op) {//inicio case
                case 1: {

                    String cadena;
                    Scanner cad = new Scanner(System.in);
                    System.out.println("Ingrese una cadena: ");
                    cadena = cad.nextLine();
                    Scanner caracteres = new Scanner(System.in);
                    char char_remplazar;
                    char char_nuevo;
                    System.out.println("Ingrese caracter que sera reemplazado en la cadena: ");
                    char_remplazar = caracteres.nextLine().charAt(0);
                    System.out.println("Ingrese caracter que sera el remplazo en la cadena: ");
                    char_nuevo = caracteres.nextLine().charAt(0);
                    System.out.println("la nueva cadena es : " + Replace(cadena, char_remplazar, char_nuevo));

                }//fin case 1

                break;
                case 2: {

                    System.out.println("Ingrese un numero: ");
                    int num = moly.nextInt();
                    System.out.println(fact(num) + " es el factorial de " + num);

                }//fin case 2

                break;

                case 3: {
                    String msj;
                    System.out.println("Ingrese una cadena : ");
                    Scanner cadenamsj = new Scanner(System.in);
                    msj = cadenamsj.nextLine();
                    mensajes(msj);

                }//fin case 3

                break;

                case 4: {

                    System.out.println(" El promedio es de : " + prom());

                }//fin case 4

                break;

                case 5: {
                    System.out.println("Ingrese nota : ");
                    int nota = moly.nextInt();
                    boolean aprobado = apb(nota);
                    if (aprobado == true) {
                        System.out.println("Aprobado");
                    } else {
                        System.out.println("Reprobado");
                    }
                    if (nota <= 0) {
                        System.out.println("La nota no puede ser un valor negativo");
                    } else if (nota > 100) {
                        System.out.println("La nota no puede ser mayor a 100");
                    }

                }//fin case 5

                break;
                case 6: {
                    System.out.println("Ingrese la cadena principal de texto : ");
                    Scanner cadena_p = new Scanner(System.in);
                    Scanner cadena_sec = new Scanner(System.in);
                    String cad_principal = cadena_p.nextLine();
                    System.out.println("Ingrese la cadena secundaria de texto : ");
                    String cad_sec = cadena_sec.nextLine();
                    boolean cont = contiene(cad_principal, cad_sec);
                    if (cont == true) {
                        System.out.println("La cadena principal contiene la cadena secundaria ");

                    } else {
                        System.out.println("La cadena principal no contiene a la cadena secundaria ");

                    }

                }//fin case 6
                break;
                case 7: {
                    goku = false;

                }

                default:
                    System.out.println("Opcion ingresada no es valida");
                    goku = false;

            }// fin case

        } while (goku != false);//fin do 
    }

    public static String Replace(String cadena, char char_remplazar, char char_nuevo) {//inicio metodo replace
        //String cadena;
        String cad_new = cadena.replace(char_remplazar, char_nuevo);
        System.out.println("Ingrese una cadena :");
        return cad_new;
        //cadena = cad.nextLine();
        //System.out.println(cadena.replace('a', 'i'));
        //System.out.println("Ingrese el caracter a remplazar de la cadena: ");
        //char char_remplazar= char.nextLine();
    }

    public static int fact(int n) {//inicio metodo factorial
        int factorial = 1;
        for (int i = 1; i <= n; i++) {

            factorial *= i;

        }
        return factorial;

    }//fin metodo factorial

    public static void mensajes(String msj) {//inicio metodo mensaje
        System.out.println(msj + " ha sido el mensaje ingresado");

    }//fin metodo mensaje

    public static int prom() {//inicio metodo promedio
        Scanner notas = new Scanner(System.in);
        System.out.println("Ingrese nota 1: ");
        int n1 = notas.nextInt();

        System.out.println("Ingrese nota 2: ");
        int n2 = notas.nextInt();

        System.out.println("Ingrese nota 3: ");
        int n3 = notas.nextInt();

        System.out.println("Ingrese nota 4: ");
        int n4 = notas.nextInt();

        int sum = n1 + n2 + n3 + n4 / 4;
        int prom = sum / 4;
        return prom;

    }//fin metodo promedio

    public static boolean apb(int nota) {//inicio metodo aprobado
        boolean aprobado = true;
        if (nota <= 60) {
            aprobado = false;
        } else if (nota <= 0) {
            System.out.println("La nota ingresada no puede ser menor a 0");
        }
        return aprobado;
    }//fin metodo aprobado

    public static boolean contiene(String cad_principal, String cad_secun) {//inicio metodo contiene
        boolean cont = false;
        if (cad_principal.contains(cad_secun)) {
            cont = true;
        }
        return cont;
    }//fin metodo contiene    

}
