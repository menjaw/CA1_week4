package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone implements Serializable {

    //Variables
    private static final long serialVersionUID = 1L;
    @Id
    private String number;
    private String description;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private InfoEntity infoEntity;
   
    //Constructors
    public Phone() {
    }

    public Phone(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InfoEntity getInfoEntity() {
        return infoEntity;
    }

    public void setInfoEntity(InfoEntity infoEntity) {
        this.infoEntity = infoEntity;
    }

    @Override
    public String toString() {
        return "Phone{" + "number=" + number + ", description=" + description + ", infoEntity=" + infoEntity + '}';
    }
}
