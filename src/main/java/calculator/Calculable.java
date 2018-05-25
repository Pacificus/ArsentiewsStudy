package calculator;

public interface Calculable {
    double summ(double...parms);
    double reduce(double...parms);
    double mult(double...parms);
    double div(double...parms) throws Exception;
    double pow(double...parms);
}
