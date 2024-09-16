public class Rectangle {
    // Thuộc tính
    private int width;
    private int height;

    // Constructor để khởi tạo các thuộc tính
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Phương thức để tính chu vi
    public int getPerimeter() {
        return 2 * (width + height);
    }

    // Phương thức để tính diện tích
    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng Rectangle với chiều rộng và chiều cao cụ thể
        Rectangle rectangle = new Rectangle(5, 10);

        // Hiển thị kết quả
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
    }
}
