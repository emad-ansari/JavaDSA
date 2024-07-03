//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//class Process {
//    int id;
//    int arrivalTime;
//    int burstTime;
//    int completionTime;
//    int waitingTime;
//    int turnaroundTime;
//    int remainingTime;
//
//    public Process(int id, int arrivalTime, int burstTime) {
//        this.id = id;
//        this.arrivalTime = arrivalTime;
//        this.burstTime = burstTime;
//        this.remainingTime = burstTime;
//    }
//}
//
//public class CPUSchedulingAlgorithms {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter number of processes: ");
//        int numberOfProcesses = scanner.nextInt();
//        ArrayList<Process> processes = new ArrayList<>();
//
//        for (int i = 0; i < numberOfProcesses; i++) {
//            System.out.println("Enter arrival time and burst time for process " + (i + 1) + ": ");
//            int arrivalTime = scanner.nextInt();
//            int burstTime = scanner.nextInt();
//            processes.add(new Process(i + 1, arrivalTime, burstTime));
//        }
//
//        System.out.println("\nFCFS Scheduling:");
//        simulateFCFS(processes);
//
//        System.out.println("\nSJF Scheduling:");
//        simulateSJF(processes);
//
//        System.out.println("\nRound Robin Scheduling:");
//        System.out.println("Enter the time quantum: ");
//        int timeQuantum = scanner.nextInt();
//        simulateRoundRobin(processes, timeQuantum);
//
//        scanner.close();
//    }
//
//    public static void simulateFCFS(ArrayList<Process> processes) {
//        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
//        int currentTime = 0;
//
//        for (Process process : processes) {
//            if (currentTime < process.arrivalTime) {
//                currentTime = process.arrivalTime;
//            }
//            process.completionTime = currentTime + process.burstTime;
//            process.turnaroundTime = process.completionTime - process.arrivalTime;
//            process.waitingTime = process.turnaroundTime - process.burstTime;
//            currentTime = process.completionTime;
//        }
//
//        printProcessDetails(processes);
//    }
//
//    public static void simulateSJF(ArrayList<Process> processes) {
//        ArrayList<Process> readyQueue = new ArrayList<>();
//        ArrayList<Process> completedProcesses = new ArrayList<>();
//        int currentTime = 0;
//
//        while (completedProcesses.size() < processes.size()) {
//            for (Process process : processes) {
//                if (process.arrivalTime <= currentTime && !readyQueue.contains(process) && !completedProcesses.contains(process)) {
//                    readyQueue.add(process);
//                }
//            }
//
//            if (readyQueue.isEmpty()) {
//                currentTime++;
//            } else {
//                readyQueue.sort(Comparator.comparingInt(p -> p.burstTime));
//                Process currentProcess = readyQueue.remove(0);
//                currentTime += currentProcess.burstTime;
//                currentProcess.completionTime = currentTime;
//                currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
//                currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
//                completedProcesses.add(currentProcess);
//            }
//        }
//
//        printProcessDetails(completedProcesses);
//    }
//
//    public static void simulateRoundRobin(ArrayList<Process> processes, int timeQuantum) {
//        Queue<Process> readyQueue = new LinkedList<>();
//        ArrayList<Process> completedProcesses = new ArrayList<>();
//        int currentTime = 0;
//
//        while (completedProcesses.size() < processes.size()) {
//            for (Process process : processes) {
//                if (process.arrivalTime <= currentTime && !readyQueue.contains(process) && !completedProcesses.contains(process)) {
//                    readyQueue.add(process);
//                }
//            }
//
//            if (readyQueue.isEmpty()) {
//                currentTime++;
//            } else {
//                Process currentProcess = readyQueue.poll();
//                if (currentProcess.remainingTime > timeQuantum) {
//                    currentTime += timeQuantum;
//                    currentProcess.remainingTime -= timeQuantum;
//                    for (Process process : processes) {
//                        if (process.arrivalTime <= currentTime && !readyQueue.contains(process) && !completedProcesses.contains(process)) {
//                            readyQueue.add(process);
//                        }
//                    }
//                    readyQueue.add(currentProcess);
//                } else {
//                    currentTime += currentProcess.remainingTime;
//                    currentProcess.remainingTime = 0;
//                    currentProcess.completionTime = currentTime;
//                    currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
//                    currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
//                    completedProcesses.add(currentProcess);
//                }
//            }
//        }
//
//        printProcessDetails(completedProcesses);
//    }
//
//    public static void printProcessDetails(ArrayList<Process> processes) {
//        double totalWaitingTime = 0;
//        double totalTurnaroundTime = 0;
//
//        System.out.println("Process\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
//        for (Process process : processes) {
//            System.out.println("P" + process.id + "\t" + process.arrivalTime + "\t" +
//                    process.burstTime + "\t" + process.completionTime + "\t" + process.turnaroundTime + "\t" + process.waitingTime);
//            totalTurnaroundTime += process.turnaroundTime;
//            totalWaitingTime += process.waitingTime;
//        }
//
//        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / processes.size()));
//        System.out.println("Average Waiting Time: " + (totalWaitingTime / processes.size()));
//    }
//}
