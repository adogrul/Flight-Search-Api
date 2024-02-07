package Flight;

import Flight.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightRepository flightRepository;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightRepository.save(flight);
    }

    @PutMapping("/{id}")
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight flightDetails) {
        Flight flight = flightRepository.findById(id).orElse(null);
        if (flight != null) {
            flight.setDepartureAirport(flightDetails.getDepartureAirport());
            flight.setArrivalAirport(flightDetails.getArrivalAirport());
            flight.setDepartureDateTime(flightDetails.getDepartureDateTime());
            flight.setReturnDateTime(flightDetails.getReturnDateTime());
            flight.setPrice(flightDetails.getPrice());
            return flightRepository.save(flight);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightRepository.deleteById(id);
    }
}
