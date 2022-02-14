public class Demo {
    public static void main(String[] args) {
        Book[] listBook = new Book[5];
        listBook[0] = new Book("Tong quan Java", "Tg1", 100, 3, 0.5);
        listBook[1] = new Book("Doi", "Tg2", 50, 50, 0.3);
        listBook[2] = new Book("Dac nhan tam", "Tg3", 97, 2, 0.1);
        listBook[3] = new Book("7 thoi quen hieu qua", "Tg4", 200, 8, 0.9);
        listBook[4] = new Book("Cuoc doi cua Pi", "Tg5", 150, 6, 0.4);

        //Tính tổng số lượng cuốn sách
        int sumQuantity = getSumQuantity(listBook);
        System.out.printf("Tổng số lượng các cuốn sách là: %d", sumQuantity);

        System.out.println();
        //Tính tổng giá các cuốn sách
        int totalPrice = getTotalPrice(listBook);
        System.out.printf("Tổng số tiền các cuốn sách: %d", totalPrice);

        System.out.println();
        //Tính tổng giá các cuốn sách
        double totalWeight = getTotalWeight(listBook);
        System.out.printf("Tổng số tiền các cuốn sách: %f", totalWeight);


    }

    //Phương thức tính tổng các cuốn sách:
    //TenPT: getSumQuantity
    //Tham số: 1 mảng
    //Phần thân:
    //Kiểu dữ liệu trả về: int
    public static int getSumQuantity(Book[] books){
        int totalQuantity = 0;
        for (int i = 0; i < books.length; i++) {
            totalQuantity += books[i].getQuantity();
        }
        return totalQuantity;
    }

    //Tính tổng giá tiền các cuốn sách:
    public static int getTotalPrice(Book[] books){
        int totalPrice = 0;
        for (int i = 0; i < books.length; i++) {
            totalPrice += books[i].getTotalPrice();
        }
        return totalPrice;
    }

    //Tính tổng số lượng cân nặng của các cuốn sách
    public static double getTotalWeight(Book[] books){
        double totalWeight = 0;
        for (int i = 0; i < books.length; i++) {
            totalWeight += books[i].getTotalWeight();
        }
        return totalWeight;
    }
}
