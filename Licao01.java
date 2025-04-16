//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class Licao01 {
    public Licao01() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayIncompleteTasks = new ArrayList();
        ArrayList<String> arrayCompleteTasks = new ArrayList();
        ArrayList<String> tasksArray = new ArrayList();
        boolean verification = true;
        boolean verificationOfDelete = true;
        boolean verificationTasksComplete = true;
        boolean SystemOutput = true;
        int index = 0;

        while(SystemOutput) {
            for(; verification; ++index) {
                System.out.println("Digite sua nova tarefa: ");
                String taskRequest = sc.nextLine();
                tasksArray.add(index, taskRequest);
                System.out.println("Deseja adicionar mais tarefas?\nS ou N");
                String newTasks = sc.nextLine();
                if (!newTasks.equalsIgnoreCase("S") && !newTasks.equalsIgnoreCase("N")) {
                    System.out.println("tente novamente");
                }

                if (newTasks.equalsIgnoreCase("N")) {
                    verification = false;
                }
            }

            System.out.println(tasksArray);

            while(verificationOfDelete) {
                System.out.println("Deseja deletar uma tarefa? \nS ou N");
                String deleteTask = sc.nextLine();
                if (!deleteTask.equalsIgnoreCase("S") && !deleteTask.equalsIgnoreCase("N")) {
                    System.out.println("tente novamente");
                } else if (deleteTask.equalsIgnoreCase("S")) {
                    System.out.println(tasksArray);
                    System.out.println("qual tarefa vc deseja deletar? ");
                    String deleteTaskOfUsers = sc.nextLine();
                    tasksArray.remove(deleteTaskOfUsers);
                    System.out.println(tasksArray);
                } else {
                    verificationOfDelete = false;
                }
            }

            while(verificationTasksComplete) {
                System.out.println("quais tarefas voce concluiu?\n" + String.valueOf(tasksArray));
                String taskComplete = sc.nextLine();
                if (tasksArray.contains(taskComplete)) {
                    arrayCompleteTasks.add(taskComplete + " feito");
                    System.out.println(arrayCompleteTasks);
                    verificationTasksComplete = false;
                } else {
                    if (!tasksArray.equals(arrayIncompleteTasks)) {
                        System.out.println(arrayIncompleteTasks);
                    }

                    verificationTasksComplete = false;
                }

                System.out.println("Deseja sair do programa? \nS ou N");
                String verificationSystem = sc.nextLine();
                if (!verificationSystem.equalsIgnoreCase("S") && !verificationSystem.equalsIgnoreCase("N")) {
                    System.out.println("tente novamente");
                } else if (verificationSystem.equalsIgnoreCase("S")) {
                    System.out.println("Obrigado, até mais tarde");
                    SystemOutput = false;
                } else {
                    System.out.println("OK");
                }
            }
        }

    }
}
