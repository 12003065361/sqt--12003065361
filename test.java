/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shahid
 */
public class HeapTest {
    
    public HeapTest() {
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

    /**
     * Test of heapSort method, of class Heap.
     */
    @org.junit.Test
    public void testHeapSort() {
        System.out.println("heapSort");
        Comparable[] array = null;
        Heap instance = new Heap();
        instance.heapSort(array);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMin method, of class Heap.
     */
    @org.junit.Test
    public void testDeleteMin() {
        System.out.println("deleteMin");
        Heap instance = new Heap();
        Object expResult = null;
        Object result = instance.deleteMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Heap.
     */
    @org.junit.Test
    public void testInsert() {
        System.out.println("insert");
        Object x = null;
        Heap instance = new Heap();
        instance.insert(x);
        // TODO review the generated test code and remove the default call to fail
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Heap.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Heap instance = new Heap();
        String expResult = "shahid";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Heap.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Heap.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Heap.
     */
    @Test
    public void testInsert_GenericType() {
        System.out.println("insert");
        Object x = null;
        Heap instance = new Heap();
        instance.insert(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Heap.
     */
    @Test
    public void testInsert_Object() {
        System.out.println("insert");
        Object x = null;
        Heap instance = new Heap();
        instance.insert(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
