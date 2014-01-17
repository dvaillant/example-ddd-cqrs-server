package example.scrumboard.application.api;

import example.scrumboard.domain.backlog.item.BacklogItemId;
import example.scrumboard.domain.product.ProductId;

public interface ProductService {

	ProductId createProduct(String name);

	BacklogItemId createProductBacklogItem(ProductId productId, String name);

	void reorderProductBacklogItem(ProductId productId, BacklogItemId backlogItemId, int newPosition);

}