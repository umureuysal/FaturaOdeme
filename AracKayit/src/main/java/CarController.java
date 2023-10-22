import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/add")
    public ResponseEntity<String> addCar(@RequestBody Car car, @RequestParam String username) {
        return carService.addCar(car, username);
    }

    @GetMapping("/by-user/{username}")
    public List<Car> getCarsByUser(@PathVariable String username) {
        return carService.getCarsByUser(username);
    }

    @DeleteMapping("/{plateNumber}")
    public ResponseEntity<String> deleteCar(@PathVariable String plateNumber) {
        return carService.deleteCar(plateNumber);
    }
}
