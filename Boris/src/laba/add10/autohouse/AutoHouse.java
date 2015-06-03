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


import java.util.*;

public class AutoHouse {
    private Map<Integer, Car> carsListingExisted;

    public AutoHouse() {
        carsListingExisted = new HashMap<Integer, Car>();
    }

    public void addCarInAutoHouse(CompanyEnum company, int constructYear, int price) {
        carsListingExisted.put(generateID(), new Car(company, constructYear, price));
    }

    private int generateID() {
        int iD = new Random().nextInt(1000);
        return carsListingExisted.containsKey(iD) ? generateID() : iD;
    }

    public Map<Integer, Car> getIDSortByConstructYear() {
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
        sortForConstructYear.putAll(new TreeMap<Integer, Car>(carsListingExisted));
        return sortForConstructYear;
    }


    public Map<Integer, Car> getCarSortByPrice() {
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
        sortForPrice.putAll(new TreeMap<Integer, Car>(carsListingExisted));
        return sortForPrice;
    }

    public List<Integer> findIDCarForSpecifyCompany(CompanyEnum company) {
        List<Integer> listingID = new ArrayList<Integer>(carsListingExisted.keySet());
        findIDWithSpecifiedCompany(company, listingID);
        return listingID;
    }

    public List<Integer> findIDCarForSpecifyConstructYear(int year) {
        List<Integer> listingID = new ArrayList<Integer>(carsListingExisted.keySet());
        findIDWithSpecifiedConstructYear(year, listingID);
        return listingID;
    }

    public List<Integer> findIDCarForSpecifyPrice(int price) {
        List<Integer> listingID = new ArrayList<Integer>(carsListingExisted.keySet());
        findIDWithSpecifiedPrice(price, listingID);
        return listingID;
    }

    public void removeCarForID(int iD) {
        if (carsListingExisted.containsKey(iD)) {
            List<Integer> listingID = new ArrayList<Integer>();
            listingID.add(iD);
            removeCarForIDList(listingID);
        } else {
            System.out.println("There are no car with this ID.");
        }
    }

    private void removeCarForIDList(List<Integer> listingID) {
        if (listingID.isEmpty()) {
            return;
        } else {
            for (Integer iD : listingID) {
                carsListingExisted.remove(iD);
            }
        }
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, int constructYear, int price) {
        List<Integer> listingID = new ArrayList<Integer>(carsListingExisted.keySet());
        findIDWithSpecifiedCompany(companyEnum, listingID);
        findIDWithSpecifiedConstructYear(constructYear, listingID);
        findIDWithSpecifiedPrice(price, listingID);
        if (listingID.isEmpty()) {
            System.out.println("There are no car with this parameters.");
            return;
        } else {
            removeCarForIDList(listingID);
        }
    }

    public void removeAllCar() {
        carsListingExisted.clear();
    }

    private void findIDWithSpecifiedCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        if (companyEnum != null) {
            saveIDWithSpecifyCompany(companyEnum, listingID);
        }
    }

    private void saveIDWithSpecifyCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        int indexListingID = listingID.size() - 1;
        while (indexListingID > -1) {
            CompanyEnum companyValueForPreviousCar = carsListingExisted.get(listingID.get(indexListingID)).getCompany();
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
            if (!(carsListingExisted.get(listingID.get(indexListingID)).getPrice() == price)) {
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
        return carsListingExisted.get(listingID.get(indexListingID)).getConstructYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoHouse autoHouse = (AutoHouse) o;

        if (carsListingExisted != null ? !carsListingExisted.equals(autoHouse.carsListingExisted) : autoHouse.carsListingExisted != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return carsListingExisted != null ? carsListingExisted.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AutoHouse{" +
                "carsListingExisted=" + carsListingExisted +
                '}';
    }

    public Map<Integer, Car> getCarsListingExisted() {
        return carsListingExisted;
    }

    private Car getCar(Object objectCar) {
        return carsListingExisted.get(objectCar);
    }
}
