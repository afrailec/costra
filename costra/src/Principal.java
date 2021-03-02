import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Alumno felipe = new Alumno("Felipe Arias González", "aa1253", 3.50);
        Alumno manuel = new Alumno("Manuel García Sacedón", "ax0074", 8.35);
        Alumno margarita = new Alumno("Margarita López Medina", "mj7726", 7.70);
        Alumno estela = new Alumno("Estela Sánchez Arellano", "bc2658", 6.75);

        felipe.matricularAsignatura("Estructura de Datos");
        manuel.matricularAsignatura("Estructura de Datos");
        //margarita.matricularAsignatura("Estructura de Datos");
        estela.matricularAsignatura("Estructura de Datos");
        estela.matricularAsignatura("Algebra");
        estela.matricularAsignatura("Estructuras de Computadores");

        GrupoAlumnos g1 = new GrupoAlumnos("GX11", 20);

        /*
        System.out.println("---------------------------------------------------");
        estela.mostrarAsignaturas();
        System.out.println("---------------------------------------------------");
        felipe.mostrarAlumno();
        System.out.println("---------------------------------------------------");
        estela.mostrarAlumno();
        System.out.println("---------------------------------------------------");
        */

        g1.insertarAlumno(felipe);
        g1.insertarAlumno(manuel);
        g1.insertarAlumno(margarita);
        g1.insertarAlumno(estela);

        g1.mostarGrupo();

        System.out.println("---------------------------------------------------");
        System.out.println("Datos del alumno en la posición 1:");
        g1.getAlumno(1).mostrarAlumno();
        System.out.println("---------------------------------------------------");
        System.out.println("Datos del mejor alumno:");
        g1.mejorAlumno().mostrarAlumno();
        System.out.println("---------------------------------------------------");
        System.out.println("Calificación media del grupo:");
        System.out.println(g1.mediaCalificaciones());

        g1.eliminarAlumno(felipe.getNombre());
        g1.mostarGrupo();



    }
}
