import java.util.Scanner;

public class Hierarchy {
    Node root;
    
    public class Node {
        String data;
        Node first_child;
        Node second_child;
        Node third_child;
        Node fourth_child;
        Node fifth_child;
        Node sixth_child;
        Node seventh_child;
        Node eighth_child;
        
        
        public Node(String data) {
            this.data = data;
        } 
    }
    
    public void createTree() {
        Node consumable = new Node("Consumable");
        Node food = new Node("Food");
        Node bev = new Node("Beverage");
        Node poultry = new Node("Poultry");
        Node fruit =  new Node("Fruit");
        Node meat = new Node("Meat");
        Node veg = new Node("Vegetable");
        Node dairy = new Node("Dairy Product");
        Node condiments = new Node("Condiments");
        Node fish = new Node("Fish");
        Node shrimp = new Node("Shrimp");
        Node egg = new Node("Egg");
        Node chicken = new Node("Chicken");
        Node apple = new Node("Apple");
        Node banana = new Node("Banana");
        Node grape = new Node("Grape");
        Node pine = new Node("Pineapple");
        Node beef = new Node("Beef");
        Node pork = new Node("Pork");
        Node tomato = new Node("Tomato");
        Node gb = new Node("Green Bean");
        Node spnch = new Node("Spinach");
        Node letc = new Node("Lettuce");
        Node crrt = new Node("Carrots");
        Node butter = new Node("Butter");
        Node cheese = new Node("Cheese");
        Node milk = new Node("Milk");
        Node yc = new Node("Yoghurt Cream");
        Node rice = new Node("Rice");
        Node ss = new Node("Soy Sauce");
        Node sp = new Node("Shrimp Paste");
        Node cc = new Node("Cocoa");
        Node fs = new Node("Fish Sauce");
        Node oj = new Node("Orange Juice");
        Node shk = new Node("Shake");
        
        root = consumable;
        root.first_child = bev;
        root.second_child = food;
        bev.first_child = oj;
        bev.second_child = shk;
        food.first_child = fish;
        food.second_child = shrimp;
        food.third_child = poultry;
        food.fourth_child = fruit;
        food.fifth_child = meat;
        food.sixth_child = veg;
        food.seventh_child = dairy;
        food.eighth_child = condiments;
        poultry.first_child = egg;
        poultry.second_child = chicken;
        fruit.first_child = apple;
        fruit.second_child = banana;
        fruit.third_child = grape;
        fruit.fourth_child = pine;
        meat.first_child = pork;
        meat.second_child = beef;
        veg.first_child = tomato;
        veg.second_child = gb;
        veg.third_child = spnch;
        veg.fourth_child = letc;
        veg.fifth_child = crrt;
        dairy.first_child = butter;
        dairy.second_child = cheese;
        dairy.third_child = milk;
        dairy.fifth_child = yc;
        condiments.first_child = rice;
        condiments.second_child = ss;
        condiments.third_child = sp;
        condiments.fourth_child = cc;
        condiments.fifth_child = fs;
       
    }
    
    public void traverse(Node root) {
        if (root == null) {
            return;
        } 
        if ("Fish".equals(root.data) || "Shrimp".equals(root.data) || "Poultry".equals(root.data) || "Fruit".equals(root.data) || "Meat".equals(root.data) 
                || "Vegetable".equals(root.data) || "Dairy Product".equals(root.data) || "Condiments".equals(root.data) || "Orange Juice".equals(root.data) || "Shake".equals(root.data)) {
            System.out.print("\t");
        }
        else if ("Egg".equals(root.data) || "Chicken".equals(root.data) || "Apple".equals(root.data) || "Banana".equals(root.data) || "Grape".equals(root.data)
                 || "Pineapple".equals(root.data) || "Beef".equals(root.data) || "Pork".equals(root.data) || "Tomato".equals(root.data) || "Green Bean".equals(root.data)
                 || "Spinach".equals(root.data) || "Lettuce".equals(root.data) || "Carrots".equals(root.data) || "Butter".equals(root.data) || "Cheese".equals(root.data)
                || "Milk".equals(root.data) || "Yoghurt Cream".equals(root.data) || "Rice".equals(root.data) || "Soy Sauce".equals(root.data) || "Shrimp Paste".equals(root.data)
                || "Cocoa".equals(root.data) || "Fish Sauce".equals(root.data)) {
            System.out.print("\t\t");
        }
        System.out.println('\u2022' + root.data);
        System.out.print("\t");

        traverse(root.first_child);
        traverse(root.second_child);
        traverse(root.third_child);
        traverse(root.fourth_child);
        traverse(root.fifth_child);
        traverse(root.sixth_child);
        traverse(root.seventh_child);
        traverse(root.eighth_child);
    }
    
     public void traverse_ascii(Node root) {
        if (root == null) {
            return;
        } 
        if ("Fish".equals(root.data) || "Shrimp".equals(root.data) || "Poultry".equals(root.data) || "Fruit".equals(root.data) || "Meat".equals(root.data) 
                || "Vegetable".equals(root.data) || "Dairy Product".equals(root.data) || "Condiments".equals(root.data) || "Orange Juice".equals(root.data) || "Shake".equals(root.data)) {
            System.out.print(" ");
        }
        else if ("Egg".equals(root.data) || "Chicken".equals(root.data) || "Apple".equals(root.data) || "Banana".equals(root.data) || "Grape".equals(root.data)
                 || "Pineapple".equals(root.data) || "Beef".equals(root.data) || "Pork".equals(root.data) || "Tomato".equals(root.data) || "Green Bean".equals(root.data)
                 || "Spinach".equals(root.data) || "Lettuce".equals(root.data) || "Carrots".equals(root.data) || "Butter".equals(root.data) || "Cheese".equals(root.data)
                || "Milk".equals(root.data) || "Yoghurt Cream".equals(root.data) || "Rice".equals(root.data) || "Soy Sauce".equals(root.data) || "Shrimp Paste".equals(root.data)
                || "Cocoa".equals(root.data) || "Fish Sauce".equals(root.data)) {
            System.out.print("  ");
        }
        if ("Consumable".equals(root.data)) {
           System.out.println(root.data); 
        }
        else {
            System.out.println('\u2517' + root.data); 
        }
        System.out.print(" ");

        traverse_ascii(root.first_child);
        traverse_ascii(root.second_child);
        traverse_ascii(root.third_child);
        traverse_ascii(root.fourth_child);
        traverse_ascii(root.fifth_child);
        traverse_ascii(root.sixth_child);
        traverse_ascii(root.seventh_child);
        traverse_ascii(root.eighth_child);
    }
   
    
    public static void main(String[] args) {
        Hierarchy tree = new Hierarchy();
        tree.createTree();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
       
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Hierarchy");
            System.out.println("1 - Print w/ ASCII");
            System.out.println("2 - Print w/ bullet points");
            System.out.println("3 - Exit");
            System.out.print("Enter your choice: ");
            System.out.println(" ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1 ->   {
                    tree.traverse_ascii(tree.root);
                    System.out.println(" ");
                    break;
                }
                case 2 ->  {
                    tree.traverse(tree.root);
                    System.out.println(" ");
                    break;
                }
                case 3 ->  {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> System.out.print("Wrong input, try again: ");
            }
        } while(choice <= 3);
    }
}
