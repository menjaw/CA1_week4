package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Address implements Serializable {

    //Variables
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String additionalInfo;

    @OneToMany(mappedBy = "address")
    private List<InfoEntity> InfoEntities;

    @ManyToOne
    private CityInfo cityinfo;

    //Constructors
    public Address() {
    }

    public Address(String street, String additionalInfo,CityInfo cityinfo) {
        this.street = street;
        this.additionalInfo = additionalInfo;
        this.cityinfo = cityinfo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public List<InfoEntity> getInfoEntities() {
        return InfoEntities;
    }

    public void setInfoEntities(List<InfoEntity> InfoEntities) {
        this.InfoEntities = InfoEntities;
    }

    public void addInfoEntity(InfoEntity infoentity) {
        this.InfoEntities.add(infoentity);
    }

    public CityInfo getCityinfo() {
        return cityinfo;
    }

    public void setCityinfo(CityInfo cityinfo) {
        this.cityinfo = cityinfo;
    }

    @Override
    public String toString() {
        return "Street: " + street + "\n"
                + "AdditionalInfo: " + additionalInfo + "\n"
                + "InfoEntities: " + InfoEntities + "\n"
                + "Cityinfo=" + cityinfo + "\n";
    }
}
