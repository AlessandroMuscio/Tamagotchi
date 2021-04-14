package it.unibs.fp.tamagotchi;

public class Tamagotchi {
  private static final int PERCENTUALE_MINIMA = 0;
  private static final int PERCENTUALE_MASSIMA = 100;
  private static final int SOGLIA_MINIMA = 30;
  private static final int SOGLIA_MASSIMA = 80;
  private final String nome;
  private int sazieta;
  private int soddisfazione;
  private boolean morto;

  public Tamagotchi(String nome, int sazieta, int soddisfazione) {
    this.nome = nome;
    this.sazieta = sazieta;
    this.soddisfazione = soddisfazione;
    morto = false;
  }

  // Getters
  public static int getSogliaMinima() {
    return SOGLIA_MINIMA;
  }

  public static int getSogliaMassima() {
    return SOGLIA_MASSIMA;
  }

  public String getNome() {
    return nome;
  }

  public int getSazieta() {
    return sazieta;
  }

  public int getSoddisfazione() {
    return soddisfazione;
  }

  public boolean isMorto() {
    return morto;
  }

  // Setters
  public void setSazieta(int sazieta) {
    this.sazieta = sazieta;
  }

  public void setSoddisfazione(int soddisfazione) {
    this.soddisfazione = soddisfazione;
  }

  public void setMorto(boolean morto) {
    this.morto = morto;
  }

  // Methods
  public void addOrRemoveSazieta(int sazieta) {
    int sommaSazieta = this.sazieta + sazieta;

    if (sommaSazieta > PERCENTUALE_MASSIMA)
      setSazieta(PERCENTUALE_MASSIMA);
    else if (sommaSazieta < PERCENTUALE_MINIMA)
      setSazieta(PERCENTUALE_MINIMA);
    else
      setSazieta(sommaSazieta);
  }

  public void addOrRemoveSoddisfazione(int soddisfazione) {
    int sommaSoddisfazione = this.soddisfazione + soddisfazione;

    if (sommaSoddisfazione > PERCENTUALE_MASSIMA)
      setSoddisfazione(PERCENTUALE_MASSIMA);
    else if (sommaSoddisfazione < PERCENTUALE_MINIMA)
      setSoddisfazione(PERCENTUALE_MINIMA);
    else
      setSoddisfazione(sommaSoddisfazione);
  }

  public String getUmore() {
    if (sazieta > SOGLIA_MASSIMA && soddisfazione > SOGLIA_MASSIMA)
      return OutputStringhe.HAPPY_FACE;
    else if ((sazieta < SOGLIA_MINIMA && sazieta > PERCENTUALE_MINIMA)
        || (soddisfazione < SOGLIA_MINIMA && soddisfazione > PERCENTUALE_MINIMA))
      return OutputStringhe.SAD_FACE;
    else if (sazieta == 0 || soddisfazione == 0) {
      morto = true;
      return OutputStringhe.DEAD_FACE;
    } else
      return OutputStringhe.NORMAL_FACE;
  }
}
