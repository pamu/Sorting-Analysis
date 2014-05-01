object Main extends App {
	HeapSort.sort(args.map(_.toInt)).foreach(println)
}