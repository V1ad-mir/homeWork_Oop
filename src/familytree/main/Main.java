package familytree.main;

import java.util.Scanner;

import familytree.Wriitable.FileHandler;
import familytree.model.FamilyTree.TreeNode;
import familytree.model.Person.Person;
import familytree.model.FamilyTree.FamilyTree;

public class Main <E extends TreeNode>{
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить человека");
            System.out.println("2. Сохранить в файл");
            System.out.println("3. Загрузить из файла");
            System.out.println("4. Отсортировать по возрасту");
            System.out.println("5. Отсортировать по количеству детей");
            System.out.println("6. Отсортировать по имени");
            System.out.println("7. Вывести детей");
            System.out.println("8. Вывести список людей");
            System.out.println("9. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Person person = new Person();
                    System.out.println("Введите имя:");
                    person.setFirstName(scanner.next());
                    System.out.println("Введите фамилию:");
                    person.setLastName(scanner.next());
                    System.out.println("Введите дату рождения в вормате 2016-09-21:");
                    person.setBirthday(scanner.next());
                    System.out.println("Введите имя отца:");
                    person.setFatherFirstName(scanner.next());
                    System.out.println("Введите фамилию отца:");
                    person.setFatherLastName(scanner.next());
                    System.out.println("Введите имя матери:");
                    person.setMotherFirstName(scanner.next());
                    System.out.println("Введите фамилию матери:");
                    person.setMotherLastName(scanner.next());
                    familyTree.addPerson(person);

                    break;

                case 2:
                    System.out.println("Введите имя файла:");
                    String filePath = scanner.next();
                    FileHandler fileHandler = new FileHandler();
                    System.out.println(familyTree);
                    fileHandler.save(familyTree, filePath);
                    break;

                case 3:
                    System.out.println("Введите имя файла:");
                    String filePath1 = scanner.next();
                    FileHandler fileHandlerLoad = new FileHandler();
                    familyTree = (FamilyTree) fileHandlerLoad.read(filePath1);
                    System.out.println("файл загружен");

                case 4:
                    familyTree.sortByBirthDate();
                    break;

                case 5:
                    familyTree.sortByChildrenCount();
                    break;

                case 6:
                    familyTree.sortByFirstName();
                    break;

                case 7:
                    System.out.println("Введите имя:");
                    String firstName = scanner.next();
                    System.out.println("Введите фамилию:");
                    String lastName = scanner.next();
                    familyTree.printChildren(firstName, lastName);
                    break;
                case 8:
                    for (Object pers : familyTree) {
                        System.out.println(pers);


                    }
                    break;
                case 9:
                    running = false;

                    System.out.println("До свидание!");
                    break;



                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}
