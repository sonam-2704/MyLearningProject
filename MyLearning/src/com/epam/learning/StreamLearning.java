package com.epam.learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import com.beust.jcommander.JCommander.Builder;
import com.epam.learning.Person.GENDER;

public class StreamLearning {
	

	public static void main(String[] args) {
		
		/*
		final Person nitesh=new Person();
		nitesh.setId(1);
		nitesh.setName("Nitesh");
		nitesh.setGender(GENDER.MALE);
		nitesh.setSalary(100000.00);
		
		final Person meeta=new Person();
		meeta.setId(2);
		meeta.setName("Meeta");
		meeta.setGender(GENDER.FEMALE);
		meeta.setSalary(100000.00);
		
		final Person sonam=new Person();
		sonam.setId(3);
		sonam.setName("Sonam");
		sonam.setGender(GENDER.FEMALE);
		sonam.setSalary(100000.00);
	
		
		List<Person> persons=Arrays.asList(nitesh,meeta,sonam);
		
		
		Stream<Person> stream=persons.stream();
		
		stream.filter(n->n.getGender()==GENDER.MALE).forEach(System.out::println);
		
		Path path = Paths.get("");
		
		try(Stream<Path> dirs=Files.walk(path))
		{
			dirs.parallel().filter(n->Files.isDirectory(n)).skip(10).forEach(System.out::println);
		}
		catch(final IOException exc)
		{
			
		}
		
		//Stream<String>  = Stream.builder();
		
		Stream.generate(Math::random);
		
		Stream<Integer> _stream=Stream.iterate(1, n->n+1).parallel().filter(PrimeUtil::isPrime).limit(1000);
		Iterator<Integer> it=_stream.iterator();
		_stream.sequential();
		while(it.hasNext())
		{
			
		}
			
	*/
		
		/*
		
		java.util.stream.Stream.Builder<String> builder = Stream.<String>builder();
		
		builder.add("Nitesh").add("Sonam").build();
		
		*/
		
		final Path path = Paths.get("D:\\selenium.txt");
		
		try(Stream<String> errorStream=Files.lines(path))
		{
			errorStream.filter(n->n.contains("error")).forEach(System.out::println);
			
		}
		catch(final IOException exc)
		{
			
		}
	}

}
