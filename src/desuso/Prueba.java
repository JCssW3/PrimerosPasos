package desuso;

public class Prueba {

    public static void main (String[] args){

        int[] a = {1,2,3};
        String[] b = {"uno","dos","tres"};

        Class claseA = a.getClass();
        Class claseB = b.getClass();

        System.out.println(claseA.toString());
        System.out.println(claseB.toString());

        System.out.println(claseA.getComponentType());
        System.out.println(claseB.getComponentType());

    }

}
