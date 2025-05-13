package D_BM23AI048;

public class wrapper {
    public static void main(String[] args){
        Integer boxedInt=Integer.valueOf(10);
        Double boxedDouble=Double.valueOf(20.5);
        String boxedString= String.valueOf("disha");
        Character boxedChar= Character.valueOf('d');
        Float boxedFloat= Float.valueOf(30.89f);
        Boolean boxedBool= Boolean.valueOf(true);
        System.out.println("Boxed values:");
        System.out.print("boxed int:"+ boxedInt+"\nboxed double:"+boxedDouble+"\nboxed bool:"+boxedBool+"\nboxed string:"+ boxedString+"\nboxed char:"+ boxedChar+ "\nboxed float:"+ boxedFloat);
        int unboxInt= boxedInt.intValue();
        double unboxDouble= boxedDouble.doubleValue();
        char unboxChar= boxedChar.charValue();
        boolean unboxBool= boxedBool.booleanValue();
        float unboxFloat= boxedFloat.floatValue();
        String unboxString= boxedString;
        System.out.println("\n\nUnBoxed values:");
        System.out.print("unboxed int:"+ unboxInt+"\nunboxed double:"+unboxDouble+"\nunboxed bool:"+unboxBool+"\nunboxed string:"+ unboxString+"\nunboxed char:"+ unboxChar+ "\nunboxed float:"+ unboxFloat);
    }
}
