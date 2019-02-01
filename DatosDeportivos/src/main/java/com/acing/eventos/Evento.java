package com.acing.eventos;
import java.util.Date;

import com.acing.serial.Datable;

public class Evento implements Datable {
	transient private Participante localParticipante;
	transient private Participante visitanteParticipante;
	String local;
	String visitante;
	
	private Date fecha;
	private String resultado;
	// No tiene por que ser un evento con goles
//	private int golesLocal;
//	private int golesVisitante;
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public Evento() {}
	
	public Evento(Participante local, Participante visitante, Date fecha) {
		super();
		this.localParticipante = local;
		this.visitanteParticipante = visitante;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "(" + fecha + ") " + local + " vs " + visitante + " => " + resultado;
	}
	
	
}
