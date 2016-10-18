package proyectoempresamultinivel.web.controlador;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.DualListModel;
 
@ManagedBean(name="prod")
public class controladorVerProductos {

    private List<String> cities;
    private DualListModel<String> cities2;
     
    @PostConstruct
    public void init() {
        //Cities
        cities = new ArrayList<String>();
        cities.add("San Francisco");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
        
        //cities2
        List<String> citiesSource = new ArrayList<String>();
        List<String> citiesTarget = new ArrayList<String>();
        citiesSource.add("San Francisco");
        citiesSource.add("London");
        citiesSource.add("Paris");
        citiesSource.add("Istanbul");
        citiesSource.add("Berlin");
        citiesSource.add("Barcelona");
        citiesSource.add("Rome");
        cities2 = new DualListModel<String>(citiesSource, citiesTarget);
    }
    
    public DualListModel<String> getCities2() {
		return cities2;
	}

	public void setCities2(DualListModel<String> cities2) {
		this.cities2 = cities2;
	}

	public List<String> getCities() {
        return cities;
    }
 
    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}