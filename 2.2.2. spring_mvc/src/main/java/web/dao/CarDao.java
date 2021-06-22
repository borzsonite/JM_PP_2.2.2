package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Honda", "red",1));
        cars.add(new Car("Toyota", "blue",2));
        cars.add(new Car("Mercedes", "white",3));
        cars.add(new Car("Lada", "green",4));
        cars.add(new Car("Kia", "red",3));
    }

    public List<Car> getCars() {
        return cars;
    }
}
