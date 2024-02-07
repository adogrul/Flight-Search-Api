package Flight;

import jakarta.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departureAirport;
    private String arrivalAirport;
    private Date departureDateTime;
    private Date returnDateTime;
    private double price;

    public Long getId() {
        return id;
    }public void setId(Long id) {
        this.id = id;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Date getReturnDateTime() {
        return returnDateTime;
    }public void setReturnDateTime(Date returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public double getPrice() {
        return price;
    }public void setPrice(double price) {
        this.price = price;
    }
}
