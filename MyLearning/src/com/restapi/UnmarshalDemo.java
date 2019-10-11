package com.restapi;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshalDemo {

	public static void main(String[] args){
		
		try {
			 //getting the xml file to read
			File file = new File(System.getProperty("user.dir")+"/file/student.xml");
			
			 //creating the JAXB context
			JAXBContext objJAXBContect = JAXBContext.newInstance(Student.class);
			
			 //creating the unmarshall object
			Unmarshaller objUnmarshaller = objJAXBContect.createUnmarshaller();
			
			//calling the unmarshall method
			Student student=(Student) objUnmarshaller.unmarshal(file);
			
			System.out.println(student.getName()+" "+student.getId()+" "+student.getSubject());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
