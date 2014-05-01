object Analysis extends App {
	import java.io._
	import QuickSort._
	val worst = new PrintWriter(new File("worst.log"))
	val avg = new PrintWriter(new File("avg.log"))
	val best = new PrintWriter(new File("best.log"))


	//best
	for(i <- 1 to 500000 by 1000) {
		val arr = Array.range(0, i, 100)
		val last = System.nanoTime
		sort(arr)
		val now = System.nanoTime
		best.println(s"$i ${now-last}")
		best.flush
	}

	//avg
	for(i <- 1 to 500000 by 1000) {
		val arr = Array.fill(i/100){scala.util.Random.nextInt(i)} 
		val last = System.nanoTime
		sort(arr)
		val now = System.nanoTime
		avg.println(s"$i ${now-last}")
		avg.flush
	}

	//worst
	for(i <- 1 to 500000 by 1000) {
		val arr = Array.range(i, 0, -100)
		val last = System.nanoTime
		sort(arr)
		val now = System.nanoTime
		worst.println(s"$i ${now-last}")
		worst.flush
	}

	worst.close
	avg.close
	best.close

}
