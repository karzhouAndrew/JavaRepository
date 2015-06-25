package module2.laba10.products;


public enum OrderProduct {
    BREAD {
        @Override
        public double getPrice() {
            return 5.50;
        }

        @Override
        public String getName() {
            return "Bread \"Silichi\"";
        }
    },
    MILK {
        @Override
        public double getPrice() {
            return 10.0;
        }

        @Override
        public String getName() {
            return "Milk \"Zdravushka\"";
        }
    },
    BEER {
        @Override
        public double getPrice() {
            return 18.3;
        }

        @Override
        public String getName() {
            return "Beer \"Baltika\"";
        }
    },
    TEA {
        @Override
        public double getPrice() {
            return 25.5;
        }

        @Override
        public String getName() {
            return "Tea \"Jaff\"";
        }
    },
    COFFEE {
        @Override
        public double getPrice() {
            return 50.0;
        }

        @Override
        public String getName() {
            return "Coffee \"Matador\"";
        }
    },
    SAUSAGE {
        @Override
        public double getPrice() {
            return 100.0;
        }

        @Override
        public String getName() {
            return "Sausage \"Ubileynaya\"";
        }
    },
    SWEET {
        @Override
        public double getPrice() {
            return 36.5;
        }

        @Override
        public String getName() {
            return "Sweet \"Alenka\"";
        }
    },
    COOKIES {
        @Override
        public double getPrice() {
            return 34.25;
        }

        @Override
        public String getName() {
            return "Cookies \"Slodych\"";
        }
    },
    TOMATO {
        @Override
        public double getPrice() {
            return 25.69;
        }

        @Override
        public String getName() {
            return "Tomato \"Spain\"";
        }
    },
    BUTTER {
        @Override
        public double getPrice() {
            return 19.34;
        }

        @Override
        public String getName() {
            return "Butter \"Zdravyshka\"";
        }
    },
    EGGS {
        @Override
        public double getPrice() {
            return 18.23;
        }

        @Override
        public String getName() {
            return "Eggs \"Molodeckie\"";
        }
    },
    SOAP {
        @Override
        public double getPrice() {
            return 5.34;
        }

        @Override
        public String getName() {
            return "Soap \"Romantica\"";
        }
    };

    public abstract double getPrice();

    public abstract String getName();

}
