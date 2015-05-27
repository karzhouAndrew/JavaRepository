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

    public void addCarInAutoHouse(CompanyEnum company, int yearOfIssue, int price) {
        listingExistedCar.put(generateID(), new Car(company, yearOfIssue, price));
    }

    private int generateID() {
        int iD = new Random().nextInt(1000);
        while (listingExistedCar.containsKey(iD)) {
            iD = new Random().nextInt(1000);
        }
        return iD;
    }

    public Map<Integer, Car> getIDSortYearOfIssue() {
        Map<Integer, Car> sortForYearOfIssue = new TreeMap<Integer, Car>(new Comparator() {
            @Override
            public int compare(Object first, Object second) {
                return listingExistedCar.get(first).getYearOfIssue().compareTo(listingExistedCar.get(second).getYearOfIssue());
            }
        });
        sortForYearOfIssue.putAll(listingExistedCar);
        return sortForYearOfIssue;
    }

    public Map<Integer, Car> getCarSortPrice() {
        Map<Integer, Car> sortForPrice = new TreeMap<Integer, Car>(new Comparator() {
            @Override
            public int compare(Object first, Object second) {
                return listingExistedCar.get(first).getPrice() - listingExistedCar.get(second).getPrice();
            }
        });
        sortForPrice.putAll(listingExistedCar);
        return sortForPrice;
    }

    public List<Integer> findIDCarForSpecifyCompany(CompanyEnum company) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
        findIDWithSpecifiedCompany(company, listingID);
        return listingID;
    }

    public List<Integer> findIDCarForSpecifyYearOfIssue(int year) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
        findIDWithSpecifiedYearsOfIssue(year, listingID);
        return listingID;
    }

    public void removeCarForID(int iD) {
        if (listingExistedCar.containsKey(iD)) {
            listingExistedCar.remove(iD);
        } else {
            System.out.println("There are no car with this ID = " + iD + ".");
        }
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, int yearOfIssue, int price) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
        findIDWithSpecifiedCompany(companyEnum, listingID);
        findIDWithSpecifiedYearsOfIssue(yearOfIssue, listingID);
        findIDWithSpecifiedPrice(price, listingID);
        if (listingID.isEmpty()) {
            return;
        } else {
            for (Integer iD : listingID) {
                listingExistedCar.remove(iD);
            }
        }
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, int yearOfIssue) {
        removeCarForSpecify(companyEnum, yearOfIssue, -1);
    }

    public void removeCarForSpecify(CompanyEnum companyEnum) {
        removeCarForSpecify(companyEnum, -1, -1);
    }

    public void removeCarForSpecify(int yearOfIssue, int price) {
        removeCarForSpecify(null, yearOfIssue, price);
    }

    public void removeCarForSpecify(int yearOfIssue) {
        removeCarForSpecify(null, yearOfIssue);
    }

    public void removeAllCar() {
        listingExistedCar.clear();
    }

    private void findIDWithSpecifiedCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        if (companyEnum != null) {
            int indexListingID = listingID.size() - 1;
            while (indexListingID > -1) {
                CompanyEnum companyEnum1 = listingExistedCar.get(listingID.get(indexListingID)).getCompany();
                if (!companyEnum1.equals(companyEnum)) {
                    listingID.remove(indexListingID);
                }
                indexListingID--;
            }
        }
    }

    private void findIDWithSpecifiedPrice(int price, List<Integer> listingID) {
        if (price > 0) {
            int indexListingID = listingID.size() - 1;
            while (indexListingID > -1) {
                if (!(listingExistedCar.get(listingID.get(indexListingID)).getPrice() == price)) {
                    listingID.remove(indexListingID);
                }
                indexListingID--;
            }
        }
    }

    private void findIDWithSpecifiedYearsOfIssue(int yearOfIssue, List<Integer> listingID) {
        if (yearOfIssue > 0) {
            int indexListingID = listingID.size() - 1;
            while (indexListingID > -1) {
                if (!(listingExistedCar.get(listingID.get(indexListingID)).getYearOfIssue().get(Calendar.YEAR) == yearOfIssue)) {
                    listingID.remove(indexListingID);
                }
                indexListingID--;
            }
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
