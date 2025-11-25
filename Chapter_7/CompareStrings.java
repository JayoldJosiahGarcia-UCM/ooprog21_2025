import java.util.Scanner;
class CompareStrings {
    public static void main(String[] args) {
        String name = "Carmen";
        String inputName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name > ");
        inputName = scanner.nextLine();

        if(name.equals(inputName)){
            System.out.println(inputName + " is equal to " + name);
        }
        else{
            System.out.println(inputName + " is not equal to " + name);
        }
    }
}
