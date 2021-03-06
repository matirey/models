package com.utn.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Marcosp on 18/6/2018.
 */
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @NotEmpty(message = "Name is required.")
    @Column(name = "name", columnDefinition = "varchar(20)", unique = true, nullable = false)
    private String name;

    @NotEmpty(message = "Pass is required.")
    @Column(name = "pass", columnDefinition = "varchar(20)", nullable = false)
    private String pass;
}
