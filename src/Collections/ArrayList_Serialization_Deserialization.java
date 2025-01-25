package Collections;

import java.io.*;
import java.util.*;

public class ArrayList_Serialization_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
       
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sanket");
        list.add("Amit");
        list.add("Rohan");
        list.add("Shubham");

        // Specify the file path
        File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\ser.txt");

//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            // Serialize the list to the file
        
        	FileOutputStream fos = new FileOutputStream(file);
        	ObjectOutputStream oos = new ObjectOutputStream(fos);
        		
           oos.writeObject(list);
           System.out.println("Serialization done. ArrayList is saved to file.");
        

           FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis);
           
           @SuppressWarnings("unchecked")
		   ArrayList<String> list2 = (ArrayList<String>) ois.readObject();
            
           System.out.println("Deserialized ArrayList: " + list2);
        
    }
}
