package com.onemount.cgv.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "film")
@Table(name = "film")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "premiere")
    @Temporal(TemporalType.TIMESTAMP)
    public Date premiere;

    @Column(name = "time")
    private int time;

    @Column(name = "directors")
    private String directors;

    @Column(name = "actor")
    private String actor;

    @Column(name = "national_production")
    private String nationalProduction;

    @Column(name = "genre")
    private String genre;

    @Column(name = "content")
    private String content;

    @Column(name = "poster")
    private String poster;

    @ManyToMany(mappedBy = "films", fetch = FetchType.LAZY)
    private List<Event> events;

    @OneToOne(fetch = FetchType.LAZY) @MapsId
    private Ticket ticket;

    @Column(name = "status")
    private String status; // sắp chiếu, đang chiếu

    public Film(String string, String string10, String string2, String string3, String string4, String string5, String string6,
            String string7, String string8, String string9) {
    }
}
