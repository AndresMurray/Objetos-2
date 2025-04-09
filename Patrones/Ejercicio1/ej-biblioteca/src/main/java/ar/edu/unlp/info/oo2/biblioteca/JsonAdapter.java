package ar.edu.unlp.info.oo2.biblioteca;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.*;

public class JsonAdapter extends VoorheesExporter {
	
	
	
	@SuppressWarnings("unchecked")
	private JSONObject exportar(Socio socio) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre:", socio.getNombre());
        jsonObject.put("email:", socio.getEmail());
        jsonObject.put("legajo:", socio.getLegajo());
        return jsonObject;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public String exportar (List<Socio> socios) {	
		JSONArray lista = new JSONArray();
		socios.forEach(socio -> lista.add(exportar(socio)));
		
        return lista.toJSONString();
	 
	}
	

}
