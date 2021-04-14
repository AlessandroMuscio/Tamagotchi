package it.unibs.fp.tamagotchi;

import it.unibs.fp.mylib.MyMenu;
import it.unibs.fp.mylib.InputDati;

public class ProgramMenu extends MyMenu {
  private final int MASSIMO_NUMERO_AZIONI = 20;
  private final int RIMOZIONE_PER_TURNO = -5;
  private static Tamagotchi tamagotchi;

  public ProgramMenu(String titolo, String[] voci) {
    super(titolo, voci);
  }

  public static Tamagotchi getTamagotchi() {
    return tamagotchi;
  }

  public static String salutoIniziale() {
    System.out.println(OutputStringhe.MSG_BENVENUTO);
    aspetta(1500);

    initializeTamagotchi();
    return "Menu' del tamagotchi " + tamagotchi.getNome();
  }

  private static void initializeTamagotchi() {
    String nome = InputDati.leggiStringaNonVuota(OutputStringhe.MSG_INSERT_NOME, true);
    int sazieta = InputDati.leggiInteroCompreso(String.format(OutputStringhe.MSG_INSERT_SAZIETA, nome), 0, 100);
    int soddisfazione = InputDati.leggiInteroCompreso(String.format(OutputStringhe.MSG_INSERT_SODDISFAZIONE, nome), 0,
        100);

    tamagotchi = new Tamagotchi(nome, sazieta, soddisfazione);
    System.out.println(String.format(OutputStringhe.MSG_INITIALIZATION_SUCCESS, nome));
  }

  public void visualizzaTamagotchi() {
    System.out.println(
        String.format(OutputStringhe.MSG_VISUALIZZA_PARAMETRI, tamagotchi.getSazieta(), tamagotchi.getSoddisfazione()));

    System.out.println(tamagotchi.getUmore());
  }

  public void accarezzaTamagotchi() {
    int numCarezze = InputDati.leggiInteroConMassimo(
        String.format(OutputStringhe.MSG_INSERT_NUM_CAREZZE, tamagotchi.getNome()), MASSIMO_NUMERO_AZIONI);

    tamagotchi.addOrRemoveSoddisfazione(numCarezze);
    tamagotchi.addOrRemoveSazieta(RIMOZIONE_PER_TURNO);
  }

  public void nutriTamagotchi() {
    int numBiscotti = InputDati.leggiInteroConMassimo(
        String.format(OutputStringhe.MSG_INSERT_NUM_BISCOTTI, tamagotchi.getNome()), MASSIMO_NUMERO_AZIONI);

    tamagotchi.addOrRemoveSazieta(numBiscotti);
    tamagotchi.addOrRemoveSoddisfazione(RIMOZIONE_PER_TURNO);
  }
}
