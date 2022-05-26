import shapes.Circle;
import shapes.Square;

import java.util.*;

public class CollectionsLecture {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
      //  ArrayList<Integer> collectionOfNums = new ArrayList<>();

        ArrayList<Integer> collectionOfNums = new ArrayList<>(Arrays.asList(numbers[0], numbers[1], numbers[2], numbers[3]));

        collectionOfNums.add(16);
        collectionOfNums.add(23);
        collectionOfNums.add(76);
        collectionOfNums.add(34);


//        for(Integer num : collectionOfNums) {
//            System.out.println(num);
//        }
//
//        System.out.println(numbers);
//        System.out.println(collectionOfNums);

//        System.out.println(collectionOfNums.contains(23));

        List<Square> squares = new ArrayList<>();
        Square specialOne = new Square(4);
        squares.add(specialOne);
//        System.out.println(squares.contains(specialOne));
        squares.add(new Square(8));
//        System.out.println(squares.contains(new Square(8)));

        for(Square square : squares) {
            if(square.getLength() == 8) {
//                System.out.println("true, Square found with a side length of 8");
            }
        }

//        System.out.println(squares.get(1).getLength());
//        System.out.println(squares);
//        System.out.println(specialOne);

//        System.out.println(squares.indexOf(specialOne));
        Square outsider = new Square(5);
//        System.out.println(squares.indexOf(outsider));

        ArrayList<String> names =  new ArrayList<>();
        names.add("Cory");
        names.add("Beatrice");

//        if(names.isEmpty()) {
//            System.out.println("Hey, there are no names here");
//        } else {
//            System.out.println("Cool names");
//        }

//        boolean resultOfRemove = names.remove("Beatrice");
//        System.out.println(resultOfRemove);

        boolean didWeRemoveThatSquare = squares.remove(new Square(8));
//        System.out.println(didWeRemoveThatSquare);

        Square thatOneWithLengthOfEight = squares.remove(1);

        squares.set(0, thatOneWithLengthOfEight);
//        System.out.println(squares);

        HashMap<Character, Circle> circles = new HashMap<>();
        circles.put('A', new Circle(3));
        Circle specialCircle = new Circle(6);
        circles.put('B', specialCircle);
//        System.out.println(circles);
        circles.putIfAbsent('B', new Circle(9.99));
//        System.out.println(circles);
        circles.putIfAbsent('C', specialCircle);
        circles.putIfAbsent('D', specialCircle);
//        System.out.println(circles);
        circles.put('M', new Circle(3.14));
        circles.put('E', new Circle(5.14));
        circles.put('P', new Circle(7.34));
//        System.out.println(circles);

        Set<Character> keysFromCircles = circles.keySet();
//        System.out.println(keysFromCircles);

        for(char key : keysFromCircles) {
//            System.out.println(circles.get(key).getArea());
        }

        System.out.println(circles.containsKey('P'));
        System.out.println(circles.containsKey(specialCircle));



    }
}
