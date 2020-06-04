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

/**
 *
 * @author chris
 */
public class ProductoDAOTest {
    
    public ProductoDAOTest() {
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
    //Las siguientes pruebas seran del modulo agregar, de la clase ProductoDAO.

    //Test Agregar01, agregar Producto.
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Producto p = new Producto();
        p.id = 69;
        p.nombres = "Test";
        p.descripcion = "Test test testiculo";
        p.stock = 10;
        p.precio = 1999;
        p.foto = null;
        ProductoDAO instance = new ProductoDAO();
        instance.agregar(p);
        String expResult = "Test";
        String result = instance.buscar(p.id).getNombres();
        assertEquals(expResult, result);
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
        int expResult = 10;
        int result = (int) instance.buscar(id).getStock();
        assertEquals(expResult, result);
    }
    /**
     * Test of actualizarStock method, of class ProductoDAO.
     */
    public void testActualizarStock() {
        System.out.println("actualizarStock");
        int id = 0;
        int stock = 0;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizarStock(id, stock);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarId method, of class ProductoDAO.
     */
    public void testListarId() {
        System.out.println("listarId");
        int id = 0;
        ProductoDAO instance = new ProductoDAO();
        Producto expResult = null;
        Producto result = instance.listarId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ProductoDAO.
     */
    public void testListar() {
        System.out.println("listar");
        ProductoDAO instance = new ProductoDAO();
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarImg method, of class ProductoDAO.
     */
    public void testListarImg() {
        System.out.println("listarImg");
        int id = 0;
        HttpServletResponse response = null;
        ProductoDAO instance = new ProductoDAO();
        instance.listarImg(id, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ProductoDAO.
     */
    public void testActualizar() {
        System.out.println("actualizar");
        Producto p = null;
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ProductoDAO.
     */
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        ProductoDAO instance = new ProductoDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
