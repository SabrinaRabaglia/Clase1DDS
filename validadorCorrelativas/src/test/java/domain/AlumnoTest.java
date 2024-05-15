package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class AlumnoTest {
    @Test
    public void unAlumnoAproboAlgebra (){
        Alumno unAlumno =  new Alumno();
        List<Materia>  unAlumnoMateriasAprobadas= new ArrayList<>();
        Materia algebra= new Materia ();
        unAlumnoMateriasAprobadas.add(algebra);
        unAlumno.setMateriasAprobadas(unAlumnoMateriasAprobadas);
        Assertions.assertTrue(unAlumno.aproboMateria(algebra));
    }
    @Test
    public void unAlumnoPuedeCursarAads(){
        Alumno unAlumno =  new Alumno();
        Materia ads = new Materia();
        List<Materia>  unAlumnoMateriasAprobadas= new ArrayList<>();
        Materia algoritmos= new Materia ();
        unAlumnoMateriasAprobadas.add(algoritmos);
        List<Materia> correlativasADS = new ArrayList<>();
        correlativasADS.add(algoritmos);
        ads.setCorrelativas(correlativasADS);
        unAlumno.setMateriasAprobadas(unAlumnoMateriasAprobadas);
        Assertions.assertTrue(unAlumno.puedeInscribirseA(ads));
    }
}
