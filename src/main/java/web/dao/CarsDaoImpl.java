package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarsDaoImpl implements CarsDao{
//    @Override
//    public List<Car> carList(Integer count) {
//        return null;
//    }
    private final List<Car> carlist;
    {
        carlist=new ArrayList<>();
        carlist.add(new Car(1,"BMV", 3, 2021));
        carlist.add(new Car(2,"Mazda", 323, 2011));
        carlist.add(new Car(3,"Volvo", 740, 2013));
        carlist.add(new Car(4,"Moskvich", 412, 1988));
        carlist.add(new Car(5,"Audi", 6, 2010));
    }
    @Override
    public List<Car> carList(Integer count) {
        return carlist.stream().limit(count).collect(Collectors.toList());
    }
}
