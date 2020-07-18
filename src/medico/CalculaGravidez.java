package medico;

/*
 * Programa para se estimar a data de concepção e a data estimada do parto.
 */


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculaGravidez {
	
	private Date dataUltimoPeriodoMenstrual;

	public CalculaGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		Calendar dataConcepcaoEstimada = this.converterDateParaCalendar(dataUltimoPeriodoMenstrual);
		dataConcepcaoEstimada.add(Calendar.WEEK_OF_YEAR, 2);
		return dataConcepcaoEstimada.getTime();
		
	}
	
	public Date calcularDataEstimadaParto() {
		Calendar dataPartoEstimada = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataPartoEstimada.add(Calendar.WEEK_OF_YEAR, 40);
		return dataPartoEstimada.getTime();
	}
	
}
