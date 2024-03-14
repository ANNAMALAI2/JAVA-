class Carr {
    String brand;
    int year;
    double mileage;

    public Carr(String brand, int year, double mileage) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Mileage: " + mileage);
    }
}

class Tata extends Carr {
    String model;

    public Tata(String brand, int year, String model, double mileage) {
        super(brand, year, mileage);
        this.model = model;
    }

    void displayModel() {
        System.out.println("Model: " + model);
    }
}

class Punch extends Tata {
    String variant;

    public Punch(String brand, int year, String model, String variant, double mileage) {
        super(brand, year, model, mileage);
        this.variant = variant;
    }

    void displayVariant() {
        System.out.println("Variant: " + variant);
    }
}

class Harrier extends Tata {
    boolean isSUV;

    public Harrier(String brand, int year, String model, boolean isSUV, double mileage) {
        super(brand, year, model, mileage);
        this.isSUV = isSUV;
    }

    void displayType() {
        System.out.println("Type: " + (isSUV ? "SUV" : "Not an SUV"));
    }
    public static void main(String[] args) {
        Tata tataCar = new Tata("Tata", 2022, "Altroz", 20.5);
        tataCar.display();
        tataCar.displayModel();

        Punch punchCar = new Punch("Tata", 2023, "Punch", "XZ+", 18.7);
        punchCar.display();
        punchCar.displayModel();
        punchCar.displayVariant();

        Harrier harrierCar = new Harrier("Tata", 2024, "Harrier", true, 15.2);
        harrierCar.display();
        harrierCar.displayModel();
        harrierCar.displayType();
    }
}


    


