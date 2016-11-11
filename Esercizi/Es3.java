import java.util.Random;
/**
 * 01. Data una matrice quadrata di numeri interi, trova gli indici e il valore della componente più grande e
 * più piccola. Visualizza a schermo la matrice
 * 02. Data una matrice di interi, determina la riga per cui la sommatoria degli elementi è massima.
 * Visualizza a schermo la matrice
 * 03. Scrivi un algoritmo che consideri una matrice rettangolare intera con N righe ed M colonne, con N
 * ed M minori di 50, ed esegua le seguenti operazioni:
 * a. Determini se gli elementi nulli (uguali a zero) della matrice sono in numero maggiore dell’80%
 * del totale degli elementi
 * b. Se nel passo precedente la risposta è stata affermativa, visualizzi i soli elementi non nulli
 * della matrice stessa a schermo, sostituendo gli elementi nulli con un +.
 * Es:  13 # 15  #  21  #
 *      #  #  #  #  31  #
 *      #  #  #  #  #  42
 * 04. Una ditta produce 10 articoli diversi. Scrivi un algoritmo che memorizzi in una matrice le vendite
 * mensili di ogni articolo e fornisca in output un vettore contenente i valori medi delle vendite di ciascun
 * articolo. Stampa a video la matrice dei prodotti e il vettore dei valori medi
 * Ricordati che i mesi sono 12.
 */
public class Es3
{
   public static void main1(){
       Random rand = new Random();
       System.out.print("Inserire il numero di righe e colonne della matrice: ");
       int n = Tastiera.leggiUnIntero();
       int[][] matrice = new int[n][n];
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < n; j++ ){
               matrice[i][j] = rand.nextInt(100);
           } 
       }
       int max = matrice[0][0], min = matrice[0][0];
       int[] posMax = new int[2];
       int[] posMin = new int[2];
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < n; j++ ){
               if ( matrice[i][j] > max ){
                   max = matrice[i][j];
                   posMax[0] = i;
                   posMax[1] = j;
               } else if ( matrice[i][j] < min ){
                   min = matrice[i][j];
                   posMin[0] = i;
                   posMin[1] = j;
                } 
            }
           System.out.println("Il massimo è: " + max + ", il minimo è: " + min);
           System.out.println("La posizione del massimo è : " + posMax[0] + ", " + posMax[1]);
           System.out.println("La posizione del minimo è : " + posMin[0] + ", " + posMin[1]);
           for ( i = 0; i < n; i++ ){
               for ( int j = 0; j < n; j++ ){
                   if ( j == n-1 ){
                       System.out.println(matrice[i][j]);
                   } else {
                       System.out.print(matrice[i][j] + " ");
                   }
               } 
           }
       }
   }
   public static void main2(){
       Random rand = new Random();
       System.out.print("Inserire il numero di righe e colonne della matrice: ");
       int n = Tastiera.leggiUnIntero();
       int[][] matrice = new int[n][n];
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < n; j++ ){
               matrice[i][j] = rand.nextInt(100);
           } 
       }
       int max = 0, totTemp, rigaMax = 0;
       for ( int j = 0; j < n; j++ ){
               max += matrice[0][j];
           }
       for ( int i = 1; i < n; i++ ){
           totTemp = 0;
           for ( int j = 0; j < n; j++ ){
               totTemp += matrice[i][j];
           } 
           if ( totTemp > max ){
                   rigaMax = i;
               }
       }
       System.out.println("La riga con la sommatoria massima è la: " + rigaMax);
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < n; j++ ){
               if ( j == n-1 ){
                   System.out.println(matrice[i][j]);
               } else {
                   System.out.print(matrice[i][j] + " ");
               }
           } 
       }
   }
   public static void main3(){
       Random rand = new Random();
       System.out.print("Inserire il numero di righe della matrice(<50): ");
       int n = Tastiera.leggiUnIntero();
       System.out.print("Inserire il numero di colonne della matrice(<50): ");
       int m = Tastiera.leggiUnIntero();
       if ( n >= 50 || m >= 50 ){
           return;
       }
       int[][] matrice = new int[n][m];
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < m; j++ ){
               matrice[i][j] = rand.nextInt(2);
           } 
       }
       int nElementi = n * m, nZeri = 0;
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < m; j++ ){
               if ( matrice[i][j] == 0 ){
                   nZeri++;
               } 
           } 
       }
       if ( nZeri > nElementi*0.8 ){
           for ( int i = 0; i < n; i++ ){
               for ( int j = 0; j < m; j++ ){
                   if ( j == n-1 ){
                       if ( matrice[i][j] == 0 ){
                           System.out.println("#");
                       } else {
                           System.out.println(matrice[i][j]);
                       }
                   } else {
                       if ( matrice[i][j] == 0 ){
                           System.out.print("# ");
                       } else {
                           System.out.print(matrice[i][j] + " ");
                       }
                    }
                } 
            }
       }
   } 
   public static void main4(){
       Random rand = new Random();
       System.out.print("Inserire il numero di prodotti: ");
       int n = Tastiera.leggiUnIntero(), temp = 0;
       int[][] matrice = new int[n][12];
       int[] medie = new int[n];
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < 12; j++ ){
               matrice[i][j] = rand.nextInt(100);
           } 
       }
       for ( int i = 0; i < n; i++ ){
           temp = 0;
           for ( int j = 0; j < 12; j++ ){
               temp += matrice[i][j];
           }
           medie[i] = temp/12;
       }
       Utilità.stampaDiUnArray(medie);
       for ( int i = 0; i < n; i++ ){
           for ( int j = 0; j < 12; j++ ){
               if ( j == 11 ){
                   System.out.println(matrice[i][j]);
               } else {
                   System.out.print(matrice[i][j] + " ");
               }
           } 
       }
   }
}
