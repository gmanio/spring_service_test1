package com.gman.repository;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gmanpark on 2015. 11. 10..
 */

@Entity
@Table(name="tb_test")
public class RepoTest implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "address", nullable = false)
    private String address;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
