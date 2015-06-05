package laba.add10.autohouse;

//Описываем систему AutoHouse. В автохаусе на данный момент есть несколько различных машин. У каждой машины свой уникальный идентификатор.
//
//Реализовать следующие функции.
//        1) Добавление и удаление новых машин в/из автохаус(а).
//        2) Поиск машин по марке.
//        3) Поиск машин по году выпуска.
//        4) Сортировка по году.
//        5) Сортировка по цене.
//
//        Реализовать консольное меню.


import laba.add10.exeption.EmptyListException;

import java.util.*;

public class AutoHouse {
    private Map<Integer, Car> cars;

    public AutoHouse() {
        cars = new HashMap<>();
    }

    public void addCarInAutoHouse(CompanyEnum company, int constructYear, int price) {
        cars.put(generateID(), new Car(company, constructYear, price));
    }

    private int generateID() {
        int iD = new Random().nextInt(1000);
        return cars.containsKey(iD) ? generateID() : iD;
    }

    public Map<Integer, Car> getIDSortByConstructYear() throws EmptyListException {
        if (cars.isEmpty()) {
            throw new EmptyListException();
        }
        Map<Integer, Car> sortForConstructYear = new TreeMap<Integer, Car>(
                new Comparator() {
                    @Override
                    public int compare(Object first, Object second) {
                        Car getFirstCar = getCar(first);
                        Car getSecondCar = getCar(second);
                        int differenceYear = getFirstCar.getConstructYear() - getSecondCar.getConstructYear();
                        if (differenceYear == 0) {
                            int differenceCompany = getFirstCar.getCompany().compareTo(getSecondCar.getCompany());
                            if (differenceCompany == 0) {
                                int differencePrice = getFirstCar.getPrice() - getSecondCar.getPrice();
                                if (differencePrice == 0) {
                                    return 1;
                                } else {
                                    return differencePrice;
                                }
                            } else {
                                return differenceCompany;
                            }
                        } else {
                            return differenceYear;
                        }
                    }
                }
        );
        sortForConstructYear.putAll(new TreeMap<>(cars));
        return sortForConstructYear;
    }


    public Map<Integer, Car> getCarSortByPrice() throws EmptyListException {
        if (cars.isEmpty()) {
            throw new EmptyListException();
        }
        Map<Integer, Car> sortForPrice = new TreeMap<Integer, Car>(
                new Comparator() {
                    @Override
                    public int compare(Object first, Object second) {
                        Car getFirstCar = getCar(first);
                        Car getSecondCar = getCar(second);
                        int differencePrice = getFirstCar.getPrice() - getSecondCar.getPrice();
                        if (differencePrice == 0) {
                            int differenceYear = getFirstCar.getConstructYear() - getSecondCar.getConstructYear();
                            if (differenceYear == 0) {
                                int differenceCompany = getFirstCar.getCompany().compareTo(getSecondCar.getCompany());
                                if (differenceCompany == 0) {
                                    return 1;

                                } else {
                                    return differenceCompany;
                                }
                            } else {
                                return differenceYear;
                            }
                        } else

                        {
                            return differencePrice;
                        }

                    }
                }
        );
        sortForPrice.putAll(new TreeMap<>(cars));
        return sortForPrice;
    }

    public HashMap<Integer, Car> findIDCarForSpecifyCompany(CompanyEnum company) throws EmptyListException {
        List<Integer> listingID = new ArrayList<>(cars.keySet());
        findIDWithSpecifiedCompany(company, listingID);
        if (listingID.isEmpty()) {
            throw new EmptyListException();
        }
        return getCarsByID(listingID);
    }

    private HashMap<Integer, Car> getCarsByID(List<Integer> listingID) {
        HashMap<Integer, Car> findingCars = new HashMap<>();
        for (Integer iD : listingID) {
            findingCars.put(iD, cars.get(iD));
        }
        return findingCars;
    }

    public HashMap<Integer, Car> findIDCarForSpecifyConstructYear(int year) throws EmptyListException {
        List<Integer> listingID = new ArrayList<>(cars.keySet());
        findIDWithSpecifiedConstructYear(year, listingID);
        if (listingID.isEmpty())
            throw new EmptyListException();
        return getCarsByID(listingID);
    }

//    public HashMap<Integer, Car> findIDCarForSpecifyPrice(int price) throws EmptyListException {
//        List<Integer> listingID = new ArrayList<Integer>(cars.keySet());
//        findIDWithSpecifiedPrice(price, listingID);
//        if (listingID.isEmpty())
//            throw new EmptyListException();
//        return getCarsByID(listingID);
//    }

    public void removeCarForID(int iD) throws EmptyListException {
        if (cars.containsKey(iD)) {
            List<Integer> listingID = new ArrayList<>();
            listingID.add(iD);
            removeCarForIDList(listingID);
        } else {
            System.out.println("There are no car with this ID.");
        }
    }

    private void removeCarForIDList(List<Integer> listingID) throws EmptyListException {
        if (listingID.isEmpty()) {
            throw new EmptyListException();
        } else {
            for (Integer iD : listingID) {
                cars.remove(iD);
            }
        }
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, int constructYear, int price) throws EmptyListException {
        List<Integer> listingID = new ArrayList<>(cars.keySet());
        findIDWithSpecifiedCompany(companyEnum, listingID);
        findIDWithSpecifiedConstructYear(constructYear, listingID);
        findIDWithSpecifiedPrice(price, listingID);
        removeCarForIDList(listingID);
    }


    public void removeAllCar() {
        cars.clear();
    }

    private void findIDWithSpecifiedCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        if (companyEnum != null) {
            saveIDWithSpecifyCompany(companyEnum, listingID);
        }
    }

    private void saveIDWithSpecifyCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        int indexListingID = listingID.size() - 1;
        while (indexListingID > -1) {
            CompanyEnum companyValueForPreviousCar = cars.get(listingID.get(indexListingID)).getCompany();
            if (!companyValueForPreviousCar.equals(companyEnum)) {
                listingID.remove(indexListingID);
            }
            indexListingID--;
        }
    }

    private void findIDWithSpecifiedPrice(int price, List<Integer> listingID) {
        if (price > 0) {
            saveIDWithSpecifyPrice(price, listingID);
        }
    }

    private void saveIDWithSpecifyPrice(int price, List<Integer> listingID) {
        int indexListingID = listingID.size() - 1;
        while (indexListingID > -1) {
            if (!(cars.get(listingID.get(indexListingID)).getPrice() == price)) {
                listingID.remove(indexListingID);
            }
            indexListingID--;
        }
    }

    private void findIDWithSpecifiedConstructYear(int constructYear, List<Integer> listingID) {
        if (constructYear > 0) {
            saveIDWithSpecifyConstructYear(constructYear, listingID);
        }
    }

    private void saveIDWithSpecifyConstructYear(int constructYear, List<Integer> listingID) {
        int indexListingID = listingID.size() - 1;
        while (indexListingID > -1) {
            if (!(getConstructYearCar(listingID, indexListingID) == constructYear)) {
                listingID.remove(indexListingID);
            }
            indexListingID--;
        }
    }

    private int getConstructYearCar(List<Integer> listingID, int indexListingID) {
        return cars.get(listingID.get(indexListingID)).getConstructYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoHouse autoHouse = (AutoHouse) o;

        if (cars != null ? !cars.equals(autoHouse.cars) : autoHouse.cars != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return cars != null ? cars.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AutoHouse{" +
                "cars=" + cars +
                '}';
    }

    public Map<Integer, Car> getCars() {
        return cars;
    }

    private Car getCar(Object objectCar) {
        return cars.get(objectCar);
    }
}
