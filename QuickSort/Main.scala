object Main extends App {
	QuickSort.sort(args map(_.toInt)).foreach(println)
}