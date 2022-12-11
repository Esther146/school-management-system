package utility;

import enumeration.Course;
import model.Student;
import model.Teacher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderFile {
    public ArrayList<Object> canReadFromAFile(String filePath , Object object){
        //  String filePath = "StudentDataFile.csv";
        ArrayList<Object> arrayList = new ArrayList<>();
        String fileLine = " ";
        try {
            BufferedReader studentReader = new BufferedReader(new FileReader(filePath));
            while((fileLine = studentReader.readLine()) != null){
                while((fileLine = studentReader.readLine()) != null){
                    String[]  arrayValues = fileLine.split(",");
                    //   System.out.println(fileLine);
                    if (object instanceof Student){
                        object  = new Student(arrayValues[0] , Integer.parseInt(arrayValues[1]) ,  arrayValues[2] ,arrayValues[3]);
                        arrayList.add(object);
                        System.out.println(object);
                    } else if (object instanceof Teacher) {
                        object  = new Teacher(arrayValues[0], Integer.parseInt(arrayValues[1]));
                        arrayList.add(object);
                    } else if (object instanceof Course){
                        arrayList.add(object);
                    }
                }
            }
        }


        catch (IOException e){
            e.printStackTrace();
        }

        return  arrayList;
    }


}
