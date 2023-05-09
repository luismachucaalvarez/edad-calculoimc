package org.example;

public class Persona {
    private String nombre;
    private int edad;
    private String rut;
    private String sexo = "H";

    private double peso;

    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String rut, String sexo, double peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Datos de la persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", rut='" + rut + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int calcularIMC(double peso, float altura){
        int estadoIMC;
        double valorIMC = peso / (altura * altura);
        if (valorIMC < 20){
            estadoIMC = -1;
        } else if((valorIMC >= 20) && (valorIMC <= 25)){
            estadoIMC = 0;
        } else {
            estadoIMC = 1;
        }
        return estadoIMC;
    }

    public boolean esMayorDeEdad(int edad){
        boolean mayorDeEdad;
        if (edad >= 18){
            mayorDeEdad = true;
        }
        else {
            mayorDeEdad = false;
        }

        return mayorDeEdad;
    }
}
