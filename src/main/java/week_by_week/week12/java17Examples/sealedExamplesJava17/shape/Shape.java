package week_by_week.week12.java17Examples.sealedExamplesJava17.shape;



public sealed class Shape permits Circle, Pyramid, Rectangle, Square, Triangle {
}

final class Circle extends Shape{

}

final class Square extends Shape{

}

final class Triangle extends Shape{

}

final class Rectangle extends Shape{

}

final class Pyramid extends Shape{

}
