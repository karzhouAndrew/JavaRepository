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
    private Map<Integer, Car> listingExistedCar;

    public AutoHouse() {
        listingExistedCar = new HashMap<Integer, Car>();
    }

    public void addCarInAutoHouse(CompanyEnum company, int constructYear, int price) {
        listingExistedCar.put(generateID(), new Car(company, constructYear, price));
    }

    private int generateID() {
        int iD = new Random().nextInt(1000);
        return listingExistedCar.containsKey(iD) ? generateID() : iD;
    }

    public Map<Integer, Car> getIDSortByConstructYear() {
        Map<Integer, Car> sortForConstructYear = new TreeMap<Integer, Car>(
                new Comparator() {
                    @Override
                    public int compare(Object first, Object second) {
                        return listingExistedCar.get(first).getConstructYear().compareTo(listingExistedCar.get(second).getConstructYear());
                    }
                }
        );
        sortForConstructYear.putAll(listingExistedCar);
        return sortForConstructYear;
    }

    public Map<Integer, Car> getCarSortByPrice() {
        Map<Integer, Car> sortForPrice = new TreeMap<Integer, Car>(
                new Comparator() {
                    @Override
                    public int compare(Object first, Object second) {
                        return listingExistedCar.get(first).getPrice() - listingExistedCar.get(second).getPrice();
                    }
                }
        );
        sortForPrice.putAll(listingExistedCar);
        return sortForPrice;
    }

    public List<Integer> findIDCarForSpecifyCompany(CompanyEnum company) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
        findIDWithSpecifiedCompany(company, listingID);
        return listingID;
    }

    public List<Integer> findIDCarForSpecifyConstructYear(int year) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
        findIDWithSpecifiedConstructYear(year, listingID);
        return listingID;
    }

    public List<Integer> findIDCarForSpecifyPrice(int price) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
        findIDWithSpecifiedPrice(price, listingID);
        return listingID;
    }

    public void removeCarForID(int iD) {
        if (listingExistedCar.containsKey(iD)) {
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
                listingExistedCar.remove(iD);
            }
        }
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, int constructYear, int price) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
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
        listingExistedCar.clear();
    }

    private void findIDWithSpecifiedCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        if (companyEnum != null) {
            saveIDWithSpecifyCompany(companyEnum, listingID);
        }
    }

    private void saveIDWithSpecifyCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        int indexListingID = listingID.size() - 1;
        while (indexListingID > -1) {
            CompanyEnum companyValueForPreviousCar = listingExistedCar.get(listingID.get(indexListingID)).getCompany();
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
            if (!(listingExistedCar.get(listingID.get(indexListingID)).getPrice() == price)) {
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
            if (!(listingExistedCar.get(listingID.get(indexListingID)).getConstructYear().get(Calendar.YEAR) == constructYear)) {
                listingID.remove(indexListingID);
            }
            indexListingID--;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoHouse autoHouse = (AutoHouse) o;

        if (listingExistedCar != null ? !listingExistedCar.equals(autoHouse.listingExistedCar) : autoHouse.listingExistedCar != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return listingExistedCar != null ? listingExistedCar.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AutoHouse{" +
                "listingExistedCar=" + listingExistedCar +
                '}';
    }
}
