package valuta.interfejs;

import java.util.GregorianCalendar;

import valuta.DnevniKurs;
import valuta.Valuta;

public interface IMenjacnica {
	public void dodajDnevniKurs(Valuta valuta, GregorianCalendar datum, double kupovniKurs, double prodajniKurs, double srednjiKurs);
	public void obrisiDnevniKurs(GregorianCalendar datum);
	public DnevniKurs pronadjiKurs(GregorianCalendar datum);
}
