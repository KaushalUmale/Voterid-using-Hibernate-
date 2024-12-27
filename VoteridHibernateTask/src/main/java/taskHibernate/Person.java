package taskHibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Person {
    @Id
    private int aadhar_id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "voter_id")
    private VotingCard votingCard;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Person() {}

	public Person(int aadhar_id, String name, VotingCard votingCard, Address address) {
		super();
		this.aadhar_id = aadhar_id;
		this.name = name;
		this.votingCard = votingCard;
		this.address = address;
	}

	public int getAadhar_id() {
		return aadhar_id;
	}

	public void setAadhar_id(int aadhar_id) {
		this.aadhar_id = aadhar_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VotingCard getVotingCard() {
		return votingCard;
	}

	public void setVotingCard(VotingCard votingCard) {
		this.votingCard = votingCard;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [aadhar_id=" + aadhar_id + ", name=" + name + ", votingCard=" + votingCard + ", address="
				+ address + "]";
	}
    
    
}

  