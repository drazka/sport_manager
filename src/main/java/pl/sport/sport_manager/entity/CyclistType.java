package pl.sport.sport_manager.entity;

import javax.persistence.*;

@Entity
@Table(name = "cyclist_type")
public class CyclistType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;

}
