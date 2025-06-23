package com.prasath.spring_boot_rest.service;


import com.prasath.spring_boot_rest.model.JobApp;
import com.prasath.spring_boot_rest.repo.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class jobservice {
    @Autowired
    private jobRepo repo;
    public void addjob(JobApp jo){
        repo.addjob(jo);
    }
    public List<JobApp> getAllJob(){
        return repo.getAllJob();
    }

    public JobApp viewJob(int pi) {
        return repo.viewJob(pi);
    }

    public void updateJob(JobApp jj) {
        repo.updateJob(jj);
    }

    public void deleteJob(int jj) {
        repo.deleteJob(jj);
    }
}
