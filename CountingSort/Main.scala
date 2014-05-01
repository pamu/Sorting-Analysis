object Main extends App {
	CountingSort.sort(args.map(_.toInt)).foreach(println)
}