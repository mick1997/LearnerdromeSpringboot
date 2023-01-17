package com.snva.learnerdromeappw.learnerdrome.model.forms;

import com.snva.learnerdromeappw.learnerdrome.model.dbmodel.Role;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;

@Data
public class UserForm {

    String firstName;
    String lastName;
    String email;
    String contact;
    String profilePicture;
    String password;
    List<Role> roles;
}
