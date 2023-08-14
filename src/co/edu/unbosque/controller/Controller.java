package co.edu.unbosque.controller;

import co.edu.unbosque.view.VistaConsola;
import co.edu.unbosque.model.Estudiantes;
import co.edu.unbosque.model.Burbuja;
import co.edu.unbosque.model.Seleccion;

import java.util.Scanner;
import java.util.List;

public class Controller {

    private Scanner scanner;
    private Estudiantes Camigo;
    private VistaConsola vista;

    public Controller() {
        scanner = new Scanner(System.in);
        vista = new VistaConsola();
        Camigo = new Estudiantes();
        Camigo.agregarEstudiantesAutomaticos(); 
        vista.mostrarInformacion("Lista de estudiantes después de agregar automáticamente:");
        Camigo.mostrarEstudiantes();
    }
    
    
    public void start() {
        int option = 0;
        do {
            vista.mostrarInformacion("-------------------Escoge una opcion:");
            vista.mostrarInformacion("-------------------1. Ingresar Estudiante: ");
            vista.mostrarInformacion("-------------------2. Organizar estudiantes por:");
            vista.mostrarInformacion("-------------------3. Salir");
            System.out.print("-------------------Ingrese la opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                	  vista.mostrarInformacion("Ingrese los datos del estudiante: ");

                      System.out.print("Nombre: ");
                      String nombreAmigo = vista.getLeer().nextLine();

                      while (nombreAmigo.matches(".*\\d.*") || nombreAmigo.matches(".*[^a-zA-Z\\s].*")) {
                          vista.mostrarInformacion("El nombre solo puede contener letras y espacios en blanco. Intente de nuevo.");
                          nombreAmigo = vista.getLeer().nextLine();
                      }

                      System.out.print("Semestre: ");
                      int semestreestudiante = vista.getLeer().nextInt();
                      vista.getLeer().nextLine(); // Consumir el salto de línea

                      System.out.print("Promedio: ");
                      double promedioestudiante = vista.getLeer().nextDouble();
                      vista.getLeer().nextLine(); // Consumir el salto de línea

                      System.out.print("Creditos: ");
                      int creditosestudiantes = vista.getLeer().nextInt();
                      vista.getLeer().nextLine(); // Consumir el salto de línea

                      Camigo.agregarEstudiante(nombreAmigo, semestreestudiante, promedioestudiante, creditosestudiantes);

                      vista.mostrarInformacion("Estudiante agregado. Lista de estudiantes:");
                      Camigo.mostrarEstudiantes();

                      break;

                case 2:
                    int option2 = 0;
                    do {
                        vista.mostrarInformacion("-------------------Escoge una opcion:");
                        vista.mostrarInformacion("-------------------1. Burbuja ");
                        vista.mostrarInformacion("-------------------2. Selección");
                        vista.mostrarInformacion("-------------------3. Salir");
                        System.out.print("-------------------Ingrese la opcion: ");
                        option2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (option2) {
                            case 1:
                                // Ordenar por burbuja
                                vista.mostrarInformacion("Escoge una columna para ordenar por Burbuja:");
                                vista.mostrarInformacion("-------------------1. Nombre");
                                vista.mostrarInformacion("-------------------2. Semestre");
                                vista.mostrarInformacion("-------------------3. Promedio");
                                vista.mostrarInformacion("-------------------4. Créditos");
                                System.out.print("-------------------Ingrese la opcion: ");
                                int colBurbuja = scanner.nextInt();
                                scanner.nextLine();
                                ordenarPorColumnaBurbuja(colBurbuja);
                                vista.mostrarInformacion("Estudiantes ordenados por Burbuja.");
                                Camigo.mostrarEstudiantes();
                                break;
                            case 2:
                                // Ordenar por selección
                                vista.mostrarInformacion("Escoge una columna para ordenar por Selección:");
                                vista.mostrarInformacion("-------------------1. Nombre");
                                vista.mostrarInformacion("-------------------2. Semestre");
                                vista.mostrarInformacion("-------------------3. Promedio");
                                vista.mostrarInformacion("-------------------4. Créditos");
                                System.out.print("-------------------Ingrese la opcion: ");
                                int colSeleccion = scanner.nextInt();
                                scanner.nextLine();
                                ordenarPorColumnaSeleccion(colSeleccion);
                                vista.mostrarInformacion("Estudiantes ordenados por Selección.");
                                Camigo.mostrarEstudiantes();
                                break;
                            case 3:
                                vista.mostrarInformacion("Volviendo al menú principal...");
                                break;
                            default:
                                vista.mostrarInformacion("Opcion invalida...");
                                break;
                        }
                    } while (option2 != 3);
                    break;

                case 3:
                    vista.mostrarInformacion("Hasta pronto...");
                    break;

                default:
                    vista.mostrarInformacion("Opcion invalida...");
                    break;
            }

        } while (option != 3);
    }

    // Método para ordenar por columna usando Burbuja
    private void ordenarPorColumnaBurbuja(int col) {
        List<Estudiantes.Estudiante> listaEstudiantes = Camigo.getListaEstudiantes();
        switch (col) {
            case 1:
                Burbuja.ordenarPorNombre(listaEstudiantes);
                break;
            case 2:
                Burbuja.ordenarPorSemestre(listaEstudiantes);
                break;
            case 3:
                Burbuja.ordenarPorPromedio(listaEstudiantes);
                break;
            case 4:
                Burbuja.ordenarPorCreditos(listaEstudiantes);
                break;
            default:
                vista.mostrarInformacion("Opción de columna no válida.");
                break;
        }
    }

    // Método para ordenar por columna usando Selección
    private void ordenarPorColumnaSeleccion(int col) {
        List<Estudiantes.Estudiante> listaEstudiantes = Camigo.getListaEstudiantes();
        switch (col) {
            case 1:
                Seleccion.ordenarPorNombre(listaEstudiantes);
                break;
            case 2:
                Seleccion.ordenarPorSemestre(listaEstudiantes);
                break;
            case 3:
                Seleccion.ordenarPorPromedio(listaEstudiantes);
                break;
            case 4:
                Seleccion.ordenarPorCreditos(listaEstudiantes);
                break;
            default:
                vista.mostrarInformacion("Opción de columna no válida.");
                break;
        }
    }
}
