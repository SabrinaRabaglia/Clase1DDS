package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {
    @Test
    public void unAlumnoPuedeInscribirseAads () {
        Inscripcion inscripcion = new Inscripcion();
        Alumno unAlumno = new Alumno();
        inscripcion.setAlumnoAInscribir(unAlumno);
        Materia ads = new Materia ();
        List<Materia> unAlumnoMateriasAprobadas= new ArrayList<>();
        Materia algoritmos= new Materia ();
        unAlumnoMateriasAprobadas.add(algoritmos);
        List<Materia> correlativasADS = new ArrayList<>();
        correlativasADS.add(algoritmos);
        ads.setCorrelativas(correlativasADS);
        unAlumno.setMateriasAprobadas(unAlumnoMateriasAprobadas);
        Assertions.assertTrue(inscripcion.aceptarInscripcionAMateria(ads));
    }
    @Test
    public void seAceptaLaInscripcion (){
        Inscripcion inscripcion = new Inscripcion();
        Alumno unAlumno = new Alumno();
        inscripcion.setAlumnoAInscribir(unAlumno);
        Materia ads = new Materia ();
        Materia analisis = new Materia();
        List<Materia> unAlumnoMateriasAprobadas= new ArrayList<>();
        Materia algoritmos= new Materia ();
        unAlumnoMateriasAprobadas.add(algoritmos);
        List<Materia> correlativasADS = new ArrayList<>();
        correlativasADS.add(algoritmos);
        ads.setCorrelativas(correlativasADS);
        unAlumno.setMateriasAprobadas(unAlumnoMateriasAprobadas);
        List<Materia> materiasAInscribir = new ArrayList<>();
        materiasAInscribir.add(ads);
        materiasAInscribir.add(analisis);
        inscripcion.setMateriasInscripcion(materiasAInscribir);
        Assertions.assertTrue(inscripcion.aprobada());
    }
}