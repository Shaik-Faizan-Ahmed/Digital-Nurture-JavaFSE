import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class task39 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("SampleClass");
            System.out.println("Class: " + clazz.getName());

            System.out.println("\nDeclared Methods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.print("  " + method.getReturnType().getSimpleName() +
                                 " " + method.getName() + "(");
                Parameter[] params = method.getParameters();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getType().getSimpleName() + " " + params[i].getName());
                    if (i < params.length - 1) System.out.print(", ");
                }
                System.out.println(")");
            }

            Object instance = clazz.getDeclaredConstructor().newInstance();

            Method sayHello = clazz.getMethod("sayHello");
            System.out.println("\nInvoking sayHello():");
            sayHello.invoke(instance);

            Method addMethod = clazz.getMethod("add", int.class, int.class);
            System.out.println("\nInvoking add(10, 20):");
            Object result = addMethod.invoke(instance, 10, 20);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}
