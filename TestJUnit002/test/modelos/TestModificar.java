package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Libro libro= new Libro("Lib001", "Titutlo", "Autor");
        ColeccionLibros instancia = new ColeccionLibros();
        instancia.Agregar(libro);
        boolean esperado=true;
        libro= new Libro("Lib001", "Titutlo2", "Autor2");
        boolean obtenido = instancia.Modificar(libro);
        Assert.assertEquals(esperado, obtenido);
    }
}
