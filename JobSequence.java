import java.util.*;

public class JobSequence {
    public static int MaxProfit(List<Task> tasks) {
        tasks.sort((t1, t2) -> t2.profit - t1.profit);
        int maxDeadline = tasks.stream().mapToInt(task -> task.deadline).max().orElse(0);
        System.out.println("maxDeadline: " +maxDeadline);
        int[] taskSchedule = new int[maxDeadline + 1];
        System.out.println("taskSchedule: " +Arrays.toString(taskSchedule));

        int maxProfit = 0;
        for (Task task : tasks) {
            System.out.println("task profit: " +task.profit+ "task deadline: " +task.deadline);
            int slot = task.deadline;
            System.out.println("deadline:" +slot);
            while (slot > 0 && taskSchedule[slot] != 0) {
                System.out.println("taskScheduleSlot: " +taskSchedule[slot]);
                slot--;
            }
            System.out.println("slot:" +slot);
            if (slot > 0) {
                taskSchedule[slot] = task.profit;
                System.out.println("Pre taskScheduleSlot: " +taskSchedule[slot]);
                maxProfit += task.profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(9, 15));
        tasks.add(new Task(2, 2));
        tasks.add(new Task(5, 18));
        tasks.add(new Task(7, 1));
        tasks.add(new Task(4, 25));
        tasks.add(new Task(2, 20));
        tasks.add(new Task(5, 8));
        tasks.add(new Task(7, 10));
        tasks.add(new Task(4, 12));
        tasks.add(new Task(3, 5));

        int maxProfit = MaxProfit(tasks);
        System.out.println("Maximum profit earned: " + maxProfit);
    }
}


class Task {
    int deadline;
    int profit;

    public Task(int deadline, int profit) {
        this.deadline = deadline;
        this.profit = profit;
    }
}