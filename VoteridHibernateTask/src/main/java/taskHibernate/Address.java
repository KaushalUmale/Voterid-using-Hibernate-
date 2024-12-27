package taskHibernate;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int pin;
    private String cityName;

    @OneToMany(mappedBy="address",cascade = CascadeType.ALL)
    private List<Person> persons;

    public Address() {}

    public Address(int pincode, String cityName) {
        this.pin = pincode;
        this.cityName = cityName;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincode() {
		return pin;
	}

	public void setPincode(int pincode) {
		this.pin = pincode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

   
}
