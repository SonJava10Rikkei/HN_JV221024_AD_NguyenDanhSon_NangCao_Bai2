import java.util.Stack;
import java.util.Scanner;

public class LichSuTrinhUrl {
    private Stack<String> lichsu;

    public static void main(String[] args) {
        LichSuTrinhUrl lichSuTrinhUrl = new LichSuTrinhUrl();
        Scanner inputUrl = new Scanner(System.in);
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập URL muốn truy cập");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            System.out.print("Mời bạn chọn: ");
            int choice = inputUrl.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập URL muốn truy cập: ");
                    inputUrl.nextLine();
                    String url = inputUrl.nextLine();
                    lichSuTrinhUrl.push(url);
                    break;
                case 2:
                    lichSuTrinhUrl.pop();
                    lichSuTrinhUrl.urlTiepTheo();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập menu (1-3).");
                    break;
            }
            lichSuTrinhUrl.inLichSuUrl();
        }
    }

    public LichSuTrinhUrl() {
        lichsu = new Stack<>();
    }

    public void push(String url) {
        lichsu.push(url);
    }

    public void pop() {
        if (lichsu.isEmpty()) {
            System.out.println("Lịch sử hiện tại đang trống !");
        } else {
            lichsu.pop();
        }
    }

    public void inLichSuUrl() {
        if (lichsu.isEmpty()) {
            System.out.println("Lịch sử hiện tại đang trống không thể in ra. !");
        } else {
            System.out.println("Lịch sử truy cập trên trình duyệt là:");
            for (String url : lichsu) {
                System.out.println(url);
            }
        }
    }

    public void urlTiepTheo() {
        if (lichsu.isEmpty()) {
            System.err.println("Lịch sử hiện tại đang trống mời bạn chọn 1 để nhập thêm Url . ! !");
        } else {
            System.out.println("URL tiếp theo là: " + lichsu.peek());
        }
    }
}