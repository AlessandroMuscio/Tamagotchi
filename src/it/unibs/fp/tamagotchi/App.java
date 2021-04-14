package it.unibs.fp.tamagotchi;

public class App {
  public static void main(String[] args) throws Exception {

    String titolo;
    int scelta;
    ProgramMenu menu;

    titolo = ProgramMenu.salutoIniziale();
    menu = new ProgramMenu(titolo, OutputStringhe.VOCI);

    do {
      menu.visualizzaTamagotchi();
      if (ProgramMenu.getTamagotchi().isMorto()) {
        System.out.println(String.format(OutputStringhe.MSG_MORTE, ProgramMenu.getTamagotchi().getNome()));
        scelta = 0;
      } else {
        scelta = menu.scegli();

        switch (scelta) {
        case 1:
          menu.accarezzaTamagotchi();
          break;

        case 2:
          menu.nutriTamagotchi();
          break;
        }
      }
    } while (scelta != 0);

  }
}
