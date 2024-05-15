package domain;

import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas; // las que ya dio final
    public Boolean aproboMateria (Materia materia){ // si dio final de una materia
        return this.materiasAprobadas.contains(materia);
    }
    public Boolean puedeInscribirseA (Materia materia){
        return materia.getCorrelativas().stream().allMatch(m -> aproboMateria(m));
    }

}
