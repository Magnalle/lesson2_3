import java.util.HashMap;
import java.util.ArrayList;

public class PhoneBook {
    HashMap<String, ArrayList<Person>> persons;
    PhoneBook(){
        persons = new HashMap<String, ArrayList<Person>>();
    }
    void AddPerson(String secondName, String phone, String email){
        ArrayList<Person> personsList;
        if(!persons.containsKey(secondName)){
            personsList = new ArrayList<Person>();
            persons.put(secondName, personsList);
        }
        else
            personsList = persons.get(secondName);
        personsList.add(new Person(phone, email));
    }

    ArrayList<String> findPhone(String secondName){
        ArrayList<String> result = new ArrayList<String>();
        if(!persons.containsKey(secondName))
            return result;
        for(Person person: persons.get(secondName)){
            result.add(person.phone);
        }
        return result;
    }

    ArrayList<String> findEmail(String secondName){
        ArrayList<String> result = new ArrayList<String>();
        if(!persons.containsKey(secondName))
            return result;
        for(Person person: persons.get(secondName)){
            result.add(person.email);
        }
        return result;
    }
}
