package it.unibs.fp.tamagotchi;

public class OutputStringhe {
  // Tamagotchi.java
  public static final String HAPPY_FACE = " . . .\n. Θ Θ .\n. \\_/ .\n . . .\n";
  public static final String NORMAL_FACE = " O O O\nO • • O\nO --- O\n O O O\n";
  public static final String SAD_FACE = " O O O\nO I I O\nO  Λ  O\n O O O\n";
  public static final String DEAD_FACE = " . . .\n. X X .\n.  O  .\n . . .\n";

  // ProgramMenu.java
  // salutoIniziale()
  public static final String MSG_BENVENUTO = "Benvenuto nel programma Tamagotchi!";
  // initializeTamagotchi()
  public static final String MSG_INSERT_NOME = "Prima di cominciare dobbiamo inizializzare il tuo tamagotchi.\nInserisci il nome del tuo tamagotchi: ";
  public static final String MSG_INSERT_SAZIETA = "Inserisci la sazieta' di %s: ";
  public static final String MSG_INSERT_SODDISFAZIONE = "Inserisci la soddisfazione di %s: ";
  public static final String MSG_INITIALIZATION_SUCCESS = "Il tuo tamagotchi %s e' stato inizializzato con successo!";
  // visualizzaTamagotchi()
  public static final String MSG_VISUALIZZA_PARAMETRI = "\nSazieta': %d%%\tSoddisfazione: %d%%";
  // accarezzaTamagotchi()
  public static final String MSG_INSERT_NUM_CAREZZE = "Quante carezze vuoi fare a %s: ";
  // nutriTamagotchi()
  public static final String MSG_INSERT_NUM_BISCOTTI = "Quanti biscotti vuoi dare a %s: ";

  // App.java
  public static final String[] VOCI = { "Accarezza", "Nutri" };
  public static final String MSG_MORTE = "Il tuo tamagotchi %s e' morto!\nFine partita";
}
