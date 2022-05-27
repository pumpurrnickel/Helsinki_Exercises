public class ReadingMain {
    public static void main(String[] args) {

        System.out.println("Yeehaw.");
        ReadingFilesPerLine reading = new ReadingFilesPerLine();

        reading.read("C://WIN-Program//Full_Stack_103//Intro_to_Java//Helsinki_Part_10_Streams//ReadingFilesPerLine//src//readThis.txt").stream()
        .forEach(System.out::println);

    }
}
