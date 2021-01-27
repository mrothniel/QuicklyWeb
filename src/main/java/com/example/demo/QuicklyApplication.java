package com.example.demo;

import com.example.demo.entities.Coc_exercice;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.annotation.XmlRootElement;

@SpringBootApplication
public class QuicklyApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(QuicklyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
