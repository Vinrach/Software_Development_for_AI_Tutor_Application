package de.hnu.eae;

//import java.util.List;

import javax.ejb.Stateless;
//import javax.persistence.Query;
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

import de.hnu.eae.data.Student;

@Stateless
@Path("student")
public class StudentWS {
    
  
    @PersistenceContext(unitName = "AiTutorDB")
    private EntityManager em3;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Student createStudent(Student student) {
        em3.persist(student);
        return student;
    }

    @GET
    @Path("{matrNr}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("matrNr") long matrNr) {
        return em3.find(Student.class, matrNr);
    }

   // @GET
   // @Path("")
   // @Consumes(MediaType.APPLICATION_JSON)
   // @Produces(MediaType.APPLICATION_JSON)
   // public List<Student> getStudent() {
   //     Query q = em3.createQuery("SELECT s FROM Student s");
       //Query q = em3.createNativeQuery("SELECT * FROM student", Student.class);
   //     return q.getResultList();
   // }

    
    @DELETE
    @Path("{matrNr}") 
    public void deleteStudent(@PathParam("matrNr") long matrNr) {
        em3.remove(em3.find(Student.class, matrNr));
    }

}
