package com.java8;
import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  

class Device{  
    int id;  
    String name;  
    float price;  
      
    public Device(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<Device> deviceList = new ArrayList<Device>();  
        //Adding Products  
        deviceList.add(new Device(1,"HP Laptop",25000f));  
        deviceList.add(new Device(2,"Dell Laptop",30000f));  
        deviceList.add(new Device(3,"Lenevo Laptop",28000f));  
        deviceList.add(new Device(4,"Sony Laptop",28000f));  
        deviceList.add(new Device(5,"Apple Laptop",90000f));  
        List<Float> devicePriceList =   
                deviceList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list 
        
        List<Device> list = deviceList.stream().filter(x->x.price>50000)
        .collect(Collectors.toList());  // collecting as list 
        
        List<String> list1 = deviceList.stream().filter(x->x.price>50000)
        		.map(x->x.name)
        .collect(Collectors.toList());  // collecting only names as list 
        
        deviceList.stream().filter(x->x.price>50000)
		.map(x->x.name).forEach(System.out::println);
        
        System.out.println(devicePriceList); 
        
         Long noOfElements = deviceList.stream()  
                .collect(Collectors.counting());  
        
        for(Device d:list){
        	System.out.println(d.id);
        	System.out.println(d.name);
        	System.out.println(d.price);
        }
        
        System.out.println(list1);
    }  
}  