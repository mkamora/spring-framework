package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CydeoApplications {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

//        SpringApplication.run(CydeoApplications.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(CydeoApplications.class);

        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(comment);
    }

}
