package Modul3CODELAB1;
import Modul3CODELAB1.Modul3Practice;

class Converter {
    private double value;
    public double setValue(double value, String params) {
        switch (params.toLowerCase()) {
            case "m":
                return setValueToM(value);
            case "cm":
                return setValueToCM(value);
            case "feet":
                return setValueToFeet(value);
            case "miles":
                return setValueToMiles(value);
            default:
                return 0;
        }
    }

    public double getValue() {
        return value;
    }

    private double setValueToM(double yard) {
        return value = yard * 0.9144;
    }

    private double setValueToCM(double yard) {
        return value = yard * 91.44;
    }

    private double setValueToFeet(double yard) {
        return value = yard * 3;
    }

    private double setValueToMiles(double yard) {
        return value = yard / 1760;
    }
}
