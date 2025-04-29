package com.example.Gym.Manager.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.Gym.Manager.Model.Members;
import com.example.Gym.Manager.Repository.MembersRepo;

@Component
public class MemberService {

    @Autowired
    private MembersRepo mRepo;

    public List<Members> getMembers(){
        return mRepo.findAll();
    }

    public void addMember(Members member){
        mRepo.save(member);
    }

    public boolean deleteMember(long id){
        if(mRepo.existsById(id)){
            mRepo.deleteById(id);
            return true;
        }
        else{
            return false;
        }
        
    }

    public void updateMember(long id, Members member){
        Members m = mRepo.findById(id).orElse(null);
        if(m != null){
            m.setName(member.getName());
            m.setAge(member.getAge());
            m.setEmail(member.getEmail());
            mRepo.save(m);
        }
    }
}
