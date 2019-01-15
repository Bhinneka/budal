/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhinneka.budal;

import java.util.HashMap;
import java.util.Map;
import static junit.framework.Assert.assertEquals;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author wurianto
 */
public class UtilsTest extends TestCase{
    
    public UtilsTest( String testName ) {
        super( testName );
    }
    
    public static Test suite() {
        return new TestSuite( UtilsTest.class );
    }
    
    public void testQueryToMap() {
        String query = "name=wury&employeeId=5555";
        Map<String, String> actual = Utils.queryToMap(query);
        
        Map<String, String> expected = new HashMap<>();
        expected.put("name", "wury");
        expected.put("employeeId", "5555");
        
        assertEquals(expected, actual);
    }
    
}