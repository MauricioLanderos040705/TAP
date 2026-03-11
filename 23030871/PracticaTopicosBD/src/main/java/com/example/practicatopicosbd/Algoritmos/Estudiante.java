package com.example.practicatopicosbd.Algoritmos;

public class Estudiante {

    private int id;
    private String nombre;
    private int edad;

    // Constructor para insertar
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor para actualizar
    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}