package com.prasath.spring_boot_rest.repo;
import com.prasath.spring_boot_rest.model.JobApp;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
@Repository
public class jobRepo {
    List<JobApp> j=new ArrayList<>(Arrays.asList(new JobApp(101,"java","i am here to done",2,new ArrayList<>(Arrays.asList("java","python"))),
            new JobApp(102,"javascript","i am here to done",2,new ArrayList<>(Arrays.asList("javascript","python"))),
        new JobApp(103,"java","i am here to done",2,new ArrayList<>(Arrays.asList("java","python")))));
    public void addjob(JobApp jj){
        System.out.println(jj);
        this.j.add(jj);
        System.out.println(this.j);
    }
    public List<JobApp> getAllJob(){
        return j;
    }

    public JobApp viewJob(int pi) {
        for(JobApp jj:j){
            if(jj.getPostId()==pi){
                return jj;
            }
        }
        return null;
    }

    public void updateJob(JobApp jj) {
        for(JobApp j1:j){
            if(j1.getPostId()==jj.getPostId()){
                j1.setPostProfile(jj.getPostProfile());
                j1.setPostDesc(jj.getPostDesc());
                j1.setReqExperience(jj.getReqExperience());
                j1.setPostTechStack(jj.getPostTechStack());
            }
        }
    }

    public void deleteJob(int jj) {
        Iterator<JobApp> iterator = j.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getPostId()==jj){
                iterator.remove();
            }
        }
    }
}
