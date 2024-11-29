package labtask8;

class Defence {
    public void Purpose() {
        System.out.println("To protect the country.");
    }
}
class Navy extends Defence {
    public void Purpose() {
        System.out.println("To protect the nation's waters");
    }
}
class Airforce extends Defence {
    public void Purpose() {
        System.out.println("To defend the country from aerial threats.");
    }
}
class Army extends Defence {
    public void Purpose() {
        System.out.println("To protect the land borders");
    }
}
public class Main {
    public static void main(String[] args) {
        Defence navy = new Navy();
        Defence airforce = new Airforce();
        Defence army = new Army();

        navy.Purpose();
        airforce.Purpose();
        army.Purpose();
    }
}
