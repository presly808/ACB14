package ua.artcode.week4.algo.recursion.dynamic;

/**
 * Created by serhii on 19.11.18.
 */
public class TestDyn {

	public static void main(String[] args) {
		WorkUnit workUnit0 = createUnit(100);

		WorkUnit workUnit11 = createUnit(400);
		WorkUnit workUnit12 = createUnit(400);

		WorkUnit workUnit21 = createUnit(400);
		WorkUnit workUnit22 = createUnit(400);

		WorkUnit workUnit23 = createUnit(400);
		WorkUnit workUnit24 = createUnit(400);



		workUnit0.subWorkers = new WorkUnit[]{workUnit11, workUnit12};

		workUnit11.subWorkers = new WorkUnit[]{workUnit21, workUnit22};
		workUnit12.subWorkers = new WorkUnit[]{workUnit23, workUnit24};

		System.out.println(sumAllRevenue(workUnit0));
	}


	public static int sumAllRevenue(WorkUnit base){
		if(base == null){
			return 0;
		}

		int sum = base.revenue;

		if(base.subWorkers == null || base.subWorkers.length == 0){
			return sum;
		}

		for (int i = 0; i < base.subWorkers.length; i++) {
			sum += sumAllRevenue(base.subWorkers[i]);
		}

		return sum;

	}

	private static WorkUnit createUnit(int revenue) {
		WorkUnit workUnit3 = new WorkUnit();
		workUnit3.revenue = revenue;
		return workUnit3;
	}

	private static class WorkUnit {

		public int revenue;
		public WorkUnit[] subWorkers;

	}

}
