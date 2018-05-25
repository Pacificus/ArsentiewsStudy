package calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Calculator calculator = (Calculator) applicationContext.getBean("calc");
        double summ = calculator.summ(1, 2, 3, 4);
        double reduce = calculator.reduce(1, -2, 3, -4);
        double product = calculator.mult(1, 2, 3, 4);
        double div = calculator.div(100, 4, 5);
        double pow = calculator.pow(3, 2, 2);
        System.out.printf("sum = %f%n", summ);
        System.out.printf("reduce = %f%n", reduce);
        System.out.printf("product = %f%n", product);
        System.out.printf("div = %f%n", div);
        System.out.printf("pow = %f%n", pow);
    }
}
