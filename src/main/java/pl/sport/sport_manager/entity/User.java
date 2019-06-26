package pl.sport.sport_manager.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String login;

    private String email;

    private String password;

    private LocalDate dateOfBirth;

    private int age;

    private boolean isAdmin;

    @OneToMany
    List<Budget> budgetList = new ArrayList<>();


}
