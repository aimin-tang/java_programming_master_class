public class MegaBytesAndKiloBytes {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int m = kiloBytes / 1024;
        int k = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + m + " MB and " + k + " KB");
        }
    }
}
