package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PersonService {

    public Person getPerson(Long id) {
        return Person.findById(id);
    }

    @Transactional
    public void addPersonList(List<Person> personList) {
        for (Person person : personList) {
            person.persist();
        }
    }

    public List<Person> getAllPersons() {
        return Person.listAll();
    }

    @Transactional
    public void deletePersonById(Long id) {
        Person.deleteById(id);
    }

    @Transactional
    public void updatePerson(Person person) {
        Person entity = Person.findById(person.getId());
        entity.setNama(person.getNama());
        entity.setJk(person.getJk());
        entity.setAlamat(person.getAlamat());
        entity.setUmur(person.getUmur());
        entity.setPekerjaan(person.getPekerjaan());
        entity.setHobi(person.getHobi());
        entity.setStatus(person.getStatus());
    }
}
