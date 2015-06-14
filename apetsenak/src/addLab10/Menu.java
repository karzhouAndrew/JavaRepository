package addLab10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class Menu {
    private Map<Integer, Method> methodMap = new HashMap<Integer, Method>();

    public void printMenu() {
        System.out.println("Добро пожаловать в AutoHouse. Выберите действие: ");
        System.out.println("1. Добавление машины в AutoHouse.");
        System.out.println("2. Удаление машины из AutoHouse.");
        System.out.println("3. Поиск машин по марке.");
        System.out.println("4. Поиск машин по году выпуска.");
        System.out.println("5. Сортировать машины по году.");
        System.out.println("6. Сортировать машины по цене.");
        System.out.println("7. Вывести все автомобили.");
        System.out.println("0. Выйти из программы.");
    }

    public void choiseProcessing(AutoHouse autoHouse, int choise) {
        try {
            methodMap.get(choise).invoke(autoHouse);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void menuProcessing(AutoHouse autoHouse) {
        Class clazz = autoHouse.getClass();
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(AddMenu.class)) {
                AddMenu addMenu = method.getAnnotation(AddMenu.class);
                methodMap.put(addMenu.paragraphNumber(), method);
            }
        }
    }
}
