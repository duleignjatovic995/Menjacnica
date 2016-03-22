package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import valuta.interfejs.IMenjacnica;

public class DnevniKursKolekcija implements IMenjacnica{

	List<DnevniKurs> listaKurseva;

	public DnevniKursKolekcija() {
		listaKurseva = new LinkedList<>();
	}

	@Override
	public void dodajDnevniKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obrisiDnevniKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DnevniKurs> pronadjiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
