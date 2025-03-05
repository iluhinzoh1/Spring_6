package web.Service;

import org.springframework.stereotype.Service;
import web.Car;

import java.util.List;

@Service
public class CarServiseImpl implements CarService {
    @Override
    public List<Car> carsCount(List list, Integer count) {
        return list.stream().limit(count).toList();
    }
}
