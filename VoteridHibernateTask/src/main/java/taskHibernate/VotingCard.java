package taskHibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
public class VotingCard {
    @Id
    
    private String voterId;

    private String constituency;

    @OneToOne(mappedBy="votingCard",cascade = CascadeType.ALL)
    private Person person;

    public VotingCard() {}

    public VotingCard(String voterId, String constituency) {
        this.voterId = voterId;
        this.constituency = constituency;
    }

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "VotingCard [voterId=" + voterId + ", constituency=" + constituency + ", person=" + person + "]";
	}

    
}
