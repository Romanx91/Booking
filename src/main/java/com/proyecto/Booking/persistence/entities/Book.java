package com.proyecto.Booking.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column
    private String title;

    @Column
    private String author;



    @Column
    private Integer pageCount;

    @JsonProperty("dateRead")
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column
    private Date dateRead;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Date getDateRead() {
        return dateRead;
    }

    public void setDateRead(Date dateRead) {
        this.dateRead = dateRead;
    }
}