package com.konehai.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by HP on 17-02-2017.
 */
@Entity
@Table(name="society")
public class Society {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="society_code")
    private String societyCode;
    @Column(name = "society_name")
    private String societyName;

    public String getSocietyCode() {
        return societyCode;
    }

    public void setSocietyCode(String societyCode) {
        this.societyCode = societyCode;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }
}

