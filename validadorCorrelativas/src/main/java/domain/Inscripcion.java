package domain;

import java.util.List;

public class Inscripcion {
    private List<Materia> materiasInscripcion;
    private Alumno alumnoAInscribir;

    public Boolean aceptarInscripcionAMateria (Materia materia){
        return alumnoAInscribir.puedeInscribirseA(materia);
    }
    public Boolean aprobada () {
        return  materiasInscripcion.stream().allMatch(m->aceptarInscripcionAMateria(m));

    }

    public void setAlumnoAInscribir(Alumno alumnoAInscribir) {
        this.alumnoAInscribir = alumnoAInscribir;
    }

    public void setMateriasInscripcion(List<Materia> materiasInscripcion) {
        this.materiasInscripcion = materiasInscripcion;
    }
}
