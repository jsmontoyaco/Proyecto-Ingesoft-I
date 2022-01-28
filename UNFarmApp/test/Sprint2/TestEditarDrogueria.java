package Sprint2;

import Control.EditarDrogueria;
import Entidad.Drogueria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestEditarDrogueria {
    
    private static EditarDrogueria drogueria = new EditarDrogueria(); 
    private final String rpn = "Longitud representante legal incorrecta";
    private final String nn = "Longitud nombre incorrecta";
    private final String tn = "Número telefónico no válido";
    private final String dn = "Longitud dirección incorrecta";
    private final String en = "Correo no válido";
    private final String nitn = "Nit no válido";
    private final String dr = "No hay ninguna drogueria registrada";
    private final String ae = "Actualización existosa";
    
    public TestEditarDrogueria() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

@Test
    public void LongitudNombre() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería A");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarNombre_drogueria(d.getNombredrogueria()), nn);

        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería  Roja, Blanca y Naranja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarNombre_drogueria(d.getNombredrogueria()), nn);
    }

    @Test
    public void LongitudNit() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarNit(d.getNitdrogueria()), nitn);

        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("123456789012345678901");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarNit(d.getNitdrogueria()), nitn);
    }

    @Test
    public void LongitudDireccion() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 89a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarDireccion(d.getDirecciondrogueria()), dn);

        d.setDirecciondrogueria("Carrera 89b No 83a 24 C.C Mirador");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarDireccion(d.getDirecciondrogueria()), dn);
    }

    @Test
    public void LongitudTelefono() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456");
        assertEquals(drogueria.validarTelefono_drogueria(d.getTelefono()), tn);

        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("1234567890123456");
        assertEquals(drogueria.validarTelefono_drogueria(d.getTelefono()), tn);
    }

    @Test
    public void ValidarCorreo() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("d@ml.com");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarEmail(d.getEmail()), en);

        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacruzroja.andrescorredor.mirador@mymail.com");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarEmail(d.getEmail()), en);

        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacrmymail.com");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarEmail(d.getEmail()), en);
        
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymailcom");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarEmail(d.getEmail()), en);
       
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacrmymailcom");
        d.setNitdrogueria("1234567890123");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarEmail(d.getEmail()), en);
    }

    @Test
    public void LongitudRepresentante() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Roa");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarRepresentante(d.getRepresentantelegal()), rpn);

        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("1234567890");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacios Murillo Velasquez");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarRepresentante(d.getRepresentantelegal()), rpn);
    }

    @Test
    public void ActualizacionExistosa() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 89 No 83a");
        d.setEmail("drogueriacr@mymail.com");
        d.setNitdrogueria("48949818949");
        d.setNombredrogueria("Droguería Cruz Roja");
        d.setRepresentantelegal("Andrés Palacio");
        d.setTelefono("123456789");
        assertEquals(drogueria.validarDatos(d), ae);
    }

    @Test
    public void NoRegistrado() {
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria("Carrera 64 No 24a");
        d.setEmail("drogueriacb@mymail.com");
        d.setNitdrogueria("1234567890124");
        d.setNombredrogueria("Droguería Cruz Blanca");
        d.setRepresentantelegal("Felipe Chaparro");
        d.setTelefono("12345678902");
        assertEquals(drogueria.validarDatos(d), dr);
      
    }
}
