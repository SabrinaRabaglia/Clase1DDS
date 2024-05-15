package domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class MateriaTest {
    @Test

     public void unaMateriaTieneCorrelativas (){
        Materia analisis = new Materia();
        Materia algebra = new Materia();
        Materia proba = new Materia();
        List<Materia> correlativasProba = new ArrayList<>();
        correlativasProba.add(analisis);
        correlativasProba.add(algebra);
        proba.setCorrelativas(correlativasProba);
        Assertions.assertEquals(2,correlativasProba.size());
}
}