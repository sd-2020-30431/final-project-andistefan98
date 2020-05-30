package entities;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    int id;


    @Column(name="name")
    String name;

    @OneToMany(mappedBy="departmentId")
    ArrayList<Doctor> doctorsList;

}
