package de.hnu.eae;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.hnu.eae.data.Professor;

@Stateless
@Path("Professor")

public class ProfessorWS {

    @PersistenceContext(unitName = "AiTutorDB")
    private EntityManager em2;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Professor createProfessor(Professor professor) {
        em2.persist(professor);
        return professor;
    }

    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Professor getProfessor(@PathParam("id") long id) {
        return em2.find(Professor.class, id);
    }

    @DELETE
    @Path("{id}")
    public void deleteProfessor(@PathParam("id") long id) {
        em2.remove(em2.find(Professor.class, id));
    }

}
