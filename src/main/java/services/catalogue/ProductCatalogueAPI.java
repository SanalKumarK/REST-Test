package services.catalogue;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import services.model.Product;

@Path("ProductCatalogue")
public class ProductCatalogueAPI {

	@POST
	@Path("add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Product addProduct(Product product){
		return product;
	}
	

	@GET
	@Path("find")
	@Produces(MediaType.APPLICATION_JSON)
	public Product findProduct(@QueryParam("productType") String productType){
		return new Product();
	}
	
	@DELETE
	@Path("delete")
	@Produces(MediaType.APPLICATION_JSON)
	/*@Consumes(MediaType.APPLICATION_JSON)*/
	public Product deleteProduct(@QueryParam("productType") String productType){
		return new Product();
	}
}
