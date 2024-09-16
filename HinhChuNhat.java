public class HinhChuNhat {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Vui lòng nhập chiều rộng và chiều cao!");
            return;
        }

        try {
            int chieuRong = Integer.parseInt(args[0]);
            int chieuCao = Integer.parseInt(args[1]);

            if (chieuRong <= 0 || chieuCao <= 0) {
                System.out.println("Chiều rộng và chiều cao phải là các số nguyên dương!");
                return;
            }

            int chuVi = 2 * (chieuRong + chieuCao);
            int dienTich = chieuRong * chieuCao;

            System.out.println("Chu vi hình chữ nhật: " + chuVi);
            System.out.println("Diện tích hình chữ nhật: " + dienTich);

        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập các số nguyên hợp lệ!");
        }
    }
}


