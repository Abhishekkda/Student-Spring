package CollegeStudent.CollegeStudent.Models;

import CollegeStudent.CollegeStudent.Models.Enums.BranchName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "collegestudent")
public class CollegeStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String rollNo;
    @Enumerated(EnumType.STRING)
    private BranchName branchName;
    private int marks;



}
