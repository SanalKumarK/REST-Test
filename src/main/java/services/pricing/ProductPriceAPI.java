package services.pricing;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/ProductPrice")
public class ProductPriceAPI {
	
	@GET
	@Path("price")	
	public Long getPrice(@QueryParam("productType") String productType) {
		return 0L;
	}
}
