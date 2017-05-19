
/**
 *
 */
public class Test
{
    public static void main(){
        Animale[] animali = {
            new GattoComune("D", "rosso"),
            new GattoComune("E", "blu"),
            new GattoComune("G", "verde"),
            new Giraffa("H", 10),
            new Giraffa("A", 2),
            new Giraffa("J", 7),
            new GrandeSqualoBianco("K", 124),
            new GrandeSqualoBianco("C", 23),
            new GrandeSqualoBianco("B", 21),
            new GrandeSqualoBianco("F", 43)
        };

        Animale temp;

        ////////////////////////////////
        // ## @@ SELECTION SORT @@ ## //
        ////////////////////////////////
        int posMin;
        for ( int i = 0; i < animali.length - 1; i ++ ){
            posMin = i;
            for ( int j = i + 1; j < animali.length; j ++ ){
                if ( animali[posMin].getNomeProprio().compareTo(animali[j].getNomeProprio()) > 0 ){
                    posMin = j;
                }
            }
            temp = animali[posMin];
            animali[posMin] = animali[i];
            animali[i] = temp;
        }

        /////////////////////////////
        // ## @@ BUBBLE SORT @@ ## //
        /////////////////////////////
        //  boolean sorted;
        //  for ( int i = 1; i < animali.length; i ++ ){
        //    sorted = true;
        //    for ( int j = 0; j < animali.length - i; j ++ ){
        //      if ( animali[j].getNomeProprio().compareTo(animali[j+1].getNomeProprio()) > 0 ){
        //        temp = animali[j];
        //        animali[j] = animali[j+1];
        //        animali[j+1] = temp;
        //        sorted = false;
        //      }
        //    }
        //    if ( sorted ){
        //      break;
        //    }
        // }

        for ( int i = 0; i < animali.length; i ++ ){
            System.out.println(animali[i]);
        }
    }
}
