object Main extends App {
	MergeSort.sort(args.map(_.toInt)).foreach(println)
}