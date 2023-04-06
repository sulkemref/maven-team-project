package week_by_week.week12.java17Examples.sealedExamplesJava17.shape;



public sealed class Shape permits Circle , Square, Triangle, Rectangle{
}

final class Circle extends Shape{

}

final class Square extends Shape{

}

final class Triangle extends Shape{

}

final class Rectangle extends Shape{

}
