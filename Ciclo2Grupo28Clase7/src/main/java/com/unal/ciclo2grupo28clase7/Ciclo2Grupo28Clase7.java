package com.unal.ciclo2grupo28clase7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase7 {

    public static void main(String[] args) {

        /*
        char c[] = {'M', 'i', 's', 'a', 'e', 'l', 'Z'};
        //           0    1    2    3    4    5    6
        String string = "Mis\u0061el";
        String nombre = new String(c);//constructor con entrada char array
        String edad = String.valueOf(12);
        String apellido = "Perilla Ben\u00EDtez";
        //            #012345
        System.out.println(nombre + "\n" + apellido);

        
        // Declarar el objeto einicializa
        Scanner sc = new Scanner(System.in);
        // lee una cadena
        String miCadena = sc.nextLine();//Leer desde el teclado y convertir a String
        // Imprime la cadena leida
        System.out.println(miCadena);
         */
        //compararStrings();
        //compararDosStrings();

        /*
        String s1 = "Buenas";
        String s2 = "Buenas";
        System.out.println(s2 == s1);//si funciona en Java 17
         */
        //contenencia();
        //separar();
        //separarLinea();
        //ocurrenciadeXletra();
        //cuentaConsonantes();
        invertir();

    }

    public static void compararStrings() {
        String a = "hola";
        String b = "hola";
        String c = "HOLA";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
    }

    public static void compararDosStrings() {
        // Declararelobjetoeinicializa
        Scanner sc = new Scanner(System.in);
        // lee cadena 1
        String miCadena1 = sc.nextLine();
        // lee cadena 2
        String miCadena2 = sc.nextLine();
        // Imprime true o false
        System.out.println(miCadena1.equals(miCadena2));
    }

    public static void contenencia() {
        String a = "hola Jorge " + 40;
        String b = "40";
        System.out.println(a.contains(b));
        System.out.println(a.length());
        System.out.println(a.charAt(5));
        System.out.println(a.substring(6, 12));//desde cual y el segundo hasta antes
    }

    public static void separar() {
        String s = "Juan 30 1.68";
        String[] line = s.split(" ");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");

    }

    public static void separarLinea() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] line = s.split("&");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");
    }

    public static void ocurrenciadeXletra() {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite una cadena de caracteres:");
        String original = t.nextLine();
        System.out.println("Digite un caracter:");
        String caracter = t.nextLine();
        int ocurrencia = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == caracter.charAt(0)) {
                ocurrencia++;
            }
        }
        System.out.println("La letra '" + caracter + "' esta " + ocurrencia
                + " veces en la frase '" + original + "'");
    }

    public static void cuentaConsonantes() {
        Scanner t = new Scanner(System.in);
        String consonantes = "cbdfghjklmnpqrstvwxyz";
        System.out.println("Digite una cadena de caracteres:");
        String frase = t.nextLine();
        int cuenta = 0;
        for (int i = 0; i < frase.length(); i++) {
            String temp = String.valueOf(frase.charAt(i));//extrae caracter por caracter
            if (consonantes.contains(temp.toLowerCase())) {//convierte en minuscula el caracter y 
                //lo busca en el String de consonantes
                cuenta++;
            }
        }
        System.out.println("hay " + cuenta + " consonantes.");
    }

    public static void invertir() {
        Scanner t = new Scanner(System.in);
        String consonantes = "cbdfghjklmnpqrstvwxyz";
        System.out.println("Digite una cadena de caracteres:");
        String frase = t.nextLine();
        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida=fraseInvertida+frase.charAt(i);
        }
        System.out.println("La frase: \n"+frase+"\n invertida es:\n"+fraseInvertida);
    }
}
