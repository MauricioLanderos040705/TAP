package com.example.practicatopicosbd;

import com.example.practicatopicosbd.Algoritmos.Estudiante;
import com.example.practicatopicosbd.Database.EstudianteDAO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EstudianteDAO dao = new EstudianteDAO();

        int opcion;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Insertar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Actualizar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Edad:");
                    int edad = sc.nextInt();

                    Estudiante e = new Estudiante(nombre, edad);
                    dao.insertarEstudiante(e);

                    break;

                case 2:

                    dao.mostrarEstudiantes();

                    break;

                case 3:

                    System.out.println("ID del estudiante:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nuevo nombre:");
                    String nuevoNombre = sc.nextLine();

                    System.out.println("Nueva edad:");
                    int nuevaEdad = sc.nextInt();

                    Estudiante actualizado = new Estudiante(id, nuevoNombre, nuevaEdad);
                    dao.actualizarEstudiante(actualizado);

                    break;

                case 4:

                    System.out.println("ID a eliminar:");
                    int eliminarId = sc.nextInt();

                    dao.eliminarEstudiante(eliminarId);

                    break;

            }

        } while (opcion != 5);

        System.out.println("Programa terminado");

    }
}