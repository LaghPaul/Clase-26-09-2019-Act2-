package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo="Lib001";
        Libro libro= new Libro("Lib001", "Titutlo", "Autor");
        ColeccionLibros instancia = new ColeccionLibros();
        instancia.Agregar(libro);
        boolean esperado=true;
        boolean obtenido = instancia.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
