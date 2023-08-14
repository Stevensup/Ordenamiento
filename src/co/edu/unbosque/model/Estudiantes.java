package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
    public List<Estudiante> listaEstudiantes;

    public Estudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, int semestre, double promedio, int creditos) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, semestre, promedio, creditos);
        listaEstudiantes.add(nuevoEstudiante);
    }
    
    public void agregarEstudiantesAutomaticos() {
        // Agregar 10 estudiantes automáticamente con información predefinida
        agregarEstudiante("Carlos", 1, 4.5, 24);
        agregarEstudiante("Andrea", 2, 3.8, 20);
        agregarEstudiante("Juan", 3, 3.0, 18);
        agregarEstudiante("Maria", 4, 3.5, 22);
        agregarEstudiante("David", 2, 4.2, 23);
        agregarEstudiante("Laura", 1, 2.8, 16);
        agregarEstudiante("Sofia", 3, 3.7, 19);
        agregarEstudiante("Alejandro", 4, 4.0, 21);
        agregarEstudiante("Camila", 2, 3.9, 20);
        agregarEstudiante("Diego", 3, 3.3, 17);
    }    
    public void mostrarEstudiantes() {
        // Ajustar el ancho de las columnas
        String nombreColumna = "Nombre:";
        String semestreColumna = "Semestre:";
        String promedioColumna = "Promedio:";
        String creditosColumna = "Créditos:";

        // Usar un formato específico para alinear los valores
        String format = "%-15s %-10s %-10s %-10s";
        
        // Imprimir el encabezado
        System.out.println(String.format(format, nombreColumna, semestreColumna, promedioColumna, creditosColumna));
        
        // Iterar sobre la lista de estudiantes e imprimir la información de cada estudiante
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(String.format(format, estudiante.getNombre(), estudiante.getSemestre(),
                    estudiante.getPromedio(), estudiante.getCreditos()));
        }
    }

    public class Estudiante {
        private String nombre;
        private int semestre;
        private double promedio;
        private int creditos;

        public Estudiante(String nombre, int semestre, double promedio, int creditos) {
            this.nombre = nombre;
            this.semestre = semestre;
            this.promedio = promedio;
            this.creditos = creditos;
        }
        
        

        @Override
        public String toString() {
            // Ajustar el ancho de las columnas
            String nombreColumna = "Nombre:";
            String semestreColumna = "Semestre:";
            String promedioColumna = "Promedio:";
            String creditosColumna = "Créditos:";

            // Usar un formato específico para alinear los valores
            String format = "%-15s %-10s %-10s %-10s\n";
            StringBuilder result = new StringBuilder();
            
            // Agregar el encabezado al resultado
            result.append(String.format(format, nombreColumna, semestreColumna, promedioColumna, creditosColumna));

            // Agregar la información de los estudiantes al resultado
            result.append(String.format(format, nombre, semestre, promedio, creditos));
            
            return result.toString();
        }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getSemestre() {
			return semestre;
		}

		public void setSemestre(int semestre) {
			this.semestre = semestre;
		}

		public double getPromedio() {
			return promedio;
		}

		public void setPromedio(double promedio) {
			this.promedio = promedio;
		}

		public int getCreditos() {
			return creditos;
		}

		public void setCreditos(int creditos) {
			this.creditos = creditos;
		}


    }

	public List<Estudiante> getListaEstudiantes() {
		// TODO Auto-generated method stub
		return listaEstudiantes;
	}
}
