package com.zafar.ImageUsingHibernate;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	FileInfo fileInfo= new FileInfo();
        fileInfo.setId(1);
        fileInfo.setFileName("my photo");
        FileInputStream fileInputStream=new FileInputStream("src/main/java/tree.jpg");
        byte[] data=new byte[fileInputStream.available()];
        fileInputStream.read(data);
        fileInfo.setImage(data);
        System.out.println(fileInfo);
        System.out.println( "Image Program :" );
        System.out.println(fileInfo.getId());
        System.out.println(fileInfo.getFileName());
        System.out.println(fileInfo.getImage());
        Configuration configuration=new Configuration();
        configuration.configure("server.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
     
        
        
        Session session = factory.openSession();
        session.save(fileInfo);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        System.out.println("done");
        session.close();
        
    }
}
