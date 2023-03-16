package org.acme;

import java.time.LocalDate;
//import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "kebun")
public class Kebun {
    @Id
    @GeneratedValue
    public UUID id;
    
    public String komoditas;
    public Integer total;

    @Column(name = "created_at")
    private LocalDate createdAt;
    
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    
    
}
