package ar.edu.unlp.info.oo1.Ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessProxyTest {
	
	
	
	private DatabaseRealAccess dataBase;
	private DatabaseRealAccessProxy dataBaseWithProxy;
	
	
	@BeforeEach
	void setUp() {
        this.dataBase = new DatabaseRealAccess();
        this.dataBaseWithProxy = new DatabaseRealAccessProxy(dataBase,"123456");
    }

    @Test
    void testGetSearchResultsWithouLogin() {
    	
        assertEquals(null, this.dataBaseWithProxy.getSearchResults("select * from comics where id=1"));
    }
    
    
    @Test
    void testGetSearchResultsWithLogin() {
    	dataBaseWithProxy.login("1234"); //fail login
    	assertEquals(null, this.dataBaseWithProxy.getSearchResults("select * from comics where id=1"));
    	dataBaseWithProxy.login("123456"); // login 
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dataBaseWithProxy.getSearchResults("select * from comics where id=1"));
        
    }

    @Test
    void testInsertNewRowWithoutLogin() {
  
        assertEquals(null, this.dataBaseWithProxy.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testInsertNewRowWithLogin() {
    dataBaseWithProxy.login("123456"); // login 
    assertEquals(3, this.dataBaseWithProxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
}








