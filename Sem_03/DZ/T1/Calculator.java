package DZ.T1;

public class Calculator {

    public static <T extends Number> T sum(T a, T b) {

        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() + b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() + b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() + b.floatValue()));
        return null;
    }

    public static <T extends Number> T subtract(T a, T b) {

        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() - b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() - b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() - b.floatValue()));
        return null;
    }

    public static <T extends Number> T multiply(T a, T b) {

        if(a instanceof Integer)
            return (T) (Integer.valueOf(a.intValue() * b.intValue()));
        else if(a instanceof Double)
            return (T) (Double.valueOf(a.doubleValue() * b.doubleValue()));
        else if(a instanceof Float)
            return (T) (Float.valueOf(a.floatValue() * b.floatValue()));
        return null;
    }

    public static <T extends Number> T divide(T a, T b) {


        if(a instanceof Integer) {
            if (b.intValue() != 0)
                return (T) (Double.valueOf(a.doubleValue() / b.doubleValue()));
        }
        else if(a instanceof Double) {
            if (b.doubleValue() != 0.0)
                return (T) (Double.valueOf(a.doubleValue() / b.doubleValue()));
        }
        else if (a instanceof Float) {
            if (b.floatValue() != 0.0f)
                return (T) (Float.valueOf(a.floatValue() / b.floatValue()));
            }
        return null;
    }




}
