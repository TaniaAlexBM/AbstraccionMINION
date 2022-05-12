package tareas.Minion;

public class Minion1 {
    public static void main(String[] args) {
        MinionGS minion = new MinionGS();
        minion.estatura = (float) 0.86;
        minion.ojos = 2;
        minion.colorOjos = "verdes";

        System.out.printf("Estatura: %.2fm\n" +
                "Cantidad de ojos: %d%n" +
                "Color de ojos: %s",
                minion.estatura, minion.ojos, minion.colorOjos);
    }
}
