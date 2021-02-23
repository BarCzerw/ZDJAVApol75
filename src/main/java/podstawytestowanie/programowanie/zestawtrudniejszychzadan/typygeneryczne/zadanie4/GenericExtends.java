package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie4;

public class GenericExtends {

    public static void main(String[] args) {

        System.out.println(sumAsDouble(1,3));
        System.out.println(sumAsDouble(3.0,2));
        System.out.println(sumAsDouble(3.0d,1474457L));
        System.out.println(sumAsDouble(Integer.valueOf("159800"),Float.valueOf("-46.7948275")));

        Number int1 = 159;
        Number int2 = 30;

        System.out.println(sumAsDouble(int1,int2));
    }

    private static <T1 extends Number,T2 extends Number> double sumAsDouble(T1 numA, T2 numB){
        return numA.doubleValue()+ numB.doubleValue();
    }

}
