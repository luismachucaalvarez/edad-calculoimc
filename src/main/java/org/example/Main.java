package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.printf("##### Programa Cálculo de IMC #####");
        System.out.println("-----Bienvenido...-----");
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = lectura.next();
        System.out.println("Ingrese RUT: ");
        String rut = lectura.next();
        System.out.println("Ingrese edad: ");
        int edad = lectura.nextInt();
        System.out.println("Ingrese sexo: ");
        String sexo = lectura.next();
        System.out.println("Ingrese peso: ");
        int peso = lectura.nextInt();
        System.out.println("Ingrese altura: ");
        float altura = lectura.nextFloat();

        Persona persona = new Persona(nombre, edad, sexo, rut, peso, altura);

        String mayorDeEdad;
        if (persona.esMayorDeEdad(edad)){
            mayorDeEdad = "Mayor de edad, ya puedes beber alcohol";
        } else {
            mayorDeEdad = "Eres muy chico para beber alcohol";
        }

        String estadoSaludPersona;
        if (persona.calcularIMC(peso, altura) == -1) {
            estadoSaludPersona = "Bajo Peso.";
        } else if (persona.calcularIMC(peso, altura) == 1) {
            estadoSaludPersona = "Sobrepeso.";
        } else {
            estadoSaludPersona = "Saludable.";
        }

        System.out.println(persona.toString());
        System.out.println("¿Es mayor de edad: " + mayorDeEdad);
        System.out.println("Resultado IMC: " + estadoSaludPersona);



    }
}