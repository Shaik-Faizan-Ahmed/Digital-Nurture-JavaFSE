public class task30 {

    static String checkType(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer with value: " + i;
            case String s  -> "String with value: \"" + s + "\"";
            case Double d  -> "Double with value: " + d;
            case Boolean b -> "Boolean with value: " + b;
            case null      -> "Null value received";
            default        -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }

    public static void main(String[] args) {
        System.out.println(checkType(42));
        System.out.println(checkType("Hello"));
        System.out.println(checkType(3.14));
        System.out.println(checkType(true));
        System.out.println(checkType(null));
        System.out.println(checkType(100L));
    }
}
