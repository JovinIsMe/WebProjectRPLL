package model;
// Generated Mar 17, 2018 3:43:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cinema generated by hbm2java
 */
@Entity
@Table(name="cinema"
    ,catalog="threadther"
)
public class Cinema  implements java.io.Serializable {


     private String cinemaName;
     private String address;
     private String city;
     private String province;
     private Set<Studio> studios = new HashSet<Studio>(0);

    public Cinema() {
    }

	
    public Cinema(String cinemaName) {
        this.cinemaName = cinemaName;
    }
    public Cinema(String cinemaName, String address, String city, String province, Set<Studio> studios) {
       this.cinemaName = cinemaName;
       this.address = address;
       this.city = city;
       this.province = province;
       this.studios = studios;
    }
   
     @Id 

    
    @Column(name="cinema_name", unique=true, nullable=false, length=50)
    public String getCinemaName() {
        return this.cinemaName;
    }
    
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    
    @Column(name="address", length=200)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="city", length=50)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="province", length=50)
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cinema")
    public Set<Studio> getStudios() {
        return this.studios;
    }
    
    public void setStudios(Set<Studio> studios) {
        this.studios = studios;
    }




}

