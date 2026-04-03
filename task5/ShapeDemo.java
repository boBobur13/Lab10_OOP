public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red", 5),
            new Rectangle("Blue",4, 6),
            new Triangle("Green", 3,4, 5),
            new Circle("Yellow", 2.5),
            new Rectangle("Purple", 7,3),
            new Triangle("Orange", 5, 5,8)
        };
        for (Shape s :shapes) {
            s.displayInfo();
        }
        Shape largest =findLargest(shapes);
        System.out.println("\nShape with largest area: "+largest.getClass().getSimpleName());
        double totalArea = 0;
        for (Shape s : shapes) totalArea += s.getArea();
        System.out.printf("Total combined area: %.2f\n", totalArea);
    }
    public static Shape findLargest(Shape[] arr) {
        Shape max = arr[0];
        for (int i = 1; i < arr.length;i++) {
            if (arr[i].getArea() > max.getArea()) max =arr[i];
        }
        return max;
    }
}
