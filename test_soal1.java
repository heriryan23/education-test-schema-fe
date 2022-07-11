class data {
    public static void main(String[] args) {
        int[] data1 = { 1, 1, 1, 2, 2, 4, 1, 1 };
        int x = 1;
        int Count = 0;
        for (int i = 0; i < data1.length; i++) {
            if (data1[i] == x)
                Count++;
        }
        System.out.println("total data paling banyak keluar adalah angka " + x + " dengan jumlah " + Count);
    }
}