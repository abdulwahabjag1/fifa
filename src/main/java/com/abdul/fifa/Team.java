package com.abdul.fifa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    private String name;
    private int points, wins, losses, ties;
    private String category;

    public int getPoints(){
        points = 3*wins+ties;
        return points;
    }
}
