package college;
import java.util.ArrayList;
import java.util.Scanner;
public class LRUSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of frames: ");
        int framesCount = scanner.nextInt();
        System.out.print("Enter the number of pages: ");
        int pagesCount = scanner.nextInt();
        int[] pages = new int[pagesCount];
        System.out.print("Enter the page reference string: ");
        for (int i = 0; i < pagesCount; i++) {
            pages[i] = scanner.nextInt();
        }
        lruPageReplacement(pages, framesCount);
        scanner.close();
    }
    private static void lruPageReplacement(int[] pages, int framesCount) {
        ArrayList<Integer> frames = new ArrayList<>(framesCount);
        int pageFaults = 0;
        for (int page : pages) {
            if (!frames.contains(page)) {
                if (frames.size() == framesCount) {
                    frames.remove(0);
                }
                frames.add(page);
                pageFaults++;
            } else {
                frames.remove((Integer) page);
                frames.add(page);
            }
            System.out.println("Frames: " + frames + " | Page Faults: " + pageFaults);
        }
        System.out.println("Total Page Faults: " + pageFaults);
    }
}
