package CollegeStudent.CollegeStudent.Repository;

import CollegeStudent.CollegeStudent.Models.CollegeStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeStudentRepository extends JpaRepository<CollegeStudent,Integer> {
    @Query(value = "SELECT rollNo FROM CollegeStudent WHERE branchName = (SELECT branchName FROM CollegeStudent ORDER BY rollNo DESC LIMIT 1)", nativeQuery = true)
    List<Integer> findRollNoOfRecentBranch();
}
