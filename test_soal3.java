class looping {

    public static void main(String[] args) {
        int b = 5;

        for (int i = 0; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int l = 0; l < b; l++) {
            for (int m = b - 1; m > l; m--) {
                System.out.print(" ");
            }
            for (int n = 0; n <= l; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}