package college;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class FIFOSimulation {
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
        fifoPageReplacement(pages, framesCount);
        scanner.close();
    }
    private static void fifoPageReplacement(int[] pages, int framesCount) {
        Queue<Integer> frameQueue = new LinkedList<>();
        int pageFaults = 0;
        for (int page : pages) {
            if (!frameQueue.contains(page)) {
                if (frameQueue.size() == framesCount) {
                    frameQueue.poll();
                }
                frameQueue.add(page);
                pageFaults++;
            }
            System.out.println("Frames: " + frameQueue + " | Page Faults: " + pageFaults);
        }

        System.out.println("Total Page Faults: " + pageFaults);
    }
}
