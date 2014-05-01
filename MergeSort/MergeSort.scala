object MergeSort {

	def merge(a: Array[Int], aux: Array[Int], lo: Int, mid: Int, hi: Int): Unit = {

		for(k <- lo to hi){ aux(k) = a(k) }

		var i = lo
		var j = mid + 1

		for(k <- lo to hi ) {

			if(i > mid)	{

				a(k) = aux(j)
				j = j + 1

			}else if(j > hi) {

				a(k) = aux(i)
				i = i + 1

			}else if(aux(j) < aux(i)) {

				a(k) = aux(j)
				j = j + 1

			}else {

				a(k) = aux(i)
				i = i + 1

			}
		}

	}

	def msort(a: Array[Int], aux: Array[Int], lo: Int, hi: Int): Unit = {
		if(hi <= lo) return;
		val mid = (lo + hi) /2
		msort(a, aux, lo, mid)
		msort(a, aux, mid + 1, hi)
		merge(a, aux, lo, mid, hi)
	}

	def sort(args: Array[Int]): Array[Int] = {
		val aux:Array[Int] = Array.ofDim(args.length)
		msort(args, aux, 0 , args.length - 1)
		args
	}


}