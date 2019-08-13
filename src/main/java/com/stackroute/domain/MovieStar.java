package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class MovieStar {
    @Id
    private int id;
    private String name;
    private String gender;
    private int age;

}
