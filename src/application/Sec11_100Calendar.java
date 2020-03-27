package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Sec11_100Calendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Para definir o formato de horas que ser� passado em String e como ser� exibido
		//Aqui usamos para definir como ser� a sa�da
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//Instanciando uma data no formato ISO 8601
		//Precisa importar o pacote instant
		
				System.out.println(sdf.format(d));
		//Usando o .format para formatar a sa�da de acordo com o modelo passado no SimpleDateFormat
		
				
		System.out.println("Somando uma unidade de tempo:");
		System.out.println();
					
		Calendar cal = Calendar.getInstance(); //iniciando o objeto Calendar
		cal.setTime(d);
		//A opera��o '.setTime()' faz a nossa data ficar no calend�rio
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		//A partir da vari�vel cal (tipo Calendar) conseguimos adicionar horas, minutos e meses.
		
		d = cal.getTime();
		// atualiza a data na vari�vel d (tipo Date).
		
		System.out.println(sdf.format(d));
		
		
		
		System.out.println("Obtendo uma unidade de tempo:");
		System.out.println();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date c = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf2.format(c));
		
		
		Calendar cal2 = Calendar.getInstance(); //iniciando o objeto Calendar
		cal2.setTime(c);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		//Lembrando que em datas, o m�s sempre come�a com '0', precisamos adicionar um valor.
		
		System.out.println("Minutos: " + minutes);
		System.out.println("Meses: " + month);
		
		
		
	}

}
