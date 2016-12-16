public class Data2
{private int anno;private int mese;private int giorno;public Data2(int anno,int mese,int giorno){setAnno(anno);setMese(mese);setGiorno(giorno);}
public void setData(int anno,int mese,int giorno){setAnno(anno);setMese(mese);setGiorno(giorno);}
public void setAnno(int anno){this.anno=anno;}
public void setMese(int mese){if(mese<=12&&mese>=1){this.mese=mese;}}
public void setGiorno(int giorno){if(giorno>0){if(mese==2){if(anno%4==0){if(giorno<=29){this.giorno=giorno;}}else if(giorno<=28){this.giorno=giorno;}}else if(mese==11||mese==4||mese==6||mese==9){if(giorno<=30){this.giorno=giorno;}}else{if(giorno<=31){this.giorno=giorno;}}}}}