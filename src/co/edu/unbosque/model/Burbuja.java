package co.edu.unbosque.model;

import java.util.List;

public class Burbuja {

    public static void ordenarPorNombre(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            for (int j = 0; j < listaEstudiantes.size() - i - 1; j++) {
                if (listaEstudiantes.get(j).getNombre().compareToIgnoreCase(listaEstudiantes.get(j + 1).getNombre()) > 0) {
                    intercambiar(listaEstudiantes, j, j + 1);
                }
            }
        }
    }

    public static void ordenarPorSemestre(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            for (int j = 0; j < listaEstudiantes.size() - i - 1; j++) {
                if (listaEstudiantes.get(j).getSemestre() > listaEstudiantes.get(j + 1).getSemestre()) {
                    intercambiar(listaEstudiantes, j, j + 1);
                }
            }
        }
    }

    public static void ordenarPorPromedio(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            for (int j = 0; j < listaEstudiantes.size() - i - 1; j++) {
                if (listaEstudiantes.get(j).getPromedio() > listaEstudiantes.get(j + 1).getPromedio()) {
                    intercambiar(listaEstudiantes, j, j + 1);
                }
            }
        }
    }

    public static void ordenarPorCreditos(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            for (int j = 0; j < listaEstudiantes.size() - i - 1; j++) {
                if (listaEstudiantes.get(j).getCreditos() > listaEstudiantes.get(j + 1).getCreditos()) {
                    intercambiar(listaEstudiantes, j, j + 1);
                }
            }
        }
    }

    private static void intercambiar(List<Estudiantes.Estudiante> listaEstudiantes, int i, int j) {
        Estudiantes.Estudiante temp = listaEstudiantes.get(i);
        listaEstudiantes.set(i, listaEstudiantes.get(j));
        listaEstudiantes.set(j, temp);
    }
    
    
}
