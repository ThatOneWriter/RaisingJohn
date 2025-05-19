public class Main {
    public static void main(String[] args) {
        String message = "\n" +
                "\n" +
                "               Introduction Text:" +
                "        You have been transported to an interactive story mode game where you the user\n" +
                "        are a teacher trying to navigate their way working at an extremely elite \n" +
                "        superhero high school. \n" +
                " ";
        long speed = 200;

        Introduction.typewrittenIntro(message, speed);
        
        MainFrame mainFrame = new MainFrame("Raising Johnny");

        
    }
}
