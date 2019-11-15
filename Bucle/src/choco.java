public class choco {
    public static void main(String[] args) {
        int money = 0;
        int chocolates = 0;
        int price = 1;
      /*  while (money > price) {
            chocolates++;
            money = money - price;
        }
        System.out.println("I have " + chocolates + " chocolates");*/
        do {
            chocolates++;
            money -=price;
        }
        while (money > price);
        System.out.println("I have " +chocolates);
        int number = 0;
                while (number <5){
                    if (number ==3){
                        number ++;
                        continue;
                    }
                    System.out.println(number);
                    number ++;
                }




        }

    }

