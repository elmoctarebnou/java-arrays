public class TryItOut {
    public static void main(String[] args){
        // Array instantiation
        int[] numbers;
        numbers = new int[8];
        System.out.println(numbers[0]);
        String[] names;
        names = new String[50];
        boolean[] flags;
        flags = new boolean[560];
        numbers[0] = 19;
        numbers[1] = 12;
        numbers[2] = 72;
        numbers[3] = 68;
        numbers[4] = 44;
        numbers[5] = 92;
        numbers[6] = 54;
        numbers[7] = 36;
        int sum = numbers[2] + numbers[4];
        System.out.println(sum);
        System.out.println(numbers.length);
        //Array literal
        String[] players = {"Messi", "Suarez", "Neymare", "Iniesta", "Xavie", "Busquets"};
        System.out.println(players[3]);
        
    }
}
