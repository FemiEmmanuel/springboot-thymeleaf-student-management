// package com.oluwafemi.studentapp.configuration;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import com.oluwafemi.studentapp.model.User;
// import com.oluwafemi.studentapp.service.UserService;

// @Configuration
// public class UserLoader {

// @Bean
// public CommandLineRunner dataLoader(UserService userService) {
//     return args -> {
//         User admin = new User();
//         admin.setUsername("admin@studentapp.com");
//         admin.setPassword("adminpass");
//         admin.getRoles().add("ADMIN");
//         userService.createUser(admin);

//         User student = new User();
//         student.setUsername("student@example.com");
//         student.setPassword("studentpass");
//         student.getRoles().add("STUDENT");
//         userService.createUser(student);

//         User instructor = new User();
//         instructor.setUsername("instructor@example.com");
//         instructor.setPassword("instructorpass");
//         instructor.getRoles().add("INSTRUCTOR");
//         userService.createUser(instructor);
//     };
// }
// }
