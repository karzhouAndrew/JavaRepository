package doplab10;

import java.util.*;

public class AutoHouse {
    public void showCars(Map<Integer, Car> hm) {
        Set<Map.Entry<Integer, Car>> set = hm.entrySet();
        for (Map.Entry<Integer, Car> currentCar : set) {
            System.out.println(currentCar.getKey() + ": " + currentCar.getValue());
        }
    }

    public Map addCar(Map<Integer, Car> hm) {
        System.out.println("добавить нажмите 1");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            Integer create = scanner.nextInt();
            if (create == 1) {
                int cont = 2;
                while (cont == 2) {
                    System.out.println();
                    String brandNameScan = scanner.nextLine();
                    System.out.println("введите марку");
                    String brandNameScan1 = scanner.nextLine();
                    System.out.println("введите модель");
                    String modelScan = scanner.nextLine();
                    System.out.println("введите цену");
                    Integer priceScan = scanner.nextInt();
                    System.out.println("введите год выпуска");
                    Integer consYearScan = scanner.nextInt();
                    System.out.println("введите год регистрации");
                    Integer regYearScan = scanner.nextInt();
                    hm.put(Car.getIdentifierStatic(), new Car(brandNameScan1, modelScan, priceScan, consYearScan, regYearScan, 0));
                    System.out.println("если добавить еще нажмиет 2 или любую цифру если хватит");
                    cont = scanner.nextInt();
                    showCars(hm);
                    if (cont != 2) {
                        scanner.close();
                        break;
                    }
                }
            }
        }
        return hm;
    }

    public Map delete(Map<Integer, Car> hm) {
        showCars(hm);
        System.out.println("введите нужный ID");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            Integer delete = scanner.nextInt();
            Iterator iterator = hm.keySet().iterator();
            while (iterator.hasNext()) {
                if (iterator.next() == delete) {
                    iterator.remove();
                }
            }
        }
        showCars(hm);
        return hm;
    }

    public Map sortingBrandName(Map<Integer, Car> hm) {
        HashMap<Integer, Car> sortedName = new HashMap<Integer, Car>();
        System.out.println("введите марку");
        Scanner scanner = new Scanner(System.in);
        String brandName = scanner.nextLine();
        for (Map.Entry<Integer, Car> currentCar : hm.entrySet()) {
            if (currentCar.getValue().getBrandName().equals(brandName)) {
                sortedName.put(currentCar.getKey(), currentCar.getValue());
            }
        }
        showCars(sortedName);
        return sortedName;
    }

    public HashMap constructionYear(Map<Integer, Car> hm) {
        HashMap<Integer, Car> constructionYear = new HashMap<Integer, Car>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите год выпуска");
        if (scanner.hasNextInt()) {
            Integer year = scanner.nextInt();
            for (Map.Entry<Integer, Car> currentCar : hm.entrySet()) {
                if (currentCar.getValue().getConstructionYear() == year) {
                    constructionYear.put(currentCar.getKey(), currentCar.getValue());
                }
            }
        }
        showCars(constructionYear);
        return constructionYear;
    }

    public void registrationYearSorting(Map<Integer, Car> hm) {
        List carList = new ArrayList(hm.entrySet());
        Collections.sort(carList, new Comparator<Map.Entry<Integer, Car>>() {
            @Override
            public int compare(Map.Entry<Integer, Car> currentCar, Map.Entry<Integer, Car> nextCar) {
                return currentCar.getValue().getRegistrationYear() - nextCar.getValue().getRegistrationYear();
            }
        });
        Iterator iterator = carList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void priceSorting(Map<Integer, Car> hm) {
        List carList = new ArrayList(hm.entrySet());
        Collections.sort(carList, new Comparator<Map.Entry<Integer, Car>>() {
            @Override
            public int compare(Map.Entry<Integer, Car> currentCar, Map.Entry<Integer, Car> nextCar) {
                return currentCar.getValue().getPrice() - nextCar.getValue().getPrice();
            }
        });
        Iterator iterator = carList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printOperation() {
        System.out.println("нажмите 1 если добавить");
        System.out.println("нажмите 2 если удалить");
        System.out.println("нажмите 3 если поиск машин по марке");
        System.out.println("нажмите 4 если поиск машин по году выпуска");
        System.out.println("нажмите 5 если сортировка машин по году регистрации");
        System.out.println("нажмите 6 если сортировка машин по цене");
    }


    public Map sorting(Map<Integer, Car> hm) {
        printOperation();
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int cont = 0;
            while (cont == 0) {
                printOperation();
                int choseNumber = scanner.nextInt();
                if (choseNumber == 1) {
                    hm = addCar(hm);
                } else if (choseNumber == 2) {
                    hm = delete(hm);
                } else if (choseNumber == 3) {
                    hm = sortingBrandName(hm);
                } else if (choseNumber == 4) {
                    hm = constructionYear(hm);
                } else if (choseNumber == 5) {
                    registrationYearSorting(hm);
                } else if (choseNumber == 6) {
                    priceSorting(hm);
                }
                System.out.println("для продолжения нажмите 0");
                cont = scanner.nextInt();
                if (cont != 0) {
                    scanner.close();
                    break;
                }
            }
        }
        return hm;
    }
}

