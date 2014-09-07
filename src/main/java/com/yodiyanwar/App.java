package com.yodiyanwar;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        
        Student student = new Student();
        student.setStudentName("Yodi");
        student.setStudentAge("19");

        session.save(student);
        session.getTransaction().commit();
        System.out.println("Great! Student was saved");
    }
}
