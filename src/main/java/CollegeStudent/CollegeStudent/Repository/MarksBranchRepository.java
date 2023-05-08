package CollegeStudent.CollegeStudent.Repository;

import CollegeStudent.CollegeStudent.Models.MarksBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarksBranchRepository extends JpaRepository<MarksBranch,String> {
    @Query(value = "SELECT m.contactNo FROM MarksBranch m JOIN CollegeStudent s ON m.branchName = s.branchName WHERE s.marks >= 40 GROUP BY m.contactNo ORDER BY COUNT(*) DESC LIMIT 1", nativeQuery = true)
    List<String> findHodContactWithMaxPassingStudents();

//    @Query(value = "SELECT rollNo FROM CollegeStudent WHERE branchName = (SELECT branchName FROM CollegeStudent ORDER BY rollNo DESC LIMIT 1)", nativeQuery = true)
//    List<Integer> findRollNoOfRecentBranch();
}
