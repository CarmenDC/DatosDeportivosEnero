package com.acing.serial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.JsonSerializer;
import com.esotericsoftware.jsonbeans.JsonValue;


public class SerializadorDate implements JsonSerializer<Date> {
	
	SimpleDateFormat sdformatDia;
	SimpleDateFormat sdformatHora;
	SimpleDateFormat sdformatFecha; 
	
	public SerializadorDate() {
		this("dd/MM/yyyy", "HH:mm");
		
	}
	
	public SerializadorDate(String formatoDia, String formatoHora) {
		sdformatDia= new SimpleDateFormat(formatoDia);
		sdformatHora= new SimpleDateFormat(formatoHora);
		sdformatFecha = new SimpleDateFormat(formatoDia +" "+ formatoHora);
	}


	@Override
	public Date read(Json json, JsonValue jsonData, Class tipo) {
		Date fecha= null;
		String dia = jsonData.getString("dia");
		String hora= jsonData.getString("hora");
		try {
			fecha = sdformatFecha.parse(dia+" "+hora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fecha;
	}

	@Override
	public void write(Json json, Date fecha, Class tipoDesconocido) {
		json.writeObjectStart();
		json.writeValue("dia", sdformatDia.format(fecha));
		json.writeValue("hora",sdformatHora.format(fecha));
		json.writeObjectEnd();
		
	}

}
