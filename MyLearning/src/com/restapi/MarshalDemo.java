package com.restapi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshalDemo {

	public static void main(String[] args){
		
		try {
			 //creating the JAXB context
			JAXBContext objJAXBContext = JAXBContext.newInstance(Student.class);
			
			//creating the marshaller object
			Marshaller objMarshaller = objJAXBContext.createMarshaller();
			
			//setting the property to show xml format output
			objMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			 //setting the values in POJO class
			Student student = new Student("Sonam", 1, "Maths");
			
			//calling the marshall method
			objMarshaller.marshal(student, new FileOutputStream(System.getProperty("user.dir")+"/file/student.xml"));
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
