package pl.kowalecki.carsapi.model;

import javax.persistence.*;
import java.time.Year;

@Entity
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;
    private String model;
    private String body;//nadwozie
    private String fuelType;
    private Long engineCapacity;
    private Long enginePower;
    private Year prodYear;
    private String countryProd;
    private String colour;
    private Long vin;
    private Float fuelUsage;
    private String gearBoxType;
    private String gearBoxLevel;

    public Car() {
    }

    public Car(String mark, String model, String body, String fuelType, Long engineCapacity, Long enginePower, Year prodYear, String countryProd, String colour, Long vin, Float fuelUsage, String gearBoxType, String gearBoxLevel) {
        this.mark = mark;
        this.model = model;
        this.body = body;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.prodYear = prodYear;
        this.countryProd = countryProd;
        this.colour = colour;
        this.vin = vin;
        this.fuelUsage = fuelUsage;
        this.gearBoxType = gearBoxType;
        this.gearBoxLevel = gearBoxLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Long getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Long engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Long getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Long enginePower) {
        this.enginePower = enginePower;
    }

    public Year getProdYear() {
        return prodYear;
    }

    public void setProdYear(Year prodYear) {
        this.prodYear = prodYear;
    }

    public String getCountryProd() {
        return countryProd;
    }

    public void setCountryProd(String countryProd) {
        this.countryProd = countryProd;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Long getVin() {
        return vin;
    }

    public void setVin(Long vin) {
        this.vin = vin;
    }

    public Float getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(Float fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public String getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(String gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public String getGearBoxLevel() {
        return gearBoxLevel;
    }

    public void setGearBoxLevel(String gearBoxLevel) {
        this.gearBoxLevel = gearBoxLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", enginePower=" + enginePower +
                ", prodYear=" + prodYear +
                ", countryProd='" + countryProd + '\'' +
                ", colour='" + colour + '\'' +
                ", vin=" + vin +
                ", fuelUsage=" + fuelUsage +
                ", gearBoxType='" + gearBoxType + '\'' +
                ", gearBoxLevel='" + gearBoxLevel + '\'' +
                '}';
    }

}
