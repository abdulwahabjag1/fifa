package com.abdul.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class MatchService {
    @Autowired
    private MatchRepo mrepo;
    private List<Team> teams = new ArrayList<Team>();
    public List<Matches> getAllMatches(){
        return mrepo.findAll();
    }
    public List<Team> getAllTeams(){
        return teams;
    }
}
