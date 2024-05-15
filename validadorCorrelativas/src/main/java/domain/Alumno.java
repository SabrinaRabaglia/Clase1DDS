package domain;

import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;
    public Boolean aproboMateria (Materia materia){
        return this.materiasAprobadas.contains(materia);
    }
    public Boolean puedeInscribirseA (Materia materia){
        return materia.getCorrelativas().stream().allMatch(m -> aproboMateria(m));
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
