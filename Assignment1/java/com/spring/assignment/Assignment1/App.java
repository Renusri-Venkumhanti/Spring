package com.spring.assignment.Assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cntx = new ClassPathXmlApplicationContext("configuration.xml");
        Movie movie = (Movie)cntx.getBean("movie");
        
        System.out.println("Movie Id" +movie.getMovieId());
        System.out.println("Movie Name" +movie.getMovieName());
        System.out.println("Movie Actor" +movie.getMovieActor());
    }
}
