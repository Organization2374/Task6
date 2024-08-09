package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", 1, 2005));
        cars.add(new Car("Toyota", 999, 1995));
        cars.add(new Car("BMW", 520, 2003));
        cars.add(new Car("Lada", 2107, 1999));
        cars.add(new Car("Mazada", 426, 1997));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
