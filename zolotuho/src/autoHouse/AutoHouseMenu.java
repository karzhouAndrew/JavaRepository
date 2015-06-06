package autoHouse;

public enum AutoHouseMenu {
    SHOW() {
        public void menuFunction(AutoHouse autoHouse) {
            AutoHouseConsole.showCars(autoHouse);
        }
    },
    ADD {
        public void menuFunction(AutoHouse autoHouse) {
            AutoHouseConsole.addCar(autoHouse);
        }
    },
    DEL {
        public void menuFunction(AutoHouse autoHouse) {
            AutoHouseConsole.deleteCar(autoHouse);
        }
    },
    SEARCHBR {
        public void menuFunction(AutoHouse autoHouse) {
            AutoHouseConsole.searchCarByBrand(autoHouse);
        }
    },
    SEARCHYR {
        public void menuFunction(AutoHouse autoHouse) {
            AutoHouseConsole.searchCarByYear(autoHouse);
        }
    },
    SORTYR {
        public void menuFunction(AutoHouse autoHouse) {
            AutoHouseConsole.sortByYear(autoHouse);
        }
    },
    SORTPR {
        public void menuFunction(AutoHouse autoHouse) {
            AutoHouseConsole.sortByPrice(autoHouse);
        }
    };

    public abstract void menuFunction(AutoHouse autoHouse);
}

