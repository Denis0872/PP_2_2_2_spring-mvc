package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.dao.CarsDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImpl implements CarService{
    private CarsDao carsDao = new CarsDaoImpl();

    @Override
    public List<Car> carList(Integer count) {
        return carsDao.carList(count);
    }


}
