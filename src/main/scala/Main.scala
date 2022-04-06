import scopt.OptionParser
import problems._

case class Arguments(
    problem: String = "",
    verbose: Boolean = true,
    debug: Boolean = true
)

object Main extends App {
  println("Hello, World!")

  val parser = new OptionParser[Arguments]("Parsing application") {

    opt[String]('n', "problem")
      .required()
      .valueName("")
      .action((value, arguments) => arguments.copy(problem = value))
      .text("Please enter a problem")
  }

  def run(arguments: Arguments): Unit = {
    println(s"Problem: ${arguments.problem}")

    arguments.problem match {
      case "1" => Problem1.run(List(1, 1, 2, 3, 5, 8))
      case "2" => Problem2.run(List(1, 1, 2, 3, 5, 8))
      case _   => println("Problem not found!")
    }
  }

  parser.parse(args, Arguments()) match {
    case Some(arguments) => run(arguments)
    case None            =>
  }
}
