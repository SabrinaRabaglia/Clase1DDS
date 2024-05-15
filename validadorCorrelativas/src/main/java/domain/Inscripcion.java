package domain;

import java.util.List;

public class Inscripcion {
    private List<Materia> materiasInscripcion;
    private Alumno alumnoAInscribir;

    public Boolean aceptarInscripcionAMateria (Materia materia){
        return materia.getCorrelativas().stream().allMatch(m -> alumnoAInscribir.aproboMateria(m));

    }
    public Boolean aprobada () {//si accepto todas las materias
        return  materiasInscripcion.stream().allMatch(m->aceptarInscripcionAMateria(m));
        //return materiasInscripcion.stream().allMatch(m,a->aceptarInscripcionAMateria(m,a));
        //return true;
    }

}
