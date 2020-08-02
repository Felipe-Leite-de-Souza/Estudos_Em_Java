package apidelocacaodecarro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class DevulucaoCarro {
	
	public static void main(String[] args) {
		Aluguel aluguel = recuperarAluguel();
		
		// Para cada hora de atraso, ele paga 10% do valor do carro em multa
		LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(4), LocalTime.now());
		aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
		aluguel.imprimeFatura();
	}

	private static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("Jo�o Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));

		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
				LocalTime.of(LocalTime.now().getHour(), 0));
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now()
				.plusDays(3).plusHours(2);
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		return aluguel;
	}
	
}
