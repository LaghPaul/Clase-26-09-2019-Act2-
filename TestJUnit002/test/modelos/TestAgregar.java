package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Libro libro= new Libro("Lib001", "Titutlo", "Autor");
        ColeccionLibros instancia = new ColeccionLibros();
        boolean esperado=true;
        boolean obtenido = instancia.Agregar(libro);
        Assert.assertEquals(esperado, obtenido);
    }
}
