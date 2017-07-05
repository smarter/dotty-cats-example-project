import cats.{Id, ~>}

sealed trait Op[A]
case object StringOp extends Op[String]
case object IntOp extends Op[Int]

// Fails in IntelliJ: https://youtrack.jetbrains.com/issue/SCL-10844
object Test {
  val x =
    new (Op ~> Id) {
      def apply[R](op: Op[R]): R =
        op match {
          case StringOp => "string"
          case IntOp => 1
        }
    }
}
