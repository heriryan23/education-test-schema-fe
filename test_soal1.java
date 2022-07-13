import java.util.Arrays;

class data {
    public static void main(String[] args) {
        int[] data1 = { 1, 1, 1, 2, 2, 4, 1, 1, 2, 1, 2, 2, 2, 8, 1, 1, 3, 3, 3, 3, 2, 4, 1, 1 };
        Total(data1);
    }

    static void Total(int data1[]) {
        Arrays.sort(data1);
        for (int i = 0; i < data1.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < data1.length; j++) {
                if (data1[i] == data1[j])
                    count++;
                else
                    break;

            }
            if (count > 1) {
                System.out.println(
                        "total data paling banyak keluar adalah angka " + data1[i] + " dengan -> " + "jumlah " + count);
                i += (count - 1);
            }
        }
    }
}