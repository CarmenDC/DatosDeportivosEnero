package com.acing.eventos;

import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.JsonSerializer;
import com.esotericsoftware.jsonbeans.JsonValue;

public class EventoFechaString extends Evento implements JsonSerializer<Evento>{
	
	String fechaString;
	Json json = new Json();

//	@Override
//	public void write(Json json, EventoFechaString evento, Class tipoConocido) {
//		json.writeObjectStart();
//		json.writeValue(EventoFechaString.fechaString);
//		json.writeObjectEnd();
//		
//	}
//	
	
	@Override
	public Evento read(Json arg0, JsonValue arg1, Class arg2) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void write(Json arg0, Evento arg1, Class arg2) {
		// TODO Auto-generated method stub
		
	}

	

}
