package ar.edu.unlp.info.oo1.Ejercicio17;

import java.util.Collection;
import java.util.List;

public class DatabaseRealAccessProxy implements DatabaseAccess{
	
	private DatabaseRealAccess realDataBase;
	private String password;
	private boolean login;
	
	
	public DatabaseRealAccessProxy (DatabaseRealAccess realDataBase, String password) {
		this.realDataBase =realDataBase;
		this.password=password;
		this.login =false;
		
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.login) {
			return this.realDataBase.getSearchResults(queryString);
		}
		else {
			return null;
		}
		
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.login) {
			return this.realDataBase.insertNewRow(rowData);
		}
		else {
			return -1;
		}
	}
	
	public void login (String password) {
		if(password.equals(this.password))
			this.login=true;
	}
	
	public void logOut () {
		this.login=false;
	}
	
	
	
		

}
