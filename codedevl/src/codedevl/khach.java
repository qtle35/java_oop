package codedevl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class khach{
	private String ten,ma,tt;
	Date eday;
	Date sday;
	private Long dif;
	public khach(String ten, String ma, String sday, String eday) throws ParseException {
		super();
		this.ten = ten;
		this.ma = ma;
		this.sday = new SimpleDateFormat("dd/MM/yyyy").parse(sday);
		this.eday = new SimpleDateFormat("dd/MM/yyyy").parse(eday);
	}
	
	public long getDif() {
		return (long) ((eday.getTime() - sday.getTime())/(24*60*60*1000));
	}


	@Override
	public String toString() {
		return tt+" "+ten+" "+ ma + " "+this.getDif();
	}

	public String getTt() {
		return tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}
	
}
