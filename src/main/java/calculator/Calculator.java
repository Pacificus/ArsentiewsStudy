package calculator;

public class Calculator implements Calculable {
    private double result;

    public Calculator() {
    }

    public double summ(double... parms) {
        result = 0;
        for (double elem : parms) {
            result += elem;
        }
        return result;
    }

    public double reduce(double... parms) {
        for (int i = 0; i < parms.length; i++) {
            if (i == 0) result = parms[0];
            else result -= parms[i];
        }
        return result;
    }

    public double mult(double... parms) {
        result = 1;
        for (double elem : parms) {
            result *= elem;
        }
        return result;
    }

    public double div(double... parms) throws Exception {
        for (int i = 0; i < parms.length; i++) {
            if (i == 0) result = parms[0];
            else if (parms[i] == 0) throw new Exception("You trying to div to zero");
            else result /= parms[i];
        }
        return result;
    }

    public double pow(double... parms) {
        for (int i = 0; i < parms.length; i++) {
            if (i == 0) result = parms[0];
            else result = Math.pow(result, parms[i]);
        }
        return result;
    }
}
