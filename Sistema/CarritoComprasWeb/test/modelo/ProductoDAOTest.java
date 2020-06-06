/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author chris
 */
public class ProductoDAOTest {
    
    /**
     *
     */
    public ProductoDAOTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }
    
    
    //Las siguientes pruebas seran del modulo agregar, de la clase ProductoDAO.

    //Test Agregar, agregar Producto.
    
    @Test
    public void testAgregar(){
        
        System.out.println("Agregar Producto");
        Producto p = Mockito.mock(Producto.class);
        p.id = 404;
        p.nombres = "Test";
        p.descripcion = "Lorem ipsum";
        p.precio = 1000;
        p.stock = 10;
        p.foto = null;
        ProductoDAO instance = new ProductoDAO();
        instance.agregar(p);
        
        Mockito.verify(instance).agregar(p);
    }

    //Las siguientes pruebas seran del modulo buscar, de la clase ProductoDAO.
    
    //Test Buscar01, Nombre.
    @Test
    public void testBuscar01() {
        System.out.println("buscar nombre");
        int id = 7;
        ProductoDAO instance = new ProductoDAO();
        String expResult = "producto 1";
        String result = instance.buscar(id).getNombres();
        assertEquals(expResult, result);
    }

    //Test Buscar02, Descripcion.
    @Test
    public void testBuscar02() {
        System.out.println("buscar descripcion");
        int id = 7;
        ProductoDAO instance = new ProductoDAO();
        String expResult = "es un producto";
        String result = instance.buscar(id).getDescripcion();
        assertEquals(expResult, result);
    }
    
    //Test Buscar03, Precio.
    @Test
    public void testBuscar03() {
        System.out.println("buscar precio");
        int id = 7;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 20500;
        int result = (int) instance.buscar(id).getPrecio();
        assertEquals(expResult, result);
    }
    //Test Buscar04, Stock.
    @Test
    public void testBuscar04() {
            System.out.println("buscar stock");
        int id = 7;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 8;
        int result = (int) instance.buscar(id).getStock();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of actualizarStock method, of class ProductoDAO.
     */
    @Test
    public void testActualizarStock() {
        System.out.println("actualizar Stock");
        int id = 12;
        int stock = 10;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 10;
        instance.actualizarStock(id, stock);
        int result = (int) instance.buscar(id).getStock();
        assertEquals(expResult, result);
    }


    /**
     * Test of delete method, of class ProductoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 404;
        ProductoDAO instance = new ProductoDAO();
        instance.delete(id);
        
        String expResult = null;
        String result = instance.buscar(id).nombres;
        
        assertEquals(expResult, result);
    }
    
}
