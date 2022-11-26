package com.java11to17;
//Why hell we need it
//sealed, permits, non-sealed
sealed  class Intrest permits SA, CA,Invoice{
}
final class SA extends Intrest{
}
sealed class CA extends Intrest permits SmallBusinessCA{
}
final class SmallBusinessCA extends CA{

}
final class CoroprateBusinessCA extends CA{

}
//CA-> SmallBusinessCA, CoroprateBusinessCA
non-sealed class Invoice extends Intrest{
}
//class Dog extends Intrest{
//}

//sealed class A permits B, C, E{
//}
//
//final class B extends A{
//}
//
//non-sealed class C extends  A{
//}
//class  C1 extends C{
//
//}
//sealed class E extends  A permits E1{
//}
//sealed class E1 extends E permits E12{
//}
//final class E12 extends E1{
//
//}
//class D extends  A{
//
//}

public class E_SealedClasses {
    public static void main(String[] args) {

    }
}
