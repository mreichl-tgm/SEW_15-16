package conditions;

import java.util.HashMap;

import snake.*;

public class ConditionListener extends HashMap<ConditionList, Condition> {
	private static final long serialVersionUID = 1L;

	public ConditionListener(SnakeList snake, Bird bird, Corn[] corns) {
		this.put(ConditionList.CAUGHT, new Caught(snake, bird));
		this.put(ConditionList.SUICIDE, new Suicide(snake));
		this.put(ConditionList.MAUER_DA, new MauerDa(snake));
		this.put(ConditionList.KORN_DA, new KornDa(snake, corns));
	}
	
}
