public class Week5 {
    public static String PriceOfTicket(int x) {
        String result = "";

        if (x < 100) {
            result = "Miễn Phí";
        } else if (x < 120) {
            result = "30000 đồng";
        } else if (x < 140) {
            result = "60000 đồng";
        } else if (x < 300) {
            result = "80000 đồng";
        } else {
            // x < 50 || x > 300
            result = "Chiều cao không hợp lệ. Xin nhập lại";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
