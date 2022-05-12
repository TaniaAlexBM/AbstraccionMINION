package tareas.Minion;

public class Minion2 {
    public static void main(String[] args) {
        MinionC minionC = new MinionC((float) 1.30,1,"azul");
        System.out.printf("Estatura: %.2fm\n" +
                        "Cantidad de ojos: %d%n" +
                        "Color de ojos: %s",
                minionC.estatura, minionC.ojos, minionC.colorOjos);
    }
}
