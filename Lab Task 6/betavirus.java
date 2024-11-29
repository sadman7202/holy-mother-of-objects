package labtask6;
//5no
class VirusEffect {
    // Method to print symptoms
    public void symptoms() {
        System.out.println("Common symptoms: Fever, cough, fatigue");
    }
}

class AlphaVirus extends VirusEffect {
    // Additional methods specific to AlphaVirus can be added here
}

class BetaVirus extends VirusEffect {
    public static void main(String[] args) {
        // Create an object of AlphaVirus
        AlphaVirus alpha = new AlphaVirus();

        // Create an object of BetaVirus
        BetaVirus beta = new BetaVirus();

        // Access the symptoms method using both objects
        System.out.println("AlphaVirus Symptoms:");
        alpha.symptoms();

        System.out.println("BetaVirus Symptoms:");
        beta.symptoms();
    }
}

