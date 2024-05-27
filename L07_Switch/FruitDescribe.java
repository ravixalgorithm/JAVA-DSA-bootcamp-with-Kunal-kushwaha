import java.util.Scanner;

public class FruitDescribe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("About which Fruit You wanna Know ?? - ");
        String name = sc.next();
        switch (name){
            case "Apple" -> System.out.println("A crisp, sweet or tart fruit that grows on trees. Apples come in many colors, including red, green, yellow, and pink. They are a good source of fiber and vitamin C.");
            case "Avocado" -> System.out.println("A pear-shaped fruit with a green bumpy skin and a creamy, buttery flesh. Avocados are high in healthy fats and potassium. They aren't sweet like many other fruits, and are often used in savory dishes like guacamole.");
            case "Banana" -> System.out.println("A long, curved fruit with a yellow peel and a white, starchy flesh. Bananas are a good source of potassium and fiber.");
            case "Blackberry" -> System.out.println("A small, black fruit that grows on thorny bushes. Blackberries are sweet and tart, and they are a good source of vitamin C and fiber.");
            case "Blueberry" -> System.out.println("A small, round, blue fruit that grows on bushes. Blueberries are sweet and tart, and they are a good source of antioxidants.");
            case "Cherry" -> System.out.println("A small, round fruit that grows on trees. Cherries come in red, black, and yellow varieties. They are sweet and tart, and they are a good source of vitamin C.");
            case "Dragon fruit" -> System.out.println("A bright pink fruit with white flesh and black seeds. Dragon fruit has a mild, sweet flavor.");
            case "Grape" -> System.out.println("A small, round fruit that grows in clusters on vines. Grapes come in many colors, including red, green, purple, and black. They can be eaten fresh or dried (raisins), or fermented to make wine.");
            case "Guava" -> System.out.println("A tropical fruit with a green or yellow skin and a sweet, tangy flesh. Guava is a good source of vitamin C and fiber.");
            case "Kiwi" -> System.out.println("A small, oval-shaped fruit with a green flesh and black seeds. Kiwis are sweet and tart, and they are a good source of vitamin C and fiber.");
            case "Mango" -> System.out.println("A tropical fruit with a yellow or orange skin and a sweet, juicy flesh. Mangoes are a good source of vitamins A and C.");
            case "Orange" -> System.out.println("A citrus fruit with a bright orange skin and a sweet, juicy flesh. Oranges are a good source of vitamin C.");
            case "Papaya" -> System.out.println("A tropical fruit with a green or yellow skin and a sweet, orange flesh. Papaya is a good source of vitamin C and fiber.");
            case "Peach" -> System.out.println("A stone fruit with a fuzzy skin and a sweet, juicy flesh. Peaches come in yellow and white varieties.");
            case "Pear" -> System.out.println("A sweet, juicy fruit that grows on trees. Pears come in many shapes and sizes, and they can be green, yellow, or red.");
            case "Pineapple" -> System.out.println("A tropical fruit with a tough, spiky exterior and a sweet, juicy flesh. Pineapples are a good source of vitamin C and manganese.");
            case "Pomegranate" -> System.out.println("A large, round fruit with a red, tough skin and numerous edible seeds. Pomegranates are known for their tart, tangy flavor and their high antioxidant content.");
            case "Starfruit" -> System.out.println("A yellow or green fruit with a star-shaped cross-section. Starfruit has a sweet and tart flavor.");
            case "Tomato" -> System.out.println("Technically a fruit (although many people consider it a vegetable), tomatoes are a juicy, red fruit that comes in a variety of shapes and sizes. Tomatoes are a good source of vitamin C and lycopene");
            case "Watermelon" -> System.out.println("A large, round fruit with a green rind and a sweet, juicy red flesh. Watermelon is a refreshing summer fruit that is also a good source of vitamins A and C.");
            default -> System.out.println("fruit not found!! OR not uploaded till now");
        }
    }
}

