package web;

import java.util.Objects;

public class Car {
    String model;
    int age;
    int mileage;

    public Car() {
    }

    public Car(String model, int age, int mileage) {
        this.model = model;
        this.age = age;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && mileage == car.mileage && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, age, mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", mileage=" + mileage +
                '}';
    }
}

