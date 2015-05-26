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

    public void addCarInAutoHouse(CompanyEnum company, ColorEnum color, int yearOfIssue, int price) {
        listingExistedCar.put(generateID(), new Car(company, color, yearOfIssue, price));
    }

    private int generateID() {
        int iD = new Random().nextInt(1000);
        while (listingExistedCar.containsKey(iD)) {
            iD = new Random().nextInt(1000);
        }
        return iD;
    }






    public void removeCarForID(int iD) {
        if (listingExistedCar.containsKey(iD)) {
            listingExistedCar.remove(iD);
        } else {
            System.out.println("There are no car with this ID = " + iD + ".");
        }
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, ColorEnum colorEnum, int yearOfIssue, int price) {
        List<Integer> listingID = new ArrayList<Integer>(listingExistedCar.keySet());
        findIDWithSpecifiedCompany(companyEnum, listingID);
        findIDWithSpecifiedColor(colorEnum, listingID);
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

    public void removeCarForSpecify(CompanyEnum companyEnum, ColorEnum colorEnum, int yearOfIssue) {
        removeCarForSpecify(companyEnum, colorEnum, yearOfIssue, -1);
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, ColorEnum colorEnum) {
        removeCarForSpecify(companyEnum, colorEnum, -1);
    }

    public void removeCarForSpecify(CompanyEnum companyEnum) {
        removeCarForSpecify(companyEnum, null);
    }

    public void removeCarForSpecify(CompanyEnum companyEnum, int yearOfIssue) {
        removeCarForSpecify(companyEnum, null, yearOfIssue);
    }

    public void removeCarForSpecify(int yearOfIssue) {
        removeCarForSpecify(null, yearOfIssue);
    }

    public void removeAllCar(){
        listingExistedCar.clear();
    }

    private void findIDWithSpecifiedColor(ColorEnum colorEnum, List<Integer> listingID) {
        if (colorEnum != null) {
            int indexListingID = listingID.size();
            while (indexListingID > -1) {
                if (listingExistedCar.get(indexListingID).getColor().equals(colorEnum)) {
                    continue;
                } else {
                    listingID.remove(indexListingID);
                }
                indexListingID--;
            }
        }
    }

    private void findIDWithSpecifiedCompany(CompanyEnum companyEnum, List<Integer> listingID) {
        if (companyEnum != null) {
            int indexListingID = listingID.size();
            while (indexListingID > -1) {
                if (listingExistedCar.get(indexListingID).getCompany().equals(companyEnum)) {
                    continue;
                } else {
                    listingID.remove(indexListingID);
                }
                indexListingID--;
            }
        }
    }

    private void findIDWithSpecifiedPrice(int price, List<Integer> listingID) {
        if (price > 0) {
            int indexListingID = listingID.size();
            while (indexListingID > -1) {
                if (listingExistedCar.get(indexListingID).getPrice() == price) {
                    continue;
                } else {
                    listingID.remove(indexListingID);
                }
                indexListingID--;
            }
        }
    }

    private void findIDWithSpecifiedYearsOfIssue(int yearOfIssue, List<Integer> listingID) {
        if (yearOfIssue > 0) {
            int indexListingID = listingID.size();
            while (indexListingID > -1) {
                if (listingExistedCar.get(indexListingID).getYearOfIssue().get(Calendar.YEAR) == yearOfIssue) {
                    continue;
                } else {
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
