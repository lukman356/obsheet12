public class RekapPenjualan {

    String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    int[][] data = {
            {20, 30, 40, 10, 15, 20, 25},
            {10, 89, 20, 45, 30, 25, 15},
            {20, 18, 25, 30, 50, 15, 10},
            {15, 20, 17, 15, 10, 12, 11},
            {30, 80, 76, 50, 19, 55, 56}
    };

    void tampilData() {
        System.out.println("=== DATA PENJUALAN 7 HARI ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    int totalPerMenu(int index) {
        int sum = 0;
        for (int j = 0; j < data[index].length; j++) {
            sum += data[index][j];
        }
        return sum;
    }

    int totalSemuaMenu() {
        int total = 0;
        for (int i = 0; i < menu.length; i++) {
            total += totalPerMenu(i);
        }
        return total;
    }

double rataPerMenu(int index) {
    return (double) totalPerMenu(index) / data[index].length;
}}
