package org.example;

import org.example.dao.PersonDAO;
import org.example.model.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Configuration configuration= new Configuration();
        configuration.configure();
        SessionFactory factory=configuration.buildSessionFactory();

        PersonDAO personDAO = new PersonDAO(factory);

        System.out.println(personDAO.read(2).toString());

        Person person = new Person(2,"Natasha");
        personDAO.update(person);

        Person person1 = personDAO.read(1);
        personDAO.delete(person1);
        /*Person person1= new Person(1, "Tom");
        personDAO.create(person1);*/
        /*System.out.println(personDAO.readAll());*/
    }

}
