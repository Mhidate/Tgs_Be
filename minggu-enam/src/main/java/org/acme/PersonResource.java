package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonService personService;

    @GET
    @Path("/{id}")
    public Person getPerson(@PathParam("id") Long id) {
        return personService.getPerson(id);
    }

    @POST
    public void addPersonList(List<PersonDTO> personDTOList) {
        List<Person> personList = new ArrayList<>();
        for (PersonDTO personDTO : personDTOList) {
            personList.add(new Person(personDTO.getNama(), personDTO.getJk(), personDTO.getAlamat(), personDTO.getUmur(), personDTO.getPekerjaan(), personDTO.getHobi(), personDTO.getStatus()));
        }
        personService.addPersonList(personList);
    }

    @GET
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PUT
    @Path("/{id}")
    public void updatePerson(@PathParam("id") Long id, Person person) {
        person.setId(id);
        personService.updatePerson(person);
    }

    @DELETE
    @Path("/{id}")
    public void deletePersonById(@PathParam("id") Long id) {
        personService.deletePersonById(id);
    }

}

