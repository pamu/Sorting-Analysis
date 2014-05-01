object Main extends App {
	val ints = args.map(elem => elem.toInt)
	InsertionSort.sort(ints).foreach(println)
}