package CollegeStudent.CollegeStudent.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "marksbranch")
public class MarksBranch {
    @Id
    private String branchName;
    private String hodName;
    private String contactNo;




}