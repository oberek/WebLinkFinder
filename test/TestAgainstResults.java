/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import weblinkfinder.LinkFinder;

/**
 *
 * @author Maciej
 */
public class TestAgainstResults {
    
    public TestAgainstResults() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    public void test() throws FileNotFoundException, IOException {
        LinkFinder lf = new LinkFinder();
        InputStream is = new FileInputStream("C:\\Users\\Maciej\\Documents\\NetBeansProjects\\WebLinkFinder\\src\\weblinkfinder\\results");

        assertTrue(lf.checkAgainstResults(lf.getLinks(lf.processPage(is))));
    }
}
