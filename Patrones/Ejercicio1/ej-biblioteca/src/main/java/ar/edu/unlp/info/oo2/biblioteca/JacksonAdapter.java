package ar.edu.unlp.info.oo2.biblioteca;
import java.util.List;



import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonAdapter extends VoorheesExporter{
	
	
	
	@Override
	public String exportar(List<Socio> socios) {
	    ObjectMapper mapper = new ObjectMapper();
	    try {
	        // mapper.writeValueAsString(socios);
	        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(socios); //asi lo formateo para que se vea mejor
	        return json;
	    } catch (Exception e) {
	        e.printStackTrace(); // o loguealo como prefieras
	        return "[]"; //
	    }
	}
	
	

	

}
