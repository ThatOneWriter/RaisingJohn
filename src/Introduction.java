public class Introduction {
    public static void typewrittenIntro(String text, long speed) {
        for (int i = 0; i < text.length(); i++) {
            char print = text.charAt(i);
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(print);

        }

    }
}
