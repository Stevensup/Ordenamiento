// Clase Seleccion
package co.edu.unbosque.model;

import java.util.List;

public class Seleccion {

    public static void ordenarPorNombre(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listaEstudiantes.size(); j++) {
                if (listaEstudiantes.get(j).getNombre().compareToIgnoreCase(listaEstudiantes.get(minIndex).getNombre()) < 0) {
                    minIndex = j;
                }
            }
            intercambiar(listaEstudiantes, i, minIndex);
        }
    }

    public static void ordenarPorSemestre(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listaEstudiantes.size(); j++) {
                if (listaEstudiantes.get(j).getSemestre() < listaEstudiantes.get(minIndex).getSemestre()) {
                    minIndex = j;
                }
            }
            intercambiar(listaEstudiantes, i, minIndex);
        }
    }

    public static void ordenarPorPromedio(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listaEstudiantes.size(); j++) {
                if (listaEstudiantes.get(j).getPromedio() < listaEstudiantes.get(minIndex).getPromedio()) {
                    minIndex = j;
                }
            }
            intercambiar(listaEstudiantes, i, minIndex);
        }
    }

    public static void ordenarPorCreditos(List<Estudiantes.Estudiante> listaEstudiantes) {
        for (int i = 0; i < listaEstudiantes.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listaEstudiantes.size(); j++) {
                if (listaEstudiantes.get(j).getCreditos() < listaEstudiantes.get(minIndex).getCreditos()) {
                    minIndex = j;
                }
            }
            intercambiar(listaEstudiantes, i, minIndex);
        }
    }

    private static void intercambiar(List<Estudiantes.Estudiante> listaEstudiantes, int i, int j) {
        Estudiantes.Estudiante temp = listaEstudiantes.get(i);
        listaEstudiantes.set(i, listaEstudiantes.get(j));
        listaEstudiantes.set(j, temp);
    }
}
