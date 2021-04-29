package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Component
public class MyController {
    File file;
    @Value("${originalFileName}")
    String originalFileName;
    @Value("${newFileName}")
    String newFileName;

    @PostConstruct
    public void hashFile() throws IOException {
        file = new File(originalFileName);

        if(!file.exists() && newFileName != null || file.length() == 0){
            FileWriter writer = new FileWriter(newFileName);
            writer.write("null");
            writer.flush();
            writer.close();
        }

        else{
            FileReader reader = new FileReader(originalFileName);
            FileWriter writer = new FileWriter(newFileName);

            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()){
                writer.write(Integer.toString(sc.nextLine().hashCode()));
            }

            reader.close();
            writer.flush();
            writer.close();
        }
    }

    @PreDestroy
    public void destroy(){
        if(file.exists()){
            file.delete();
        }
    }
}
