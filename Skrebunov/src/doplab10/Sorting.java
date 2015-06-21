package doplab10;

import java.util.*;

public class Sorting {
    public void showCars(HashMap<Integer, Car> hm) {
        Set<Map.Entry<Integer, Car>> set = hm.entrySet();
        for (Map.Entry<Integer, Car> a : set) {
            System.out.println(a.getKey() + ": " + a.getValue());
        }
    }

    public HashMap create(HashMap<Integer, Car> hm) {
        System.out.println("добавить нажмите 1");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            Integer create = sc.nextInt();
            if (create == 1) {
                int cont = 2;
                while (cont == 2) {
                    System.out.println();
                    String brandNameScan = sc.nextLine();
                    System.out.println("введите марку");
                    String brandNameScan1 = sc.nextLine();
                    System.out.println("введите модель");
                    String modelScan = sc.nextLine();
                    System.out.println("введите цену");
                    Integer priceScan = sc.nextInt();
                    System.out.println("введите год выпуска");
                    Integer consYearScan = sc.nextInt();
                    System.out.println("введите год регистрации");
                    Integer regYearScan = sc.nextInt();
                    hm.put(Car.getIdentifierStatic(), new Car(brandNameScan1, modelScan, priceScan, consYearScan, regYearScan, 0));
                    System.out.println("если добавить еще нажмиет 2 или любую цифру если хватит");
                    cont = sc.nextInt();
                    showCars(hm);
                    if (cont != 2) {
                        break;
                    }
                }
            }
        }
        return hm;
    }

    public HashMap delete(HashMap<Integer, Car> hm) {
        showCars(hm);
        System.out.println("введите нужный ID");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            Integer delete = sc.nextInt();
            Iterator it = hm.keySet().iterator();
            while (it.hasNext()) {
                if (it.next() == delete) {
                    it.remove();
                }
            }
        }
        showCars(hm);
        return hm;
    }

    public HashMap nameSorting(HashMap<Integer, Car> hm) {
        HashMap<Integer, Car> sortedName = new HashMap<Integer, Car>();
        System.out.println("введите марку");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (Map.Entry<Integer, Car> a : hm.entrySet()) {
            if (a.getValue().getBrandName().equals(name)) {
                sortedName.put(a.getKey(), a.getValue());
            }
        }
        showCars(sortedName);
        return sortedName;
    }

    public HashMap constructionYear(HashMap<Integer, Car> hm) {
        HashMap<Integer, Car> constructionYear = new HashMap<Integer, Car>();
        Scanner sc = new Scanner(System.in);
        System.out.println("введите год выпуска");
        if (sc.hasNextInt()) {
            Integer year = sc.nextInt();
            for (Map.Entry<Integer, Car> a : hm.entrySet()) {
                if (a.getValue().getConstructionYear() == year) {
                    constructionYear.put(a.getKey(), a.getValue());
                }
            }
        }
        showCars(constructionYear);
        return constructionYear;
    }

    public void registrationYearSorting(HashMap<Integer, Car> hm) {
        List carList = new ArrayList(hm.entrySet());
        Collections.sort(carList, new Comparator<Map.Entry<Integer, Car>>() {
            @Override
            public int compare(Map.Entry<Integer, Car> a, Map.Entry<Integer, Car> b) {
                return a.getValue().getRegistrationYear() - b.getValue().getRegistrationYear();
            }
        });
        Iterator it = carList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void priceSorting(HashMap<Integer, Car> hm) {
        List carList = new ArrayList(hm.entrySet());
        Collections.sort(carList, new Comparator<Map.Entry<Integer, Car>>() {
            @Override
            public int compare(Map.Entry<Integer, Car> a, Map.Entry<Integer, Car> b) {
                return a.getValue().getPrice() - b.getValue().getPrice();
            }
        });
        Iterator it = carList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
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


    public HashMap sorting(HashMap<Integer, Car> hm) {
        printOperation();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int cont = 0;
            while (cont == 0) {
                printOperation();
                int choseNumber = sc.nextInt();
                if (choseNumber == 1) {
                    hm = create(hm);
                } else if (choseNumber == 2) {
                    hm = delete(hm);
                } else if (choseNumber == 3) {
                    hm = nameSorting(hm);
                } else if (choseNumber == 4) {
                    hm = constructionYear(hm);
                } else if (choseNumber == 5) {
                    registrationYearSorting(hm);
                } else if (choseNumber == 6) {
                    priceSorting(hm);
                }
                System.out.println("для продолжения нажмите 0");
                cont = sc.nextInt();
                if (cont != 0) {
                    sc.close();
                    break;
                }
            }
        }
        return hm;
    }
}

