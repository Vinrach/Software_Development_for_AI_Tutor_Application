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

import de.hnu.eae.data.Course;
import de.hnu.eae.data.Student;

@Stateless
@Path("course")

public class CourseWS {
        
    @PersistenceContext(unitName = "AiTutorDB")
    private EntityManager em;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Course createCourse(Course course) {
        em.persist(course);
        return course;
    }


    @POST
    @Path("{matrNr}/{courseId}")
    public Student enroll(@PathParam("matrNr") long matrNr, @PathParam("courseId") long courseId){
        Student s = em.find(Student.class,matrNr);
        s.getCourseList().add(em.find(Course.class,courseId));
        em.merge(s);
        return s;
    }

    @GET
    @Path("{courseId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Course getCourse(@PathParam("courseId") long courseId) {
        return em.find(Course.class, courseId);
    }

    @DELETE
    @Path("{courseId}") 
    public void deleteCourse(@PathParam("courseId") long courseId) {
        em.remove(em.find(Course.class, courseId));
    }

}
