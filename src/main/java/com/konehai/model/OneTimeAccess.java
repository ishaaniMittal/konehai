package com.konehai.model;

/**
 * Created by HP on 15-02-2017.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="otp")
public class OneTimeAccess {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "access_code")
    private int passcode;
    @Column(name = "generation_time")
    private Timestamp generationTime;

    public Timestamp getGenerationTime() {
        return generationTime;
    }

    public void setGenerationTime(Timestamp generationTime) {
        this.generationTime = generationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }
}
