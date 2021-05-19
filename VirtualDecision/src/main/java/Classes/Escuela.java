package Classes;


import java.io.Serializable;

public class Escuela implements Serializable {
    String Nombre;
    String Carreras;
    String Estudiantes;
    String Publicaciones; 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCarreras() {
        return Carreras;
    }

    public void setCarreras(String Carreras) {
        this.Carreras = Carreras;
    }

    public String getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(String Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

    public String getPublicaciones() {
        return Publicaciones;
    }

    public void setPublicaciones(String Publicaciones) {
        this.Publicaciones = Publicaciones;
    }
}
