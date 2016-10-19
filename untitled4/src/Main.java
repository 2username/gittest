import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int i = 0;

        int[] mas = {12, 12, 21, 12, 45, 46};
        select(mas);




        System.out.println(noname()+"");
    }

    private  static int  noname()
    {
        int i =0;

        return i;
    }



    private static void select(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = barrier + 1; index < data.length; index++) {
                if (data[barrier] > data[index]) {
                    int tmp = data[index];
                    data[index] = data[barrier];
                    data[barrier] = tmp;

                }
            }
        }
        System.out.println(Arrays.toString(data) + data);
    }

}


