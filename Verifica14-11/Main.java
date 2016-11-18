
/**
 * @author Daniele Dalla Rosa
 */
public class Main
{
    public static void mainEsercizio1(){
        int[][] voti = new int[4][3];
        int n, tempMedia;
        String voto = "";
        String[] studenti = {"Fabio Spiazzi","Luigi","Diego","Filippo"};
        for ( int i = 0; i < voti.length; i ++ ){
            for ( int j = 0; j < voti[0].length; j ++ ){
                System.out.print("Inserire il voto " + j + " dello studente " + studenti[i] + ": ");
                n = Tastiera.leggiUnIntero();
                while ( n > 10 || n < 1){
                    System.out.print("Inserire un voto tra 1 e 10: ");
                    n = Tastiera.leggiUnIntero();
                }
                voti[i][j] = n;
            }
        }
        int max = voti[0][0], indiceStudenteMaxVoto = 0;
        for ( int i = 0; i < voti.length; i ++ ){
            for ( int j = 0; j < voti[0].length; j ++ ){
                if ( max < voti[i][j] ){
                    max = voti[i][j];
                    indiceStudenteMaxVoto = i;
                }
            }
        }
        System.out.println("Il voto massimo è " + max + " dello studente " + studenti[indiceStudenteMaxVoto]);
        int minMedia = mediaStudente(0, voti), minMediaPos = 0;
        for ( int j = 1; j < studenti.length; j ++ ){
            tempMedia = mediaStudente(j, voti);
            if ( tempMedia < minMedia ){
                minMedia = tempMedia;
                minMediaPos = j;
            }
        }
        System.out.println("La media minima è " + minMedia + " della riga " + minMediaPos + " (studente " + studenti[minMediaPos] + " )");
        for ( int i = 0; i < studenti.length; i ++ ){
            switch(mediaStudente(i, voti)){
                case 8:
                case 9:
                case 10:
                    voto = "OTTIMO";
                    break;
                case 6:
                case 7:
                    voto = "BUONO";
                    break;
                case 3:
                case 4:
                case 5:
                    voto = "INSUFFICIENTE";
                    break;
                case 1: 
                case 2:
                    voto = "GRAVEMENTE INSUFFICIENTE";
                    break;
            }
            System.out.println(studenti[i] + ": " + voto);
        }
        int temp;
        for ( int i = 0; i < voti.length; i ++ ){
            for ( int j = 0; j < voti[0].length-1; j ++ ){
                for ( int k = j+1; k < voti[0].length; k ++ ){
                    if ( voti[i][j] > voti[i][k]){
                        temp = voti[i][j];
                        voti[i][j] = voti[i][k];
                        voti[i][k] = temp;
                    }
                }
            }
        }
        for ( int i = 0; i < voti.length; i ++ ){
            System.out.print(studenti[i] + ": ");
            for ( int j = 0; j < voti[0].length; j ++ ){
                if ( j == voti[0].length-1 ){
                    System.out.println(voti[i][j]);
                } else {
                    System.out.print(voti[i][j] + ", ");
                }
            }
        }
        int[] occurrency = {1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0,10,0};
        for ( int i = 0; i < voti.length; i ++ ){
            for ( int j = 0; j < voti[0].length; j ++ ){
                for ( int k = 0; k < 20; k += 2 ){
                    if ( voti[i][j] == occurrency[k] ){
                        occurrency[k+1] ++;
                    }
                }
            }
        }
        int maxOccurrencyIndex = 1;
        for ( int k = 3; k < 20; k += 2 ){
            if ( occurrency[k] > occurrency[maxOccurrencyIndex] ){
                maxOccurrencyIndex = k;
            }
        }
        System.out.println("L'elemento più frequente è " + occurrency[maxOccurrencyIndex-1] + " e compare " + occurrency[maxOccurrencyIndex] + " volte");
    }
    public static int mediaStudente(int studente, int[][] voti){
        int somma = 0, media;
        for ( int j = 0; j < voti[0].length; j++ ){
            somma += voti[studente][j];
        }
        media = somma / voti[0].length;
        return media;
    }
    public static void mainEsercizio2(){
        Sistema sis1 = new Sistema(2, 3);
        Sistema sis2 = new Sistema(10, 10, 10, 10, "area");
        Sistema sis3 = new Sistema(10, 10, 10, 10, "perimetro");
        sis1.eseguiSistema();
        sis2.eseguiTriangolo();
        sis3.eseguiTriangolo();
        System.out.println( "Il determinante è " + sis1.getDelta() + ", il max è " + sis1.getMax() + ", x1 è " + sis1.getX1() + ", x2 è " + sis1.getX2() );
        System.out.println( "L'area del triangolo è " + sis2.getArea() );
        System.out.println( "Il perimetro del triangolo è " + sis3.getPerimetro() );
    }
}
