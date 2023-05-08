package CollegeStudent.CollegeStudent.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "grant")
public class Grant {
    @Id
    private String branchName;
    private int grantGiven;

    // getters and setters
}