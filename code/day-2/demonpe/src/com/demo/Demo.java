package com.demo;
class City{
    private String city;

    public City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                '}';
    }
}
class  Address{
    private City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
class Person{
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
public class Demo {
    public static void main(String[] args) {

        foo();
    }

    private static void foo() {
        City city=null;
        Address address=new Address(city);

        Person person=new Person(address);
        System.out.println(person.getAddress().getCity().getCity());
    }
}
