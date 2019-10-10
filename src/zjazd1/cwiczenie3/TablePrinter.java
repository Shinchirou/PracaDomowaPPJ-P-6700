package zjazd1.cwiczenie3;

//Numer indeksu P-6700

public class TablePrinter {

    int[][] table;

    public TablePrinter(){}

    public void fillAndPrintTable(int n){

        for(int i = 0; i <= n; i++){
            System.out.println();
            table = new int[i+1][i+1];
            for (int j = 0; j <= i; j++){
                table[i][j] = j;
                System.out.print(table[i][j]);

                if(j == i)
                    break;
                System.out.print(", ");
            }

        }

    }
}
