
/**
 *
 */
public class Bibita extends Acqua
{
    private String nome;
    private double zucchero;
    private String[] coloranti;

    public Bibita(int residuoFisso, double sodio, int durezza, String nome, double zucchero, String[] coloranti){
        super(residuoFisso, sodio, durezza);
        setNome(nome);
        setZucchero(zucchero);
        setColoranti(coloranti);
    }

	public String getNome() {
		return nome;
	}

	public double getZucchero() {
		return zucchero;
	}

	public String[] getColoranti() {
		return coloranti;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setZucchero(double zucchero) {
		this.zucchero = zucchero;
	}

	public void setColoranti(String[] coloranti) {
		this.coloranti = coloranti;
	}

    public String toString(){
        String colorantiString = "";
        for ( int i = 0; i < getColoranti().length; i ++ ){
            colorantiString += " " + getColoranti()[i];
        }
        return String.format("%s %s %f %s", getNome(), super.toString(), getZucchero(), colorantiString);
    }
}
