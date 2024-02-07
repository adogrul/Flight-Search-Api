package thirdPartyAPI;
import Flight.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FlightDataFetcher {

    @Autowired
    private FlightRepository flightRepository;

    // Her gün saat 00:00'da çalışacak olan metot
    @Scheduled(cron = "0 0 0 * * *")
    public void fetchFlightData() {
        // yapay veri ürettim
        Flight flight1 = new Flight();
        flight1.setDepartureAirport("IST");
        flight1.setArrivalAirport("LHR");
        flight1.setDepartureDateTime(new Date());
        flight1.setPrice(200.0);

        Flight flight2 = new Flight();
        flight2.setDepartureAirport("LHR");
        flight2.setArrivalAirport("IST");
        flight2.setDepartureDateTime(new Date());
        flight2.setPrice(250.0);

        flightRepository.save(flight1);
        flightRepository.save(flight2);

        System.out.println("Flight.Flight data fetched and saved to database.");
    }
}

