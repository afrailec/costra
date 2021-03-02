public class Alumno {

    private String nombre;
    private String matricula;
    private double calificacion;
    private String[] asignaturas;
    private int numAsignaturas;
    private final int MAX_ASIGNATURAS = 5;

    public Alumno() {
        nombre = "";
        matricula = "";
        calificacion = 0;
        numAsignaturas = 0;
        asignaturas = new String[MAX_ASIGNATURAS];
    }

    public Alumno(String nom , String mat, double cal) {
        nombre = nom;
        matricula = mat;
        calificacion = cal;
        numAsignaturas = 0;
        asignaturas = new String[MAX_ASIGNATURAS];
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String mat){
        matricula = mat;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public double getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(double cal){
        calificacion = cal;
    }

    public int getNumAsignaturas(){
        return numAsignaturas;
    }

    public void matricularAsignatura(String asignatura){
        if(numAsignaturas < MAX_ASIGNATURAS){
            asignaturas[numAsignaturas] = asignatura;
            numAsignaturas++;
        }
        else{
            System.out.println("No es posible añadir mas asignaturas");
        }
    }

    public void mostrarAsignaturas(){
        if(numAsignaturas>0){
            System.out.println(numAsignaturas + " asignaturas:");
            for(int i = 0; i<numAsignaturas; i++){
                System.out.println("    - " + asignaturas[i] + ".");
            }
        }
        else{
            System.out.println("El alumno no esta matriculado en ninguna asignatura.");
        }
    }

    public void mostrarAlumno(){
        System.out.println(nombre + ". Matr: " + matricula + " (" + calificacion + ") ");
        this.mostrarAsignaturas();
    }
}