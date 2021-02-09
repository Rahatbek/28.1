package kg.megacom.ENUM;

public enum DeveloperGrade {
    JUNIOR("I am junior developer"),
    MIDDLE("I am middle developer"),
    SENIOR("I am senior developer"),
    TEAMLEAD("I am teamlead developer"),
    CEO("You are trainee");

    String phrase;

    DeveloperGrade(String phrase) {
        this.phrase = phrase;
    }

    DeveloperGrade() {
    }

    public String printPhrase() {
        return "DeveloperGrade{" +
                "phrase='" + phrase + '\'' +
                '}';
    }
}
