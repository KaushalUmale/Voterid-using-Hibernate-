package taskHibernate;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class client {
    public static void main(String[] args) {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg4.xml");
    	cfg.addAnnotatedClass(Person.class);
    	cfg.addAnnotatedClass(Address.class);
    	cfg.addAnnotatedClass(VotingCard.class);
    	
    	 SessionFactory sessionFactory = cfg.buildSessionFactory();
    	 Session openSession = sessionFactory.openSession();
    	 Transaction tx = openSession.beginTransaction();
    	
        Address kpune = new Address(411052, "Karve Pune");

        VotingCard tms = new VotingCard("TMS1234", "Kothrud - Pune");
        VotingCard ars = new VotingCard("ARS5678", "Kothrud - Pune");
        VotingCard tka = new VotingCard("TKA6789", "Kothrud - Pune");

        Person p1 = new Person(6242, "Tejas Saraf", tms, kpune);
        Person p2 = new Person(1232, "Atul Raut",tms, kpune);
        Person p3 = new Person(5678, "Kiran Digrase", tka, kpune);

        kpune.setPersons(Arrays.asList(p1, p2, p3));
        openSession.save(kpune);
        
        Address Amravati = new Address(444605, "Daryapur Amravati");

        VotingCard acd = new VotingCard("rrg1234", "Daryapur-Amravati");
        VotingCard efd = new VotingCard("sg25678", "Daryapur-Amravati");
        VotingCard lmn = new VotingCard("tds6789", "Daryapur-Amravati");

        Person p11 = new Person(1022, "Sudesh gore", acd, Amravati);
        Person p21 = new Person(1562, " nikhil mohite", efd, Amravati);
        Person p31 = new Person(7148, "pratik bhise", lmn, Amravati);

        Amravati.setPersons(Arrays.asList(p11, p21, p31));
        openSession.save(Amravati);
   	 tx.commit();
   	 openSession.close();
   	
        
    }
}
