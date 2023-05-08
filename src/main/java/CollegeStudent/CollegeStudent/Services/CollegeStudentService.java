package CollegeStudent.CollegeStudent.Services;

import CollegeStudent.CollegeStudent.Repository.CollegeStudentRepository;
import CollegeStudent.CollegeStudent.Repository.GrantRepository;
import CollegeStudent.CollegeStudent.Repository.MarksBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  CollegeStudent.CollegeStudent.Models.*;
import  CollegeStudent.CollegeStudent.Models.*;

import java.util.List;

@Service
public class CollegeStudentService {
    @Autowired
    CollegeStudentRepository collegeStudentRepository;
    @Autowired
    MarksBranchRepository marksBranchRepository;
    @Autowired
    GrantRepository grantRepository;


    public CollegeStudent addStudent(CollegeStudent student) {
       collegeStudentRepository.save(student);
       return student;

    }

    public List<String> findHodContactWithMaxPassingStudents() {
        List<String> contacts=marksBranchRepository.findHodContactWithMaxPassingStudents();
        return contacts;
    }

    public List<Integer> findRollNoOfRecentBranch() {
        return collegeStudentRepository.findRollNoOfRecentBranch();
    }

    public int findGrantGivenToMaxPassingBranch() {
        return grantRepository.findGrantGivenToMaxPassingBranch();

    }
}
