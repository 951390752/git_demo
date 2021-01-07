package java5;
import java.util.GregorianCalendar;
public class homework9_5 {
	public static void main(String[] args) {
		GregorianCalendar object=new GregorianCalendar(2021,1,1);
		System.out.println(object.get(GregorianCalendar.YEAR)+"年"+ object.get(GregorianCalendar.MONTH)+"月"+ object.get(GregorianCalendar.DATE)+"日");
		object.setTimeInMillis(1234567898765L);
		System.out.println(object.get(GregorianCalendar.YEAR)+"年"+ object.get(GregorianCalendar.MONTH)+"月"+ object.get(GregorianCalendar.DATE)+"日");
		
	}

}
