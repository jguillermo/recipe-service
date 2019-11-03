package recipe.service.shared.application;

public interface QueryHandlerBase<C extends QueryBase, R extends AggregateResponseBase> {
	
	public R execute(C query);
	
}
