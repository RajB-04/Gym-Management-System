package com.example.Gym.Manager.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Gym.Manager.Model.Members;
import com.example.Gym.Manager.Service.MemberService;

@RestController
@RequestMapping("/members")
public class MembersController {
    @Autowired
    private MemberService ms;

    @GetMapping("/")
    public List<Members> getMembers(){
        return ms.getMembers();
    }

    @PostMapping("/add")
    public void addMember(@RequestBody Members member){
        ms.addMember(member);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable long id){
        if (ms.deleteMember(id)) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // @PutMapping("/update/{id}")
    // public void updateMember(@PathVariable long id, @RequestBody Members member){
    //     ms.updateMember(id, member);   
    // }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateMember(@PathVariable long id, @RequestBody Members member) {
        boolean isUpdated = (boolean) ms.updateMember(id, member);
        if (isUpdated) {
            return ResponseEntity.status(HttpStatus.OK).body("Member updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Member not found");
        }
}

}
