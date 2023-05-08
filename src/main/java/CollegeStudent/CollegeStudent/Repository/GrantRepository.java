package CollegeStudent.CollegeStudent.Repository;

import CollegeStudent.CollegeStudent.Models.Grant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GrantRepository extends JpaRepository<Grant,String> {
    @Query(value = "SELECT g.grantGiven FROM Grant g JOIN CollegeStudent s ON g.branchName = s.branchName WHERE s.marks >= 40 GROUP BY g.branchName ORDER BY COUNT(*) DESC LIMIT 1", nativeQuery = true)
    int findGrantGivenToMaxPassingBranch();
}
