public class GrupoAlumnos {

    private static final int MAX_ALUMNOS = 10;

    private String nombre;
    private Alumno[] alumnos;
    private int numAlumnos;
    private final int maximo;

    public GrupoAlumnos(String nombre, int maximo){
        this.nombre = nombre;
        alumnos = new Alumno[maximo];
        numAlumnos = 0;
        this.maximo = maximo;
    }

    //Constructor vacío
    /*
    public GrupoAlumnos(){
        this.nombre = "Grupo Desconocido";
        alumnos = new Alumno[MAX_ALUMNOS];
        numAlumnos = 0;
        this.maximo = MAX_ALUMNOS;
    }
    */
    //Se puede hacer así también
    public GrupoAlumnos(){
        this("Grupo desconocido", MAX_ALUMNOS);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumAlumnos(){
        return numAlumnos;
    }

    public int getMaximo(){
        return maximo;
    }

    public boolean insertarAlumno(Alumno alumno){
        if (numAlumnos < maximo) {
            alumnos[numAlumnos] = alumno;
            numAlumnos++;
            return true;
        }else {
            return false;
        }
    }

    public Alumno getAlumno(int i){
        if (i>=0 && i<maximo){
            return alumnos[i];
        }else{
            return null;
        }
    }

    public void mostarGrupo(){
        System.out.println("GRUPO " + this.getNombre() + ": " + this.getNumAlumnos() + " alumnos");
        for (int i=0; i < numAlumnos; i++){
            alumnos[i].mostrarAlumno();
        }
    }

    public double mediaCalificaciones(){
        double sumNotas = 0;
        if (numAlumnos > 0){
            for (int i = 0; i < numAlumnos ; i++){
                sumNotas += alumnos[i].getCalificacion();
            }
            return  sumNotas/numAlumnos;
        }else{
            return -1;
        }
    }

    public Alumno mejorAlumno(){
        Alumno mejorAlumno;
        if(numAlumnos > 0){
            mejorAlumno = alumnos[0];
            for (int i = 0; i < numAlumnos; i++){
                if (mejorAlumno.getCalificacion() < alumnos[i].getCalificacion()){
                    mejorAlumno = alumnos[i];
                }
            }
            return mejorAlumno;
        }else {
            return null;
        }
    }

    public boolean eliminarAlumno(String nombreAlumno){
        boolean encontrado = false;
        int posicion = 0;
        while(posicion < numAlumnos && !nombreAlumno.equals(alumnos[posicion].getNombre())){
            posicion++;
        }
        if (posicion < numAlumnos){
            encontrado = true;
            for (int i = posicion; i < numAlumnos - 1; i++){
                alumnos[i] = alumnos[i+1];
            }
            numAlumnos--;
        }
        return encontrado;
    }

}

