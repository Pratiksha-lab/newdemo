package springx.restexp.newdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

	
	@Autowired
	private IpService repo;
	Product product;
	
	@PostMapping("/add")
	public String Create(@RequestBody Product product)
	{
		repo.save(product);
		return "created successfully";
	}
	@PutMapping("/")
	public String update(@RequestBody Product product)
	{
		repo.save(product);
		return "updated successfully";
	}
	
	@DeleteMapping("product/{id}")
	public String delete(@PathVariable int id)
	{
		repo.deleteById(id);
		return "DELETED successfully";
	}
	
}
