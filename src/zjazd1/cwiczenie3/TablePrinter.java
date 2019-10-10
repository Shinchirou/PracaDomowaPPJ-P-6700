package zjazd1.cwiczenie3;

//Numer indeksu P-6700

public class TablePrinter {

    int[][] table;

    public TablePrinter() {
    }

    public void fillAndPrintTable(int n) {
        table = new int[n + 1][];

        for (int i = 0; i <= table.length - 1; i++) {
            System.out.println();

            for (int j = 0; j <= n; j++) {
                table[i] = new int[i + 1];
                table[i][j] = j;
                System.out.print(table[i][j]);

                if (j == i)
                    break;
                System.out.print(", ");
            }
        }
    }


}
