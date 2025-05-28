package ar.edu.unlp.info.oo1.Ejercicio17;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
    Collection<String> getSearchResults(String queryString);

    int insertNewRow(List<String> rowData);
}