
/**
 *
 */
public class Animale
{
	protected String nomeComune;
	protected String specie;
	protected String habitat;
	protected String statoDiConservazione;
	protected String nomeProprio;

	public Animale(String nomeComune, String specie, String habitat, String statoDiConservazione, String nomeProprio){
		setNomeComune(nomeComune);
		setSpecie(specie);
		setHabitat(habitat);
		setStatoDiConservazione(statoDiConservazione);
		setNomeProprio(nomeProprio);
	}

	public String getNomeComune(){
		return nomeComune;
	}
	public String getSpecie(){
		return specie;
	}
	public String getHabitat(){
		return habitat;
	}
	public String getStatoDiConservazione(){
		return statoDiConservazione;
	}
	public String getNomeProprio(){
		return nomeProprio;
	}
	public void setNomeComune(String nomeComune){
		this.nomeComune = nomeComune;
	}
	public void setSpecie(String specie){
		this.specie = specie;
	}
	public void setHabitat(String habitat){
		this.habitat = habitat;
	}
	public void setStatoDiConservazione(String statoDiConservazione){
		this.statoDiConservazione = statoDiConservazione;
	}
	public void setNomeProprio(String nomeProprio){
		this.nomeProprio = nomeProprio;
	}

	public String toString(){
		return String.format("%s:\n\tSpecie: %s\n\tHabitat: %s\n\tNome Comune: %s\n\tStato Di Conservazione: %s",getNomeProprio(), getSpecie(), getHabitat(), getNomeComune(), getStatoDiConservazione() );
	}
}
