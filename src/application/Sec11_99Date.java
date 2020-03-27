package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Sec11_99Date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Usamos a classe SimpleDateFormat para informar o padr�o (formato) de data em String que ser� usada.
		//sdf3.setTimeZone() = Ceta o formato UTC
		//Ao criar 3 vari�veis de simpleDateFormat, criamos 3 formatos de datas e usamos para formatar qualquer vari�vel do tipo Date ou SimpleDateFormat
		
		Date x1 = new Date(); //Para pegar a data atual
		Date x2 = new Date(System.currentTimeMillis()); //Tamb�m para pegar a data atual
		
		Date x3 = new Date(0L);
		//Podemos passar a data em n�mero Long. O '0L' ser� a primeira data em milisegundo que o Java armazena.
		//Seria "1 de janeiro de 1970", mas nossa m�quina est� no hor�rio de SP, s�o -3 horas e vai exibir: 31/12/1969 21:00:00
		
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		//Podemos usar express�o matem�tica para passar uma data.
		//Aqui estamos passando 5 horas ap�s a data inicial do Java. Ser�: 01/01/1970 02:00:00
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		//Agora podemos usar o metodo "parse('string')" para passar a data em String para um tipo Date
		//Ao usar o .parse(), precisamos adicionar a exe��o "throws ParseException" na linha da classe main
		//O parse � apenas para passar a data em string para a vari�vel do tipo Date. Isso n�o define como ser� exibido na tela.
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//Instanciando uma data no formato ISO 8601
		//O 'Z' signigica padr�o UTC
		//Precisa importar o pacote instant
		
		System.out.println();
		System.out.println("------Formato padr�o do java para exibi��o sem o '.format()' -----");
		System.out.println();
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);		
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);		
		System.out.println("y3: " + y3);
		//Imprimindo essas vari�veis desta forma teremos datas exibidas no formato padr�o do java
		//Ex: Mon Jun 25 15:42:07 BRT 2018 (que � o padr�o)
		//POis at� o momento n�o informamos como ser� exibido
		
		
		System.out.println();
		System.out.println("------USANDO O .fomart()--| SEM TIME ZONE HOR�RIO LOCAL (COMPUTADOR) -----");
		System.out.println();
				
		System.out.println("sdf2.format(x1): " + sdf2.format(x1));
		System.out.println("sdf2.format(x2): " + sdf2.format(x2));
		System.out.println("sdf2.format(x3): " + sdf2.format(x3));
		System.out.println("sdf2.format(x4): " + sdf2.format(x4));
		
		System.out.println("sdf1.format(y1): " + sdf1.format(y1));
		System.out.println("sdf2.format(y2): " + sdf2.format(y2));
		System.out.println("sdf2.format(y3): " + sdf2.format(y3));
		
		//Usando o '.format(arg)' a partir do objeto simpleDateFormat podemos exibir a data no formato setado no simpleDateFormat.
		//Ao criar duas vari�veis de simpleDateFormat, criamos dois formatos de datas e usamos para formatar qualquer vari�vel do tipo Date ou SimpleDateFormat
		
		
		System.out.println();
		System.out.println("------USANDO TIME ZONE  (FORMATO UTC)- '.setTimeZone'----");
		System.out.println();
		
		System.out.println("sdf3.format(x1): " + sdf3.format(x1));
		System.out.println("sdf3.format(x2): " + sdf3.format(x2));
		System.out.println("sdf3.format(x3): " + sdf3.format(x3));
		System.out.println("sdf3.format(x4): " + sdf3.format(x4));
		
		System.out.println("sdf3.format(y1): " + sdf3.format(y1));
		System.out.println("sdf3.format(y2): " + sdf3.format(y2));
		System.out.println("sdf3.format(y3): " + sdf3.format(y3));
		
		
		
		

	}

}
