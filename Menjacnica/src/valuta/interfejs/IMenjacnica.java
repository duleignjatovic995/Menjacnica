package valuta.interfejs;

import java.util.GregorianCalendar;
import java.util.List;

import valuta.DnevniKurs;

public interface IMenjacnica {
	public void dodajDnevniKurs(GregorianCalendar datum);
	public void obrisiDnevniKurs(GregorianCalendar datum);
	public List<DnevniKurs>pronadjiKurs(GregorianCalendar datum);
}
