package CollegeStudent.CollegeStudent.Controller;

import CollegeStudent.CollegeStudent.Models.CollegeStudent;
import CollegeStudent.CollegeStudent.Services.CollegeStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class CollegeStudentController {
    @Autowired
    CollegeStudentService collegeStudentService;
    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody CollegeStudent collegeStudent){
        CollegeStudent collegeStudent1=collegeStudentService.addStudent(collegeStudent);
        return new ResponseEntity<>(collegeStudent1, HttpStatus.CREATED);
    }
    @GetMapping("/hod-contact")
    public ResponseEntity findHodContactWithMaxPassingStudents(){
        List<String> contacts=collegeStudentService.findHodContactWithMaxPassingStudents();
        return new ResponseEntity<>(contacts,HttpStatus.FOUND);

    }
    @GetMapping("/recent-branch-rollnos")
    public ResponseEntity findRollNoOfRecentBranch() {
        List<Integer> rollnos=collegeStudentService.findRollNoOfRecentBranch();
        return new ResponseEntity<>(rollnos,HttpStatus.FOUND);

    }
    @GetMapping("/max-passing-grant")
    public ResponseEntity findGrantGivenToMaxPassingBranch() {
        int grant= collegeStudentService.findGrantGivenToMaxPassingBranch();
        return new ResponseEntity<>(grant,HttpStatus.FOUND);
    }
}
