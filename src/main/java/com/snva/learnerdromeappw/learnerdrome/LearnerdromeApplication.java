package com.snva.learnerdromeappw.learnerdrome;

import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.Role;
import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.User;
import com.snva.learnerdromeappw.learnerdrome.repository.RoleRepository;
import com.snva.learnerdromeappw.learnerdrome.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class LearnerdromeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnerdromeApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository) {
//        return args -> {
//            Role adminRole = roleRepository.findByRoleName("Admin");
//            if (adminRole == null) {
//                adminRole = new Role();
//                adminRole.setRoleName("Admin");
//                roleRepository.save(adminRole);
//            }
//            Role learnerRole = roleRepository.findByRoleName("Learner");
//            if (learnerRole == null) {
//                learnerRole = new Role();
//                learnerRole.setRoleName("Learner");
//                roleRepository.save(learnerRole);
//
//            }
//            Role instructorRole = roleRepository.findByRoleName("Instructor");
//            if (instructorRole == null) {
//                instructorRole = new Role();
//                instructorRole.setRoleName("Instructor");
//                roleRepository.save(instructorRole);
//            }
//
//            List<Role> jackRoles = new ArrayList<>();
//            jackRoles.add(adminRole);
//            jackRoles.add(learnerRole);
//            jackRoles.add(instructorRole);
//            // create a user
//            User jack = userRepository.findByEmail("jack@snva.com");
//            if (jack == null) {
//                jack = new User();
//                jack.setFirstName("jack");
//                jack.setEmail("jack@snva.com");
//                jack.setContact("+11111111");
//                jack.setLastName("Feng");
//                jack.setProfilePicture("fjdkjfkjdkfj");
//                jack.setRoles(jackRoles);
//            }
//            userRepository.save(jack);
//        };

}
