object InsertionSort {

	def sort(args: Array[Int]): Array[Int] = {
		
		for(i <- 1 until args.length) {

			for(j <- i until 0 by -1) {
				
				if(args(j) < args(j-1)) {

					swap(j,j-1,args)

				}

			}

		}

		args

	}

	def swap(i: Int, j: Int, args: Array[Int]): Unit = {

		val temp = args(i)
		args(i) = args(j)
		args(j) = temp
	}
}