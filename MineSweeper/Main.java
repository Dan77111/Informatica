import java.util.Random;
/**
 * 
 * 
 * @author Daniele
 * @version 0.1
 */
public class Main
{
    public static void main(){
        System.out.print("Inserire il numero di righe (0: Default): ");
        int n = Tastiera.leggiUnIntero();
        int righe, z = 0, r, c;
        if ( n == 0){
            righe = 16;
        } else {
            righe = n;
        }
        int[][] campo = new int[righe][righe];
        char[][] campoSegnato = new char[righe][righe];
        scriviCampo(righe, campo);
        for ( int i = 0; i < righe; i++ ){
            for ( int j = 0; j < righe; j++ ){
                campoSegnato[i][j] = 'c';
            }
        }
        while ( z == 0 ){
            stampaStato(campo, campoSegnato, righe);
            System.out.println("-------------------------------");
            System.out.print("Inserire coordinata x: ");
            c = Tastiera.leggiUnIntero();
            System.out.print("Inserire coordinata y: ");
            r = Tastiera.leggiUnIntero();
            z = 1;
            /*
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             * 
             */
        }
    }
    public static void stampaStato(int[][] campo, char[][] campoSegnato, int righe){
        for ( int i = 0; i < righe; i++ ){
            for ( int j = 0; j < righe; j++ ){
                if ( j == righe-1 ){
                    if ( campoSegnato[i][j] == 'c' ){
                        System.out.println("c");
                    } else if ( campoSegnato[i][j] == 'b' ){
                        System.out.println("b");
                    } else {
                    
                        System.out.println(campo[i][j]);
                    }
                } else {
                    if ( campoSegnato[i][j] == 'c' ){
                        System.out.print("c ");
                    } else if ( campoSegnato[i][j] == 'b' ){
                        System.out.print("b ");
                    } else {
                        System.out.print(campo[i][j] + " ");
                    }
                }
            }
        }
    }
    public static void scriviCampo(int righe, int[][] campo){
        int bombeIntorno, x;
        Random rand=new Random();
        for ( int i = 0; i < righe; i++ ){
            for ( int j = 0; j < righe; j++ ){
                x = rand.nextInt(5);
                if ( x == 1){
                    campo[i][j] = 9;
                }
            }
        }
        for ( int i = 0; i < righe; i++ ){
            for ( int j = 0; j < righe; j++ ){
                bombeIntorno = 0;
                if ( campo[i][j] == 9 ){
                    continue;
                }
                //--------------------------------------
                if ( i == 0 ){
                    if ( j == 0 ){
                        for ( int t = i; t <= i + 1; t ++ ){
                            for ( int y = j; y <= j + 1; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } else if ( j == righe-1 ){
                        for ( int t = i; t <= i + 1; t ++ ){
                            for ( int y = j - 1; y <= j; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } else {
                        for ( int t = i; t <= i + 1; t ++ ){
                            for ( int y = j - 1; y <= j + 1; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } 
                    //-----------------------------------------------------------------
                } else  if ( i == righe-1 ){ 
                    if ( j == 0 ){
                        for ( int t = i - 1; t <= i; t ++ ){
                            for ( int y = j; y <= j + 1; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } else if ( j == righe-1 ){
                        for ( int t = i - 1; t <= i; t ++ ){
                            for ( int y = j - 1; y <= j; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } else {
                        for ( int t = i - 1; t <= i; t ++ ){
                            for ( int y = j - 1; y <= j + 1; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } 
                    //--------------------------------------------------------------------------
                } else { 
                    if ( j == 0 ){
                        for ( int t = i - 1; t <= i + 1; t ++ ){
                            for ( int y = j; y <= j + 1; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } else if ( j == righe-1 ){
                        for ( int t = i - 1; t <= i + 1; t ++ ){
                            for ( int y = j - 1; y <= j; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } else {
                        for ( int t = i - 1; t <= i + 1; t ++ ){
                            for ( int y = j - 1; y <= j + 1; y ++ ){
                                if ( campo[t][y] == 9 ){
                                    bombeIntorno ++;
                                }
                            }
                        }
                    } 
                }
                campo[i][j] = bombeIntorno;
            }
        }
    }
}
