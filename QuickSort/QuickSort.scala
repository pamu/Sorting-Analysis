object QuickSort {

	def qSort(args: Array[Int], low: Int, high: Int): Unit = {

		val pivot = (low + high)/2

		var i = low
		var j = high

		while(i <= j) {

			while(args(i) < args(j)) {
				i = i + 1
			}

			while(args(j) > args(j)) {
				j = j - 1
			}

			if(i <= j) {
				swap(args, i , j)
				i = i + 1
				j = j - 1
			}

		}

		if(low < j) {
			qSort(args, low, j)
		}

		if(i < high) {
			qSort(args, i, high)
		}

	}

	def sort(args: Array[Int]): Array[Int] = {
		qSort(args, 0, args.length - 1)
		args
	}

	def swap(args: Array[Int], i: Int, j: Int): Unit = {
		val temp = args(i)
		args(i) = args(j)
		args(j) = temp
	}
}